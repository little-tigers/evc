package cn.v1.evc.cec.data;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 查询业务策略 (Res代表返参)
 */
public class ResEquipBusinessPolicy implements Serializable {

    private static final long serialVersionUID = 7172865484197891310L;

    private String equipBizSeq;

    private String connectorId;

    private Integer succStat; //操作结果

    private Integer sumPeriod; //时间段数N

    private Integer failReason; //失败原因

    private List<ResPolicyInfo> policyInfos;

    public String getEquipBizSeq() {
        return equipBizSeq;
    }

    public void setEquipBizSeq(String equipBizSeq) {
        this.equipBizSeq = equipBizSeq;
    }

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public Integer getSuccStat() {
        return succStat;
    }

    public void setSuccStat(Integer succStat) {
        this.succStat = succStat;
    }

    public Integer getSumPeriod() {
        return sumPeriod;
    }

    public void setSumPeriod(Integer sumPeriod) {
        this.sumPeriod = sumPeriod;
    }

    public Integer getFailReason() {
        return failReason;
    }

    public void setFailReason(Integer failReason) {
        this.failReason = failReason;
    }

    public List<ResPolicyInfo> getPolicyInfos() {
        return policyInfos;
    }

    public void setPolicyInfos(List<ResPolicyInfo> policyInfos) {
        this.policyInfos = policyInfos;
    }
}
