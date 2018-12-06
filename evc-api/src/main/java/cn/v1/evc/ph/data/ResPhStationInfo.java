package cn.v1.evc.ph.data;

import cn.v1.evc.cec.data.base.ResBaseStationInfo;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/26
 * @Description: 充电站扩展
 */
public class ResPhStationInfo extends ResBaseStationInfo<ResPhEquipmentInfo> implements Serializable {

    private static final long serialVersionUID = -2319100656488795975L;

    private String equipmentOwnerName;

    public String getEquipmentOwnerName() {
        return equipmentOwnerName;
    }

    public void setEquipmentOwnerName(String equipmentOwnerName) {
        this.equipmentOwnerName = equipmentOwnerName;
    }
}
