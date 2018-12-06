package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/15
 * @Description: 获取充电数据请求data
 */
public class ReqCharge implements Serializable {

    private static final long serialVersionUID = 8753997834016881740L;

    public ReqCharge(){}

    public ReqCharge(String startChargeSeq, String pid) {
        this.startChargeSeq = startChargeSeq;
        this.pid = pid;
    }

    private String startChargeSeq; //充电桩 ID

    private String pid; //充电的流水号

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

}
