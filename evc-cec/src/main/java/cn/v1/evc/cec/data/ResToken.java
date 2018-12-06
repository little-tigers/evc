package cn.v1.evc.cec.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 获取TOKEN (Res代表返参)
 */
public class ResToken implements Serializable {

    private static final long serialVersionUID = -2584503002467605393L;

    private String operatorId;

    private Integer succStat;

    private String accessToken;

    private Integer tokenAvailableTime;

    private Integer failReason;

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getSuccStat() {
        return succStat;
    }

    public void setSuccStat(Integer succStat) {
        this.succStat = succStat;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getTokenAvailableTime() {
        return tokenAvailableTime;
    }

    public void setTokenAvailableTime(Integer tokenAvailableTime) {
        this.tokenAvailableTime = tokenAvailableTime;
    }

    public Integer getFailReason() {
        return failReason;
    }

    public void setFailReason(Integer failReason) {
        this.failReason = failReason;
    }
}
