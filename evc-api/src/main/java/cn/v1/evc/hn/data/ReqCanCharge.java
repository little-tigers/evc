package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description: 能否充电请求Data
 */
public class ReqCanCharge implements Serializable {

    private static final long serialVersionUID = -2811220519689818094L;

    public ReqCanCharge(){
    }

    public ReqCanCharge(String requestSeq, String pid){
        this.requestSeq = requestSeq;
        this.pid = pid;
    }

    private String pid;

    private String requestSeq;

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
}
