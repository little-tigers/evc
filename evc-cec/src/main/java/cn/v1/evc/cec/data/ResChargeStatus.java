package cn.v1.evc.cec.data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wr
 * on 2018/11/23
 */
public class ResChargeStatus implements Serializable {

    private static final long serialVersionUID = 275935555721650765L;

    private String startChargeSeq; //充电订单号

    private Integer startChargeSeqStat; //充电订单状态(1:启动中/2:充电中/3:停止中/4:已结束/5:未知)

    private String connectorId; //充电设备接口编码

    private Integer connectorStatus; //充电设备状态(1:空闲/2:占用(未充电)/3:占用(充电中)/4:占用(预约锁定)/255:故障)

    private Double currentA; //A相电流

    private Double currentB; //B相电流

    private Double currentC; //C相电流

    private Double voltageA; //A相电压

    private Double voltageB; //B相电压

    private Double voltageC; //C相电压

    private Double soc;  //电池剩余电量

    private String startTime; //开始充电时间

    private String endTime;  //结束充电时间

    private Double totalPower; //累计充电量

    private Double elecMoney;  //累计充电费用

    private Double seviceMoney; //累计服务费用

    private Double totalMoney;  //累计总金额

    private Integer sumPeriod; // 时间段数N（0~32）

    private List<ResChargeDetails> chargeDetails; //充电明细

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

    public Integer getConnectorStatus() {
        return connectorStatus;
    }

    public void setConnectorStatus(Integer connectorStatus) {
        this.connectorStatus = connectorStatus;
    }

    public Double getCurrentA() {
        return currentA;
    }

    public void setCurrentA(Double currentA) {
        this.currentA = currentA;
    }

    public Double getCurrentB() {
        return currentB;
    }

    public void setCurrentB(Double currentB) {
        this.currentB = currentB;
    }

    public Double getCurrentC() {
        return currentC;
    }

    public void setCurrentC(Double currentC) {
        this.currentC = currentC;
    }

    public Double getVoltageA() {
        return voltageA;
    }

    public void setVoltageA(Double voltageA) {
        this.voltageA = voltageA;
    }

    public Double getVoltageB() {
        return voltageB;
    }

    public void setVoltageB(Double voltageB) {
        this.voltageB = voltageB;
    }

    public Double getVoltageC() {
        return voltageC;
    }

    public void setVoltageC(Double voltageC) {
        this.voltageC = voltageC;
    }

    public Double getSoc() {
        return soc;
    }

    public void setSoc(Double soc) {
        this.soc = soc;
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

    public Double getElecMoney() {
        return elecMoney;
    }

    public void setElecMoney(Double elecMoney) {
        this.elecMoney = elecMoney;
    }

    public Double getSeviceMoney() {
        return seviceMoney;
    }

    public void setSeviceMoney(Double seviceMoney) {
        this.seviceMoney = seviceMoney;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getSumPeriod() {
        return sumPeriod;
    }

    public void setSumPeriod(Integer sumPeriod) {
        this.sumPeriod = sumPeriod;
    }

    public List<ResChargeDetails> getChargeDetails() {
        return chargeDetails;
    }

    public void setChargeDetails(List<ResChargeDetails> chargeDetails) {
        this.chargeDetails = chargeDetails;
    }
}
