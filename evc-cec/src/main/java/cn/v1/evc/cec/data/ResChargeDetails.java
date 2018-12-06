package cn.v1.evc.cec.data;

import java.io.Serializable;

/**
 * Created by wr
 * on 2018/11/23
 */
public class ResChargeDetails implements Serializable {

    private static final long serialVersionUID = -5082738841978367999L;

    private String detailStartTime;  //开始时间

    private String detailEndTime; //结束时间

    private Double elecPrice; //时段电价

    private Double sevicePrice; //兼容时段服务费价格

    private Double servicePrice; //时段服务费价格

    private Double detailPower; //充电量

    private Double detailElecMoney; //时段电费

    private Double detailServiceMoney; //时段服务费

    public String getDetailStartTime() {
        return detailStartTime;
    }

    public void setDetailStartTime(String detailStartTime) {
        this.detailStartTime = detailStartTime;
    }

    public String getDetailEndTime() {
        return detailEndTime;
    }

    public void setDetailEndTime(String detailEndTime) {
        this.detailEndTime = detailEndTime;
    }

    public Double getElecPrice() {
        return elecPrice;
    }

    public void setElecPrice(Double elecPrice) {
        this.elecPrice = elecPrice;
    }

    public Double getSevicePrice() {
        return sevicePrice;
    }

    public void setSevicePrice(Double sevicePrice) {
        this.sevicePrice = sevicePrice;
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Double getDetailPower() {
        return detailPower;
    }

    public void setDetailPower(Double detailPower) {
        this.detailPower = detailPower;
    }

    public Double getDetailElecMoney() {
        return detailElecMoney;
    }

    public void setDetailElecMoney(Double detailElecMoney) {
        this.detailElecMoney = detailElecMoney;
    }

    public Double getDetailServiceMoney() {
        return detailServiceMoney;
    }

    public void setDetailServiceMoney(Double detailServiceMoney) {
        this.detailServiceMoney = detailServiceMoney;
    }
}
