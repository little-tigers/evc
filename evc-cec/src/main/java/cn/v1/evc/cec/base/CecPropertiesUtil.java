package cn.v1.evc.cec.base;

import cn.v1.evc.cec.util.PropertiesLoader;
import org.springframework.util.ObjectUtils;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description: 获取配置属性
 */
public class CecPropertiesUtil {

    private static  PropertiesLoader loader = null;

    private static final String CLASS_PATH = "classpath:/META-INF/conf/";

    private static final String PROJECT_PATH = "file:" + System.getProperty("user.dir") + "/conf/";

    static {
         loader = new PropertiesLoader(CLASS_PATH+"evc.properties",
                 CLASS_PATH+"happygo-evc.properties",
                 PROJECT_PATH+"evc.properties");
    }

    public static String getProperty(String key){
        if(loader != null){
            return loader.getProperty(key);
        }
        return "";
    }
}
