package cn.v1.evc.cec.data.push;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/27
 * @Description: 推送单项订单对账信息，请区别PushChargeOrderInfo
 */
public class PushChargeOrders implements Serializable {

    private static final long serialVersionUID = 3241214613455653274L;

    private String startChargeSeq; //充电订单号

    private Double TotalPower; //累计充电量

    private Double totalMoney;  //累计总金额

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }

    public Double getTotalPower() {
        return TotalPower;
    }

    public void setTotalPower(Double totalPower) {
        TotalPower = totalPower;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
