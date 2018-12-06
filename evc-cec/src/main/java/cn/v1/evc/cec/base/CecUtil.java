package cn.v1.evc.cec.base;

import cn.v1.evc.cec.data.ReqData;
import cn.v1.evc.cec.data.ResData;
import cn.v1.evc.cec.data.push.PushData;
import cn.v1.evc.cec.util.*;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description:
 */
public class CecUtil {

    private static Logger logger = LoggerFactory.getLogger(CecUtil.class);

    public static CecData getCecData(String cecCode) {

        String url = CecPropertiesUtil.getProperty(cecCode + "_URL").trim();

        String operatorId = CecPropertiesUtil.getProperty(cecCode + "_OPERATOR_ID").trim();

        String operatorSecret = CecPropertiesUtil.getProperty(cecCode + "_OPERATOR_SECRET").trim();

        String dataSecret = CecPropertiesUtil.getProperty(cecCode + "_DATA_SECRET").trim();

        String dataSecretIv = CecPropertiesUtil.getProperty(cecCode + "_DATA_SECRET_IV").trim();

        String signSecret = CecPropertiesUtil.getProperty(cecCode + "_SIGN_SECRET").trim();

        if (StringUtil.isBlank(url)
                || StringUtil.isBlank(operatorId)
                || StringUtil.isBlank(operatorSecret)
                || StringUtil.isBlank(dataSecret)
                || StringUtil.isBlank(dataSecretIv)
                || StringUtil.isBlank(signSecret)) {
            throw new NullPointerException("缺失必要的请求参数");
        }
        return new CecData(url,operatorId,operatorSecret,dataSecret,dataSecretIv,signSecret);

    }

    //生成流水号 格式”运营商ID+唯一编号“，27字符,唯一编号(随机数加时间戳)
    public static String UniqueSeqNo(CecData cecData) {
        //自定义4位数字流水号
        String seq = RandomUtils.randomNumber(4);
        //当前时间戳
        String timestamp = SimpleDateUtil.convert2String(SimpleDateUtil.curTimeMillis(), SimpleDateUtil.TIME_FORMAT);
        return cecData.getOperatorID() + timestamp + seq;
    }

    public static String encryptData(CecData cecData) {
        //自定义4位数字流水号
        String seq = RandomUtils.randomNumber(4);
        //当前时间戳
        String timestamp = SimpleDateUtil.convert2String(SimpleDateUtil.curTimeMillis(), SimpleDateUtil.TIME_FORMAT);
        try {
            //AES加密
            byte[] bytes = AESUtil.encryptCBC(JSONObject.toJSONString(cecData.getData()), cecData.getDataSecret(), cecData.getDataSecretIv());
            String data = new Base64().encodeAsString(bytes);
            //拼接字符串
            String str = cecData.getOperatorID() + data + timestamp + seq;
            //签名 HMAC加密
            String sign = HMACMD5Util.encryptHMAC(str, cecData.getSignSecret());
            return JSONObject.toJSONString(
                    new ReqData(cecData.getOperatorID(), data, timestamp, seq, sign));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    //加密data
    public static String encryptDataStr(CecData cecData) {
        //AES加密
        try {
            byte[] bytes = AESUtil.encryptCBC(JSONObject.toJSONString(cecData.getData()), cecData.getDataSecret(), cecData.getDataSecretIv());
            return new Base64().encodeAsString(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String getSign(CecData cecData){
        //自定义4位数字流水号
        String seq = RandomUtils.randomNumber(4);
        //当前时间戳
        String timestamp = SimpleDateUtil.convert2String(SimpleDateUtil.curTimeMillis(), SimpleDateUtil.TIME_FORMAT);
        try {
            //AES加密
            byte[] bytes = AESUtil.encryptCBC(JSONObject.toJSONString(cecData.getData()), cecData.getDataSecret(), cecData.getDataSecretIv());
            String data = new Base64().encodeAsString(bytes);
            //拼接字符串
            String str = cecData.getOperatorID() + data + timestamp + seq;
            //签名 HMAC加密
            return HMACMD5Util.encryptHMAC(str, cecData.getSignSecret());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static JSONObject decryptData(CecData cecData, String str) {
        if (StringUtils.isNotBlank(str)) {
            try {
                byte[] resultByte = new Base64().decode(str);
                String resultStr = new String(AESUtil.DecryptCBC(resultByte, cecData.getDataSecret(),
                        cecData.getDataSecretIv()), "utf-8");
                return JSONObject.parseObject(resultStr);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static ResData parseObject(CecData cecData, String token, Class zClass){
        //数据加密
        String dataJson = CecUtil.encryptData(cecData);
        //发送请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl(), dataJson, token);
        return toBean(object, cecData, zClass);
    }

    public static ResData parseObject(CecData cecData, Class zClass){
        //数据加密
        String dataJson = CecUtil.encryptData(cecData);
        //发送请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl(), dataJson);
        return toBean(object,cecData,zClass);
    }

    /*验签*/
    public static boolean checkSign(PushData pushData,CecData cecData){
        if(pushData!= null){
            //
            String str = cecData.getOperatorID() +
                    pushData.getData() +
                    pushData.getTimeStamp() +
                    pushData.getSeq();
            String sign = HMACMD5Util.encryptHMAC(str, cecData.getSignSecret());
            if(sign.equals(pushData.getSig())){
                return true;
            }
        }
        return false;
    }

    private static  ResData toBean(JSONObject object, CecData cecData, Class zClass){
        if(object != null){
            ResData resData = object.toJavaObject(ResData.class);
            if("0".equals(resData.getRet())){
                String dataStr = object.getString("Data");
                if(StringUtil.isNotBlank(dataStr)){
                    //解密data,获取token字符串
                    JSONObject str =decryptData(cecData,dataStr);
                    logger.info("获取解密的data: json数据={}",str);
                    resData.setData(str.toJavaObject(zClass));
                }
            }
            return resData;
        }
        return null;
    }
}
