package cn.v1.evc.cec.data;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 中电联公用返回类
 */
public class ResData<T> implements Serializable {

    private static final long serialVersionUID = -3703857212670866741L;

    private String ret;

    private String msg;

    private T data;

    private String sig;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public Class<T> getTClass()
    {
        Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;
    }
}
