package cn.v1.evc.hn.data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description: 汇能公约参数请求
 */
public class ReqHnData<T> implements Serializable {

    private static final long serialVersionUID = -7394302671328815174L;

    private String  action;

    private String token;

    private T data;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getTimestamp() {
        return  new Date().getTime();
    }
}
