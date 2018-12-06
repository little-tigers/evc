package cn.v1.evc.cec.data.push;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/24
 * @Description: 推送充电启动结果
 */
public class PushStartCharge implements Serializable {

    private static final long serialVersionUID = -9071052677867539907L;

    private String startChargeSeq; //充电订单号

    private Integer startChargeSeqStat; //充电订单状态(1:启动中/2:充电中/3:停止中/4:已结束/5:未知)

    private String connectorId; //充电设备接口编码

    private String startTime; //充电启动时间

    private String identCode; //停止充电验证码

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }

    public Integer getStartChargeSeqStat() {
        return startChargeSeqStat;
    }

    public void setStartChargeSeqStat(Integer startChargeSeqStat) {
        this.startChargeSeqStat = startChargeSeqStat;
    }

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getIdentCode() {
        return identCode;
    }

    public void setIdentCode(String identCode) {
        this.identCode = identCode;
    }
}
