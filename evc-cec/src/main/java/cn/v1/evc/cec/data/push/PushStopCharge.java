package cn.v1.evc.cec.data.push;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/27
 * @Description:
 */
public class PushStopCharge implements Serializable {

    private static final long serialVersionUID = 8677045131297964318L;

    private String startChargeSeq; //充电订单号

    private String connectorID; //充电设备编码

    private Integer startChargeSeqStat; //充电订单状态(1:启动中/2:充电中/3:停止中/4:已结束/5:未知)

    private Integer succStat; //操作结果 0成功，1失败

    private Integer failReason; //失败原因 1:此设备不存在，2：此设备离线，3：已停止充电, 4-99自定义

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }

    public String getConnectorID() {
        return connectorID;
    }

    public void setConnectorID(String connectorID) {
        this.connectorID = connectorID;
    }

    public Integer getStartChargeSeqStat() {
        return startChargeSeqStat;
    }

    public void setStartChargeSeqStat(Integer startChargeSeqStat) {
        this.startChargeSeqStat = startChargeSeqStat;
    }

    public Integer getSuccStat() {
        return succStat;
    }

    public void setSuccStat(Integer succStat) {
        this.succStat = succStat;
    }

    public Integer getFailReason() {
        return failReason;
    }

    public void setFailReason(Integer failReason) {
        this.failReason = failReason;
    }
}
