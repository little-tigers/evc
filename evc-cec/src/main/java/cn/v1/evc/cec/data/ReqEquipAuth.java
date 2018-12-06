package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 请求设备认证 (Req代表入参)
 */
public class ReqEquipAuth implements Serializable {

    private static final long serialVersionUID = -2814136735686972113L;

    public ReqEquipAuth(String connectorId) {
        this.connectorId = connectorId;
    }

    @JSONField(name="EquipAuthSeq")
    private String equipAuthSeq;

    @JSONField(name="ConnectorID")
    private String connectorId;

    public String getEquipAuthSeq() {
        return equipAuthSeq;
    }

    public void setEquipAuthSeq(String equipAuthSeq) {
        this.equipAuthSeq = equipAuthSeq;
    }

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }
}
