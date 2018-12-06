package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 请求启动充电 (Req代表入参)
 */
public class ReqStartCharge implements Serializable {

    private static final long serialVersionUID = 5857293264457783281L;

    public ReqStartCharge(String connectorId, String QRCode) {
        this.connectorId = connectorId;
        this.QRCode = QRCode;
    }

    @JSONField(name="StartChargeSeq")
    private String startChargeSeq;

    @JSONField(name="ConnectorID")
    private String connectorId;

    @JSONField(name="QRCode")
    private String QRCode;

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

    public String getQRCode() {
        return QRCode;
    }

    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }
}
