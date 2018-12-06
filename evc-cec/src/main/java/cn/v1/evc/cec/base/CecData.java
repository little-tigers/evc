package cn.v1.evc.cec.base;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 中电联标准配置
 */
public class CecData<T> implements Serializable {

    private static final long serialVersionUID = 2073096285881650940L;

    public CecData(String url, String operatorID, String operatorSecret, String dataSecret, String dataSecretIv, String signSecret) {
        Url = url;
        OperatorID = operatorID;
        OperatorSecret = operatorSecret;
        DataSecret = dataSecret;
        DataSecretIv = dataSecretIv;
        SignSecret = signSecret;
    }

    private String Url;

    private String OperatorID;

    private String OperatorSecret;

    private String DataSecret;

    private String DataSecretIv;

    private String SignSecret;

    private T Data;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getOperatorID() {
        return OperatorID;
    }

    public void setOperatorID(String operatorID) {
        OperatorID = operatorID;
    }

    public String getOperatorSecret() {
        return OperatorSecret;
    }

    public void setOperatorSecret(String operatorSecret) {
        OperatorSecret = operatorSecret;
    }

    public String getDataSecret() {
        return DataSecret;
    }

    public void setDataSecret(String dataSecret) {
        DataSecret = dataSecret;
    }

    public String getDataSecretIv() {
        return DataSecretIv;
    }

    public void setDataSecretIv(String dataSecretIv) {
        DataSecretIv = dataSecretIv;
    }

    public String getSignSecret() {
        return SignSecret;
    }

    public void setSignSecret(String signSecret) {
        SignSecret = signSecret;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "CecData{" +
                "Url='" + Url + '\'' +
                ", OperatorID='" + OperatorID + '\'' +
                ", OperatorSecret='" + OperatorSecret + '\'' +
                ", DataSecret='" + DataSecret + '\'' +
                ", DataSecretIv='" + DataSecretIv + '\'' +
                ", SignSecret='" + SignSecret + '\'' +
                ", Data=" + Data +
                '}';
    }
}
