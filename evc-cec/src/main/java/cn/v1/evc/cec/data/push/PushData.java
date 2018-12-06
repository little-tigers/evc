package cn.v1.evc.cec.data.push;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/24
 * @Description:
 */
public class PushData implements Serializable {

    private static final long serialVersionUID = 7554320138036585928L;

    private String seq;

    private String operatorId;

    private String timeStamp;

    private String data;

    private String sig;

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
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
