package cn.v1.evc.cec.factory;

import cn.v1.evc.cec.base.CecUtil;
import cn.v1.evc.cec.base.CecData;
import cn.v1.evc.cec.data.*;
import cn.v1.evc.cec.token.CecToken;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 定义请求基础类
 */
public abstract class AbstractBaseQuery<T> {

    //定义运营商，从CecCodeEnum类中取值
    public abstract String getCode();

    //获取运营配置
    public abstract CecData getCecData();

    //获取token
    private String token = CecToken.getAccessToken(getCode());


    public ResData<T> query(Class zClass){
        return CecUtil.parseObject(getCecData(),token,zClass);
    }
}
