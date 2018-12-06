package cn.v1.evc.cec.factory;

import cn.v1.evc.cec.base.CecData;
import cn.v1.evc.cec.base.CecUtil;
import cn.v1.evc.cec.data.*;

/**
 * @Auther: wr
 * @Date: 2018/12/6
 * @Description: 定义中电联请求
 */
public abstract class AbstractCecQuery<T> extends AbstractBaseQuery {
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

    private CecData cecData = CecUtil.getCecData(getCecCode());

    public abstract String getCecCode();

    public abstract Class getTClass();

    //定义访问地址前缀，防止被污染
    private final String prefix = cecData.getUrl();

    private void setCecData(CecData cecData) {
        this.cecData = cecData;
    }

    @Override
    public String getCode() {
        return getCecCode();
    }

    @Override
    public CecData getCecData() {
        return cecData;
    }

    /**
     * 查询运营商充电站信息
     */
    public ResData<T> queryStation(ReqStation reqStation){
        cecData.setUrl(prefix+SUFFIX_QUERY_STATION_INFO);
        cecData.setData(reqStation);
        setCecData(cecData);
        return super.query(getTClass());
    }

    /**
     * 查询二维码枪号
     */
    public ResData<ResTerminalCode> queryTerminalCode(ReqTerminalCode reqTerminalCode){
        cecData.setUrl(prefix+SUFFIX_QUERY_TERMINAL_CODE);
        cecData.setData(reqTerminalCode);
        setCecData(cecData);
        return super.query(ResTerminalCode.class);
    }

    /**
     * 请求设备认证
     */
    public ResData<ResEquipAuth> queryEquipAuth(ReqEquipAuth reqEquipAuth){
        //生成流水号
        reqEquipAuth.setEquipAuthSeq(CecUtil.UniqueSeqNo(cecData));
        cecData.setUrl(prefix+SUFFIX_QUERY_EQUIP_AUTH);
        cecData.setData(reqEquipAuth);
        setCecData(cecData);
        return super.query(ResEquipAuth.class);
    }

    /**
     * 查询业备策略信息
     */
    public ResData<ResEquipBusinessPolicy> queryEquipBusinessPolicy(ReqEquipBusinessPolicy reqEquipBusinessPolicy){
        cecData.setUrl(prefix+SUFFIX_QUERY_EQUIP_BUSINESS_POLICY);
        //生成流水号
        reqEquipBusinessPolicy.setEquipBizSeq(CecUtil.UniqueSeqNo(cecData));
        cecData.setData(reqEquipBusinessPolicy);
        setCecData(cecData);
        return super.query(ResEquipBusinessPolicy.class);
    }

    /**
     * 请求启动充电
     */
    public ResData<ResStartCharge> queryStartCharge(ReqStartCharge reqStartCharge){
        cecData.setUrl(prefix+SUFFIX_QUERY_START_CHARGE);
        //生成流水号
        reqStartCharge.setStartChargeSeq(CecUtil.UniqueSeqNo(cecData));
        cecData.setData(reqStartCharge);
        setCecData(cecData);
        return super.query(ResStartCharge.class);
    }

    /**
     * 请求停止充电
     */
    public ResData<ResStopCharge> queryStopCharge(ReqStopCharge reqStopCharge){
        cecData.setUrl(prefix+SUFFIX_QUERY_STOP_CHARGE);
        cecData.setData(reqStopCharge);
        setCecData(cecData);
        return super.query(ResStopCharge.class);
    }
}
