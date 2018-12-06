package cn.v1.evc.cec.data.push;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/27
 * @Description: 推送订单信息
 */
public class PushChargeOrderInfo implements Serializable {

    private static final long serialVersionUID = -8526988018318021553L;

    private String startChargeSeq; //充电订单号

    private String connectorId; //充电设备接口编码

    private String startTime; //开始充电时间

    private String endTime;  //结束充电时间

    private Double totalPower; //累计充电量

    private Double totalElecMoney; //总电费

    private Double totalSeviceMoney; //总服务费

    private Double totalMoney;  //累计总金额

    private Integer stopReason; //充电结束原因

    private Integer sumPeriod; // 时间段数N（0~32）

    private List<PushChargeDetails> chargeDetails;

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
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

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(Double totalPower) {
        this.totalPower = totalPower;
    }

    public Double getTotalElecMoney() {
        return totalElecMoney;
    }

    public void setTotalElecMoney(Double totalElecMoney) {
        this.totalElecMoney = totalElecMoney;
    }

    public Double getTotalSeviceMoney() {
        return totalSeviceMoney;
    }

    public void setTotalSeviceMoney(Double totalSeviceMoney) {
        this.totalSeviceMoney = totalSeviceMoney;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getStopReason() {
        return stopReason;
    }

    public void setStopReason(Integer stopReason) {
        this.stopReason = stopReason;
    }

    public Integer getSumPeriod() {
        return sumPeriod;
    }

    public void setSumPeriod(Integer sumPeriod) {
        this.sumPeriod = sumPeriod;
    }

    public List<PushChargeDetails> getChargeDetails() {
        return chargeDetails;
    }

    public void setChargeDetails(List<PushChargeDetails> chargeDetails) {
        this.chargeDetails = chargeDetails;
    }
}
