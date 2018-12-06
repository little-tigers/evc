package cn.v1.evc.cec.factory;

import cn.v1.evc.cec.base.CecData;
import cn.v1.evc.cec.base.CecUtil;
import cn.v1.evc.cec.data.*;
import cn.v1.evc.cec.token.CecToken;
import cn.v1.evc.cec.util.StringUtil;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 定义中电联请求
 */
@Deprecated
public abstract class AbstractCecQuery1<T> {

    //查询充电站信息
    private static final String SUFFIX_QUERY_STATION_INFO = "query_stations_info";

    //查询充电枪号
    private static final String SUFFIX_QUERY_TERMINAL_CODE = "query_terminal_code";

    //设备认证
    private static final String SUFFIX_QUERY_EQUIP_AUTH = "query_equip_auth";

    //查询业备策略信息
    private static final String SUFFIX_QUERY_EQUIP_BUSINESS_POLICY = "query_equip_business_policy";

    //启动充电
    private static final String SUFFIX_QUERY_START_CHARGE = "query_start_charge";

    //停止充电
    private static final String SUFFIX_QUERY_STOP_CHARGE = "query_stop_charge";

    //定义运营商，从CecCodeEnum类中取值

    public abstract String getCecCode();

    public abstract Class getTClass();

    private CecData cecData = CecUtil.getCecData(getCecCode());

    //定义访问地址前缀，防止被污染
    private final String prefix = cecData.getUrl();

    /**
     * 查询运营商充电站信息
     *
     * @param reqStation
     * @return
     */
    public ResData<T> queryStation(ReqStation reqStation){
        //获取token
        String token = CecToken.getAccessToken(getCecCode());
        if (StringUtil.isNotBlank(token) && cecData != null) {
            cecData.setUrl(prefix+SUFFIX_QUERY_STATION_INFO);
            cecData.setData(reqStation);
            return CecUtil.parseObject(cecData,token,getTClass());
        }
        return null;
    }

    /**
     * 查询二维码枪号
     */
    public ResData<ResTerminalCode> queryTerminalCode(ReqTerminalCode reqTerminalCode){
        //获取token
        String token = CecToken.getAccessToken(getCecCode());
        if (StringUtil.isNotBlank(token) && cecData != null) {
            cecData.setUrl(prefix+SUFFIX_QUERY_TERMINAL_CODE);
            cecData.setData(reqTerminalCode);
            return CecUtil.parseObject(cecData, token, ResTerminalCode.class);
        }
        return null;
    }

    /**
     * 请求设备认证
     */
    public ResData<ResEquipAuth> queryEquipAuth(ReqEquipAuth reqEquipAuth){
        //获取token
        String token = CecToken.getAccessToken(getCecCode());
        if (StringUtil.isNotBlank(token) && cecData != null) {
            //生成流水号
            reqEquipAuth.setEquipAuthSeq(CecUtil.UniqueSeqNo(cecData));
            cecData.setUrl(prefix+SUFFIX_QUERY_EQUIP_AUTH);
            cecData.setData(reqEquipAuth);
            return CecUtil.parseObject(cecData, token, ResEquipAuth.class);
        }
        return null;
    }

    /**
     * 查询业备策略信息
     */
    public ResData<ResEquipBusinessPolicy> queryEquipBusinessPolicy(ReqEquipBusinessPolicy reqEquipBusinessPolicy){
        //获取token
        String token = CecToken.getAccessToken(getCecCode());
        if (StringUtil.isNotBlank(token) && cecData != null) {
            //生成流水号
            reqEquipBusinessPolicy.setEquipBizSeq(CecUtil.UniqueSeqNo(cecData));
            cecData.setUrl(prefix+SUFFIX_QUERY_EQUIP_BUSINESS_POLICY);
            cecData.setData(reqEquipBusinessPolicy);
            return CecUtil.parseObject(cecData, token, ResEquipBusinessPolicy.class);
        }
        return null;
    }

    /**
     * 请求启动充电
     */
    public ResData<ResStartCharge> queryStartCharge(ReqStartCharge reqStartCharge){
        //获取token
        String token = CecToken.getAccessToken(getCecCode());
        if (StringUtil.isNotBlank(token) && cecData != null) {
            //生成流水号
            reqStartCharge.setStartChargeSeq(CecUtil.UniqueSeqNo(cecData));
            cecData.setUrl(prefix+SUFFIX_QUERY_START_CHARGE);
            cecData.setData(reqStartCharge);
            return CecUtil.parseObject(cecData, token, ResStartCharge.class);
        }
        return null;
    }

    /**
     * 请求停止充电
     */
    public ResData<ResStopCharge> queryStopCharge(ReqStopCharge reqStopCharge){
        //获取token
        String token = CecToken.getAccessToken(getCecCode());
        if (StringUtil.isNotBlank(token) && cecData != null) {
            cecData.setUrl(prefix+SUFFIX_QUERY_STOP_CHARGE);
            cecData.setData(reqStopCharge);
            return CecUtil.parseObject(cecData, token, ResStopCharge.class);
        }
        return null;
    }
}
