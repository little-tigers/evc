package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 请求停止充电 (Req代表入参)
 */
public class ReqStopCharge implements Serializable {

    private static final long serialVersionUID = 709232470634998390L;

    public ReqStopCharge(String startChargeSeq, String connectorId) {
        this.startChargeSeq = startChargeSeq;
        this.connectorId = connectorId;
    }

    @JSONField(name="StartChargeSeq")
    private String startChargeSeq;

    @JSONField(name="ConnectorID")
    private String connectorId;

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

}
