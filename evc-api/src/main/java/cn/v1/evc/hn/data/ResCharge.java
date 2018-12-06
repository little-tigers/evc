package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/15
 * @Description: 请求充电数据返回data
 */
public class ResCharge implements Serializable {

    private static final long serialVersionUID = -3076164024301162827L;

    private String startChargeSeq; //充电桩 ID

    private String pid; //充电的流水号

    private Long rid; //平台定义的充电记录 ID

    private Double soc;  //电池剩余电量，取值 0~1

    private Double[] voltage; //充电时的输出电压

    private Double[] current; //充电时的输出电流

    private Double chargeEnergy;  //充电电能， 即已充电的度数

    private Integer duration; //充电时长，单位秒，整型

    private Double money;  //充电消费金额，单位元。

    private Integer started; //充电是否开始，1-开始，0-未开始

    private Long startTime;  //充电开始时间，Unix 时间戳

    private Integer stoped; //充电是否停止，1-停止，0-未停止,

    private Long stopTime;  //充电停止时间，Unix 时间戳

    private Integer stopReason; //停止充电原因

    private Integer ended; //充电流程是否结束，1-结束，0-未结束

    private Long endTime;  //充电结束时间，Unix 时间戳

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Double getSoc() {
        return soc;
    }

    public void setSoc(Double soc) {
        this.soc = soc;
    }

    public Double[] getVoltage() {
        return voltage;
    }

    public void setVoltage(Double[] voltage) {
        this.voltage = voltage;
    }

    public Double[] getCurrent() {
        return current;
    }

    public void setCurrent(Double[] current) {
        this.current = current;
    }

    public Double getChargeEnergy() {
        return chargeEnergy;
    }

    public void setChargeEnergy(Double chargeEnergy) {
        this.chargeEnergy = chargeEnergy;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getStarted() {
        return started;
    }

    public void setStarted(Integer started) {
        this.started = started;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Integer getStoped() {
        return stoped;
    }

    public void setStoped(Integer stoped) {
        this.stoped = stoped;
    }

    public Long getStopTime() {
        return stopTime;
    }

    public void setStopTime(Long stopTime) {
        this.stopTime = stopTime;
    }

    public Integer getStopReason() {
        return stopReason;
    }

    public void setStopReason(Integer stopReason) {
        this.stopReason = stopReason;
    }

    public Integer getEnded() {
        return ended;
    }

    public void setEnded(Integer ended) {
        this.ended = ended;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
