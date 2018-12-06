package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description:
 */
public class TokenHnData implements Serializable {

    private static final long serialVersionUID = -4582716119555400885L;

    private String token;

    private String operatorId;

    private Integer expiresIn; //失效时间，单位秒

    private Long expiresTime; //失效时间点，Unix 时间戳

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Long expiresTime) {
        this.expiresTime = expiresTime;
    }
}
