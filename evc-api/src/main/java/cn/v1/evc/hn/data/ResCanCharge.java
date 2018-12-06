package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description:是否能充电返回
 */
public class ResCanCharge implements Serializable {

    private static final long serialVersionUID = 7251786963262682780L;

    private String pid;

    private String requestSeq;

    private Integer can; //能否充电，1 表示能充电，0 表示不能充电

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getRequestSeq() {
        return requestSeq;
    }

    public void setRequestSeq(String requestSeq) {
        this.requestSeq = requestSeq;
    }

    public Integer getCan() {
        return can;
    }

    public void setCan(Integer can) {
        this.can = can;
    }
}
