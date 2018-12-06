package cn.v1.evc.cec.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 请求启动充电 (Res代表返参)
 */
public class ResStartCharge implements Serializable {

    private static final long serialVersionUID = -1567433114977763861L;

    private String startChargeSeq; //充电订单号

    private Integer succStat; //请求状态 1:启动中，2：充电中,3：停止中，4：已结束，5：未知

    private Integer startChargeStat; //充电订单状态

    private Integer failReason;  //失败原因 1:此设备不存在，2：此设备离线，3-99自定义

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }

    public Integer getSuccStat() {
        return succStat;
    }

    public void setSuccStat(Integer succStat) {
        this.succStat = succStat;
    }

    public Integer getStartChargeStat() {
        return startChargeStat;
    }

    public void setStartChargeStat(Integer startChargeStat) {
        this.startChargeStat = startChargeStat;
    }

    public Integer getFailReason() {
        return failReason;
    }

    public void setFailReason(Integer failReason) {
        this.failReason = failReason;
    }
}
