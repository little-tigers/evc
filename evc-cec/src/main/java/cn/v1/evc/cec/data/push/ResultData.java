package cn.v1.evc.cec.data.push;

import java.io.Serializable;

/**
 * Created by wr
 * on 2018/8/23
 */
public class ResultData implements Serializable {

    private static final long serialVersionUID = -7530264840578150088L;

    public ResultData(Integer ret, String msg, String data, String sig) {
        this.ret = ret;
        this.msg = msg;
        this.data = data;
        this.sig = sig;
    }

    private Integer ret;

    private String msg;

    private String data;

    private String sig;

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

}
