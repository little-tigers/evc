package cn.v1.evc.cec.data.push;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/27
 * @Description: 推送充电接口状态
 */
public class PushConnectorStatusInfo implements Serializable {

    private static final long serialVersionUID = 181907272288020565L;

    private String connectorId; //设备接口

    private Integer status;  //状态

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
