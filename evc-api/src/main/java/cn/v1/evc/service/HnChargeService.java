package cn.v1.evc.service;


import cn.v1.evc.hn.data.*;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description: 汇能充电接口
 */
public interface HnChargeService {

    ResHnData<ResMoney> queryMoney();

    ResHnData<ResQRDecode> queryQRDecode(String qrCode);

    ResHnData<ResCanCharge> queryCanCharge(String pid);

    ResHnData<ResStart> doStart(ReqStart reqStart);

    ResHnData<ResSetBalance> setBalance(ReqSetBalance setBalance);

    ResHnData<ResStop> doStop(ReqStop stop);

    ResHnData<ResCharge> getChargeData(ReqCharge charge);
}
