package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 中电联公用请求类,所有请求类必须加上 @JSONField 转换json时来区分大小写
 */
public class ReqData implements Serializable {

    private static final long serialVersionUID = -4982582230085682785L;

    public ReqData(String operatorId, String data, String timeStamp, String seq, String sig) {
        this.operatorId = operatorId;
        this.data = data;
        this.timeStamp = timeStamp;
        this.seq = seq;
        this.sig = sig;
    }

    @JSONField(name="OperatorID")
    private String operatorId; //运营商标识

    @JSONField(name="Data")
    private String data; //请求体

    @JSONField(name="TimeStamp")
    private String timeStamp; //时间戳 yyyyMMddHHmmss;

    @JSONField(name="Seq")
    private String seq; //自增序列

    @JSONField(name="Sig")
    private String sig; //参数签名

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }
}
