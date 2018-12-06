package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description: 余额请求Data
 */
public class ReqMoney implements Serializable {

    private static final long serialVersionUID = -2811220519689818094L;

    public ReqMoney(){
    }

    public ReqMoney(String requestSeq){
        this.requestSeq = requestSeq;
    }

    private String requestSeq;

    public String getRequestSeq() {
        return requestSeq;
    }

    public void setRequestSeq(String requestSeq) {
        this.requestSeq = requestSeq;
    }
}
