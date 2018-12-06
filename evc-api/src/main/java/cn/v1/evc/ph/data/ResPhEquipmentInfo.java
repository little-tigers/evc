package cn.v1.evc.ph.data;

import cn.v1.evc.cec.data.base.ResBaseEquipmentInfo;
import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/26
 * @Description:
 */
public class ResPhEquipmentInfo extends ResBaseEquipmentInfo<ResPhConnectorInfo> implements Serializable {

    private static final long serialVersionUID = 2388494073671596158L;

    //设备统计数
    private Integer connectorCount;

    public Integer getConnectorCount() {
        return connectorCount;
    }

    public void setConnectorCount(Integer connectorCount) {
        this.connectorCount = connectorCount;
    }
}
