package cn.v1.evc.factory;

import cn.v1.evc.base.CecCodeEnum;
import cn.v1.evc.cec.factory.AbstractCecQuery;

/**
 * @Auther: wr
 * @Date: 2018/11/26
 * @Description:
 */
public class AbstractPhQuery extends AbstractCecQuery {

    private Class zClass;

    public String getCecCode() {
        return CecCodeEnum.PH.getValue();
    }

    public Class getTClass() {
        return zClass;
    }

    public void setZClass(Class zClass){
        this.zClass =zClass;
    }
}
