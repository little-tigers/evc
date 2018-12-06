package cn.v1.evc.cec.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 业务策略信息 (Res代表返参)
 */
public class ResPolicyInfo implements Serializable {

    private static final long serialVersionUID = -4386203488361333656L;

    private String startTime;  //起始时间点 HHmmss

    private Double elecPrice; //时段电费

    private Double servicePrice; //时段服务费

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Double getElecPrice() {
        return elecPrice;
    }

    public void setElecPrice(Double elecPrice) {
        this.elecPrice = elecPrice;
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }
}
