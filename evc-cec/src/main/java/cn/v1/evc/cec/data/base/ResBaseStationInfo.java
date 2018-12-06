package cn.v1.evc.cec.data.base;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description:充电站基础信息 (Res代表返参)
 */
public abstract class ResBaseStationInfo<T> implements Serializable {

    private static final long serialVersionUID = -8433672334693867629L;

    private String stationId; //充电站ID

    private String operatorId;  //运营商ID

    private String equipmentOwnerId; //设备所属方ID

    private String stationName;  //充电站名称

    private String countryCode; //充电站国家代码

    private String areaCode; //充电站省市辖区编码

    private String address; //详细地址

    private String stationTel; //站点电话

    private String serviceTel;  //服务电话

    private Integer stationType; //站点类型

    private Integer stationStatus; //站点状态

    private Integer parkNums; //车位数量

    private Double stationLng; //经度 GCJ-02坐标系

    private Double stationLat; //纬度

    private String siteGuide; //站点引导

    private Integer construction; //建设场所

    private List<String> pictures; //站点图片

    private String matchCars;   //使用车型描述

    private String parkInfo;  //车位楼层及数量描述

    private String busineHours; //营业时间

    private String electricityFee; //充电电费率

    private String serviceFee;  //服务费率

    private String parkFee;  //停车费

    private String payment;  //支付方式

    private Integer supportOrder; //是否支持预约

    private String remark;  //备注

    private List<T> equipmentInfos; //充电设备列表信息

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getEquipmentOwnerId() {
        return equipmentOwnerId;
    }

    public void setEquipmentOwnerId(String equipmentOwnerId) {
        this.equipmentOwnerId = equipmentOwnerId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStationTel() {
        return stationTel;
    }

    public void setStationTel(String stationTel) {
        this.stationTel = stationTel;
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel;
    }

    public Integer getStationType() {
        return stationType;
    }

    public void setStationType(Integer stationType) {
        this.stationType = stationType;
    }

    public Integer getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(Integer stationStatus) {
        this.stationStatus = stationStatus;
    }

    public Integer getParkNums() {
        return parkNums;
    }

    public void setParkNums(Integer parkNums) {
        this.parkNums = parkNums;
    }

    public Double getStationLng() {
        return stationLng;
    }

    public void setStationLng(Double stationLng) {
        this.stationLng = stationLng;
    }

    public Double getStationLat() {
        return stationLat;
    }

    public void setStationLat(Double stationLat) {
        this.stationLat = stationLat;
    }

    public String getSiteGuide() {
        return siteGuide;
    }

    public void setSiteGuide(String siteGuide) {
        this.siteGuide = siteGuide;
    }

    public Integer getConstruction() {
        return construction;
    }

    public void setConstruction(Integer construction) {
        this.construction = construction;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public String getMatchCars() {
        return matchCars;
    }

    public void setMatchCars(String matchCars) {
        this.matchCars = matchCars;
    }

    public String getParkInfo() {
        return parkInfo;
    }

    public void setParkInfo(String parkInfo) {
        this.parkInfo = parkInfo;
    }

    public String getBusineHours() {
        return busineHours;
    }

    public void setBusineHours(String busineHours) {
        this.busineHours = busineHours;
    }

    public String getElectricityFee() {
        return electricityFee;
    }

    public void setElectricityFee(String electricityFee) {
        this.electricityFee = electricityFee;
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getParkFee() {
        return parkFee;
    }

    public void setParkFee(String parkFee) {
        this.parkFee = parkFee;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getSupportOrder() {
        return supportOrder;
    }

    public void setSupportOrder(Integer supportOrder) {
        this.supportOrder = supportOrder;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<T> getEquipmentInfos() {
        return equipmentInfos;
    }

    public void setEquipmentInfos(List<T> equipmentInfos) {
        this.equipmentInfos = equipmentInfos;
    }
}
