package cn.v1.evc.service.core;

import cn.v1.evc.cec.base.CecData;
import cn.v1.evc.cec.base.CecUtil;
import cn.v1.evc.cec.util.HttpClientUtil;
import cn.v1.evc.hn.data.*;
import cn.v1.evc.hn.token.EvHnToken;
import cn.v1.evc.service.HnChargeService;
import cn.v1.evc.util.FastJsonUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description:
 */
@Service(value = "hnChargeService")
public class HnChargeServiceImpl implements HnChargeService {

    private static CecData cecData = CecUtil.getCecData("HN");

    private static final String SUFFIX_QUERY_MONEY = "money";

    private static final String SUFFIX_QUERY_QRDECODE = "qrDecode";

    private static final String SUFFIX_QUERY_CAN_CHARGE = "canCharge";

    private static final String SUFFIX_QUERY_START = "start";

    private static final String SUFFIX_QUERY_UPDATE_BALANCE = "updateBalance";

    private static final String SUFFIX_QUERY_STOP = "stop";

    private static final String SUFFIX_QUERY_CHARGE = "charge";

    public ResHnData<ResMoney> queryMoney() {
        ReqHnData<ReqMoney> reqData = new ReqHnData();
        //获取token
        reqData.setToken(EvHnToken.getAccessToken());
        reqData.setAction("RequestMoney");
        reqData.setData(new ReqMoney(EvHnToken.getSeq()));
        String reqJson = JSONObject.toJSONString(reqData);
        //发送post请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl() + SUFFIX_QUERY_MONEY, reqJson);
        if(object != null){
            return FastJsonUtils.parseObject(object.toJSONString(),ResMoney.class);
        }
        return null;
    }

    /**
     * 请求充电桩二维码解析
     *
     * @param qrCode 二维地址
     * @return
     */
    public ResHnData<ResQRDecode> queryQRDecode(String qrCode) {
        ReqHnData<ReqQRDecode> reqData = new ReqHnData();
        //获取token
        reqData.setToken(EvHnToken.getAccessToken());
        reqData.setAction("RequestQRDecode");
        reqData.setData(new ReqQRDecode(EvHnToken.getSeq(),qrCode));
        String reqJson = JSONObject.toJSONString(reqData);
        //发送post请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl() + SUFFIX_QUERY_QRDECODE, reqJson);
        if(object != null){
            return FastJsonUtils.parseObject(object.toJSONString(),ResQRDecode.class);
        }
        return null;
    }

    /**
     * 请求能否充电
     *
     * @param pid 充电桩 ID
     * @return
     */
    public ResHnData<ResCanCharge> queryCanCharge(String pid) {
        ReqHnData<ReqCanCharge> reqData = new ReqHnData();
        //获取token
        reqData.setToken(EvHnToken.getAccessToken());
        reqData.setAction("RequestCanCharge");
        reqData.setData(new ReqCanCharge(EvHnToken.getSeq(),pid));
        String reqJson = JSONObject.toJSONString(reqData);
        //发送post请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl() + SUFFIX_QUERY_CAN_CHARGE, reqJson);
        if(object != null){
            return FastJsonUtils.parseObject(object.toJSONString(),ResCanCharge.class);
        }
        return null;
    }


    /**
     * 请求充电
     * @param reqStart
     * @return
     */

    public ResHnData<ResStart> doStart(ReqStart reqStart) {
        ReqHnData<ReqStart> reqData = new ReqHnData();
        //获取token
        reqData.setToken(EvHnToken.getAccessToken());
        reqData.setAction("RequestStart");
        reqData.setData(reqStart);
        String reqJson = JSONObject.toJSONString(reqData);
        //发送post请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl() + SUFFIX_QUERY_START, reqJson);
        if(object != null){
            return FastJsonUtils.parseObject(object.toJSONString(),ResStart.class);
        }
        return null;
    }

    /**
     * 请求充电额度更新
     * @param setBalance 对象（pid,startChargeSeq,balance）
     * @return
     */
    public ResHnData<ResSetBalance> setBalance(ReqSetBalance setBalance) {
        ReqHnData<ReqSetBalance> reqData = new ReqHnData();
        //获取token
        reqData.setToken(EvHnToken.getAccessToken());
        reqData.setAction("RequestUpdateBalance");
        reqData.setData(setBalance);
        String reqJson = JSONObject.toJSONString(reqData);
        //发送post请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl() + SUFFIX_QUERY_UPDATE_BALANCE, reqJson);
        if(object != null){
            return FastJsonUtils.parseObject(object.toJSONString(),ResSetBalance.class);
        }
        return null;
    }

    /**
     * 请求停止充电
     * @param stop 对象（pid,startChargeSeq）
     * @return
     */
    public ResHnData<ResStop> doStop(ReqStop stop) {
        ReqHnData<ReqStop> reqData = new ReqHnData();
        //获取token
        reqData.setToken(EvHnToken.getAccessToken());
        reqData.setAction("RequestStop");
        reqData.setData(stop);
        String reqJson = JSONObject.toJSONString(reqData);
        //发送post请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl() + SUFFIX_QUERY_STOP, reqJson);
        if(object != null){
            return FastJsonUtils.parseObject(object.toJSONString(),ResStop.class);
        }
        return null;
    }

    /**
     * 获取充电状态数据
     * @param charge 对象（pid,startChargeSeq）
     * @return
     */
    public ResHnData<ResCharge> getChargeData(ReqCharge charge) {
        ReqHnData<ReqCharge> reqData = new ReqHnData();
        //获取token
        reqData.setToken(EvHnToken.getAccessToken());
        reqData.setAction("RequestCharge");
        reqData.setData(charge);
        String reqJson = JSONObject.toJSONString(reqData);
        //发送post请求
        JSONObject object = HttpClientUtil.httpPost(cecData.getUrl() + SUFFIX_QUERY_CHARGE, reqJson);
        if(object != null){
            return FastJsonUtils.parseObject(object.toJSONString(),ResCharge.class);
        }
        return null;
    }
}
