package cn.v1.evc.cec.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 请求设备认证 ((Res代表返参)
 */
public class ResEquipAuth implements Serializable {

    private static final long serialVersionUID = -6408781914382929345L;

    private String equipAuthSeq; //设备认证流水号

    private String connectorId; //接口编号

    private Integer succStat;  //操作结果（0:成功/1:失败）

    private Integer failReason; //失败原因(0:无/1:此设备无插枪/2：设备检测失败/3~99:其它 )

    public String getEquipAuthSeq() {
        return equipAuthSeq;
    }

    public void setEquipAuthSeq(String equipAuthSeq) {
        this.equipAuthSeq = equipAuthSeq;
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

    public Integer getFailReason() {
        return failReason;
    }

    public void setFailReason(Integer failReason) {
        this.failReason = failReason;
    }
}
