package cn.v1.evc.cec.data.base;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 充电设备基础信息 (Res代表返参)
 */
public abstract class ResBaseEquipmentInfo<T> implements Serializable {

    private static final long serialVersionUID = -2909658937068933544L;

    private String equipmentId; //设备编号

    private String equipmentName; //设备名称

    private String manufacturerId; //设备生产商组织机构代码

    private String manufacturerName; //设备生产商名称

    private String equipmentModel; //设备生产型号

    private String productionDate; //设备生产日期 YYYY-MM-DD

    private Integer equipmentType; //设备类型

    private Double equipmentLng; //设备经度 GCJ-02坐标系

    private Double equipmentLat; //设备纬度 GCJ-02坐标系

    private Double power;  //充电设备总功率 单位 kW

    private List<T> connectorInfos; //设备接口信息列表

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public Integer getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Integer equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Double getEquipmentLng() {
        return equipmentLng;
    }

    public void setEquipmentLng(Double equipmentLng) {
        this.equipmentLng = equipmentLng;
    }

    public Double getEquipmentLat() {
        return equipmentLat;
    }

    public void setEquipmentLat(Double equipmentLat) {
        this.equipmentLat = equipmentLat;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public List<T> getConnectorInfos() {
        return connectorInfos;
    }

    public void setConnectorInfos(List<T> connectorInfos) {
        this.connectorInfos = connectorInfos;
    }
}
