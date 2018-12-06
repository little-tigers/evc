package cn.v1.evc.hn.data;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description:
 */
public class ResMoney implements Serializable {

    private static final long serialVersionUID = -7873580647125793658L;

    private String requestSeq; //请求序号

    private String operatorId;

    private Double balance;

    private List<Prepaid> prepaidList;

    public String getRequestSeq() {
        return requestSeq;
    }

    public void setRequestSeq(String requestSeq) {
        this.requestSeq = requestSeq;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Prepaid> getPrepaidList() {
        return prepaidList;
    }

    public void setPrepaidList(List<Prepaid> prepaidList) {
        this.prepaidList = prepaidList;
    }

    public class Prepaid {

        private Double money;

        private Double payMoney;

        private Long prepaidTime;

        private Double balance;

        public Double getMoney() {
            return money;
        }

        public void setMoney(Double money) {
            this.money = money;
        }

        public Double getPayMoney() {
            return payMoney;
        }

        public void setPayMoney(Double payMoney) {
            this.payMoney = payMoney;
        }

        public Long getPrepaidTime() {
            return prepaidTime;
        }

        public void setPrepaidTime(Long prepaidTime) {
            this.prepaidTime = prepaidTime;
        }

        public Double getBalance() {
            return balance;
        }

        public void setBalance(Double balance) {
            this.balance = balance;
        }
    }
}
