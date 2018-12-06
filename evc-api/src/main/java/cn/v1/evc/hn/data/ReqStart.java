package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/15
 * @Description: 开始充电请求Data
 */
public class ReqStart implements Serializable {

    private static final long serialVersionUID = -5412981149814027060L;

    public ReqStart() {

    }

    public ReqStart(String startChargeSeq, String pid ) {
        this.startChargeSeq = startChargeSeq;
        this.pid = pid;
    }

    public ReqStart(String startChargeSeq, String pid, Integer minutes, Double balance) {
        this.startChargeSeq = startChargeSeq;
        this.pid = pid;
        this.minutes = minutes;
        this.balance = balance;
    }

    private String startChargeSeq; //开始充电的序号

    private String pid;   //充电桩 ID

    private Integer minutes; //充电时长，单位分钟，默认为 1380。

    private Double  balance;  //充电费用限制，单位元

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
