package cn.v1.evc.hn.data;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description:二维码请求
 */
public class ReqQRDecode implements Serializable {

    private static final long serialVersionUID = -660896537990307703L;

    public ReqQRDecode() {
    }

    public ReqQRDecode(String requestSeq, String qrcode) {
        this.requestSeq = requestSeq;
        this.qrcode = qrcode;
    }

    private String requestSeq;

    private String qrcode;

    public String getRequestSeq() {
        return requestSeq;
    }

    public void setRequestSeq(String requestSeq) {
        this.requestSeq = requestSeq;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
}
