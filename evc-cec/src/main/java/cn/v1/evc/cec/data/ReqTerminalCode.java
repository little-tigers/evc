package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description:查询二维码 (Req代表入参)
 */
public class ReqTerminalCode implements Serializable {

    private static final long serialVersionUID = -7050610536800809716L;

    public ReqTerminalCode(String QRCode){
        this.QRCode = QRCode;
    }

    @JSONField(name="QRCode")
    private String QRCode;

    public String getQRCode() {
        return QRCode;
    }

    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }
}
