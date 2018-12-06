package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/15
 * @Description: 充电额度更新请求data
 */
public class ReqSetBalance implements Serializable {

    private static final long serialVersionUID = 6757384719290202856L;

    public ReqSetBalance(){}

    public ReqSetBalance(String startChargeSeq, String pid, Double balance) {
        this.startChargeSeq = startChargeSeq;
        this.pid = pid;
        this.balance = balance;
    }

    private String startChargeSeq; //充电桩 ID

    private String pid; //充电的流水号

    private Double  balance;  //限制费用

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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
