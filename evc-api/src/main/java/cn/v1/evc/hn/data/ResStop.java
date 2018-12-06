package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/15
 * @Description: 结束充电返回data
 */
public class ResStop implements Serializable {

    private static final long serialVersionUID = -7696476177224992353L;

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
