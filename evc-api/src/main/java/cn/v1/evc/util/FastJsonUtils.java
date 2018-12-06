package cn.v1.evc.util;

import cn.v1.evc.hn.data.ResHnData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

/**
 * @Auther: wr
 * @Date: 2018/11/19
 * @Description:
 */
public class FastJsonUtils {

    public static <T> ResHnData<T> parseObject(String params, Class zClass){
        ResHnData<T> data = JSON.parseObject(params, new TypeReference<ResHnData<T>>(zClass){});
        return  data;
    }
}
