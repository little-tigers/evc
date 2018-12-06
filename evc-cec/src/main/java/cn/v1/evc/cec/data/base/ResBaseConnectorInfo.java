package cn.v1.evc.cec.data.base;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 充电设备接口基础信息 (Res代表返参)
 */
public abstract class ResBaseConnectorInfo implements Serializable {

    private static final long serialVersionUID = -5519739897946292322L;

    private String connectorId;  //设备接口编码

    private String connectorName;  //设备接口名称

    private Integer connectorType;  //设备接口类型

    private Integer voltageUpperLimits; //额定电压上限 单位 V

    private Integer voltageLowerLimits; //额定电压下限 单位 V

    private Integer current; //额度电流 单位 A

    private Double power;  // 额度功率 单位 kW

    private String parkNo; //车位号

    private Integer nationalStandard; //国家标准

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public Integer getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(Integer connectorType) {
        this.connectorType = connectorType;
    }

    public Integer getVoltageUpperLimits() {
        return voltageUpperLimits;
    }

    public void setVoltageUpperLimits(Integer voltageUpperLimits) {
        this.voltageUpperLimits = voltageUpperLimits;
    }

    public Integer getVoltageLowerLimits() {
        return voltageLowerLimits;
    }

    public void setVoltageLowerLimits(Integer voltageLowerLimits) {
        this.voltageLowerLimits = voltageLowerLimits;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public String getParkNo() {
        return parkNo;
    }

    public void setParkNo(String parkNo) {
        this.parkNo = parkNo;
    }

    public Integer getNationalStandard() {
        return nationalStandard;
    }

    public void setNationalStandard(Integer nationalStandard) {
        this.nationalStandard = nationalStandard;
    }
}
