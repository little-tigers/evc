package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/15
 * @Description: 请求更新充电额度返加
 */
public class ResSetBalance implements Serializable {

    private static final long serialVersionUID = -1084626039849816516L;

    private String pid;

    private String startChargeSeq; //充电的序号

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
}
