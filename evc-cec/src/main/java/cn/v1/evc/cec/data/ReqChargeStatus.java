package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description: 查询充电状态 (Req代表入参)
 */
public class ReqChargeStatus implements Serializable {

    private static final long serialVersionUID = -7998750708013131570L;

    public ReqChargeStatus(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }

    @JSONField(name="StartChargeSeq")
    private String startChargeSeq;

    public String getStartChargeSeq() {
        return startChargeSeq;
    }

    public void setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
    }
}
