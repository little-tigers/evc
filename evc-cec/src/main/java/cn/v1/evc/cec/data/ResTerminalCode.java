package cn.v1.evc.cec.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description:查询二维码 (Res代表返参)
 */
public class ResTerminalCode implements Serializable {

    private static final long serialVersionUID = 1660320905288914918L;

    private String terminalCode;

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }
}
