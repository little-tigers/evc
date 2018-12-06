package cn.v1.evc.cec.data.push;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/27
 * @Description: 推送订单对账信息
 */
public class PushCheckChargeOrder implements Serializable {

    private static final long serialVersionUID = 5164896319529616156L;

    private String checkOrderSeq; //对账订单流水号

    private String startTime;  //账单开始时间

    private String endTime; //账单结束时间

    private Integer orderCount; //订单数量

    private Double totalOrderPower; //订单总电量

    private Double totalOrderMoney; //总金额

    private List<PushChargeOrders> chargeOrders; //订单列表

    public String getCheckOrderSeq() {
        return checkOrderSeq;
    }

    public void setCheckOrderSeq(String checkOrderSeq) {
        this.checkOrderSeq = checkOrderSeq;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Double getTotalOrderPower() {
        return totalOrderPower;
    }

    public void setTotalOrderPower(Double totalOrderPower) {
        this.totalOrderPower = totalOrderPower;
    }

    public Double getTotalOrderMoney() {
        return totalOrderMoney;
    }

    public void setTotalOrderMoney(Double totalOrderMoney) {
        this.totalOrderMoney = totalOrderMoney;
    }

    public List<PushChargeOrders> getChargeOrders() {
        return chargeOrders;
    }

    public void setChargeOrders(List<PushChargeOrders> chargeOrders) {
        this.chargeOrders = chargeOrders;
    }
}
