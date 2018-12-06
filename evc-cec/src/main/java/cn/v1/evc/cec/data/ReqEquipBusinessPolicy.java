package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 查询业务策略 (Req代表入参)
 */
public class ReqEquipBusinessPolicy implements Serializable {

    private static final long serialVersionUID = 4076068648627710080L;

    public ReqEquipBusinessPolicy(String connectorId) {
        this.connectorId = connectorId;
    }

    @JSONField(name="EquipBizSeq")
    private String equipBizSeq;

    @JSONField(name="ConnectorID")
    private String connectorId;

    public String getEquipBizSeq() {
        return equipBizSeq;
    }

    public void setEquipBizSeq(String equipBizSeq) {
        this.equipBizSeq = equipBizSeq;
    }

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }
}
