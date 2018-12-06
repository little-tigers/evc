package cn.v1.evc.service;


import cn.v1.evc.cec.data.*;

/**
 * Created by wr
 * on 2018/8/23
 *
 * 充电对接接口
 */
public interface EvChargeService {

    <T> ResData<T> queryStation(ReqStation reqStation);

    ResData<ResTerminalCode> queryTerminalCode(ReqTerminalCode reqTerminalCode);

    ResData<ResEquipAuth> queryEquipAuth(ReqEquipAuth reqEquipAuth);

    ResData<ResEquipBusinessPolicy> queryEquipBusinessPolicy(ReqEquipBusinessPolicy reqEquipBusinessPolicy);

    ResData<ResStartCharge> queryStartCharge(ReqStartCharge reqStartCharge);

    ResData<ResStopCharge> queryStopCharge(ReqStopCharge reqStopCharge);

}
