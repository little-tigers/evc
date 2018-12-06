package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 请求TOKEN (Req代表入参)
 */
public class ReqToken implements Serializable {

    private static final long serialVersionUID = 2073096285881650940L;

    public ReqToken(String operatorId, String operatorSecret) {
        this.operatorId = operatorId;
        this.operatorSecret = operatorSecret;
    }

    @JSONField(name="OperatorID")
    private String operatorId;

    @JSONField(name="OperatorSecret")
    private String operatorSecret;

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorSecret() {
        return operatorSecret;
    }

    public void setOperatorSecret(String operatorSecret) {
        this.operatorSecret = operatorSecret;
    }
}
