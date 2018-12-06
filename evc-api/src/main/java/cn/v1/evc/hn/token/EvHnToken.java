package cn.v1.evc.hn.token;

import cn.v1.evc.cec.base.CecData;
import cn.v1.evc.cec.base.CecPropertiesUtil;
import cn.v1.evc.cec.base.CecUtil;
import cn.v1.evc.cec.util.*;
import cn.v1.evc.hn.data.ResHnData;
import cn.v1.evc.hn.data.TokenHnData;
import cn.v1.evc.util.FastJsonUtils;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: wr
 * @Date: 2018/11/14
 * @Description:汇能token获取
 */
public class EvHnToken {

    private static Logger logger = LoggerFactory.getLogger(EvHnToken.class);

    private static CecData cecData = CecUtil.getCecData("HN");

    private static final String SUFFIX = "token";

    private static  Map<String, Object> BASE_MAP = new HashMap<String, Object>();

    private static RedisTemplate redisTemplate;

    public static String getSeq(){
        //自定义4位数字流水号
        String randomStr = RandomUtils.randomWord(4);
        //当前时间戳
        String timestamp = SimpleDateUtil.convert2String(SimpleDateUtil.curTimeMillis(), SimpleDateUtil.TIME_FORMAT);
        return cecData.getOperatorID()+"_"+timestamp+"_"+randomStr;
    }

    static {
        //初始化redisTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-redis.xml");
        redisTemplate = (RedisTemplate) context.getBean("redisTemplate");
    }

    public static String getAccessToken() {
        //获取前缀
        String prefix = CecPropertiesUtil.getProperty("TOKEN.KEY_PREFIX");
        String redisKey = prefix+":token :"+cecData.getOperatorID();
        String accessToken = (String) redisTemplate.opsForValue().get(redisKey);
        if(StringUtil.isBlank(accessToken)){
            BASE_MAP.put("action","RequestToken"); //接口名称
            //当前时间戳
            long timestamp = new Date().getTime();
            BASE_MAP.put("timestamp",timestamp);
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("operatorId", cecData.getOperatorID());
            data.put("operatorSecret", cecData.getOperatorSecret());

            BASE_MAP.put("data",data);
            String reqJson = JSONObject.toJSONString(BASE_MAP);
            System.out.printf("reqJson"+reqJson);
            //发送post请求
           JSONObject object = HttpClientUtil.httpPost(cecData.getUrl() + SUFFIX, reqJson);
           if(object != null){
               //json转换对象
               ResHnData<TokenHnData> resultHnData = FastJsonUtils.parseObject(object.toJSONString(),TokenHnData.class);
               if("0".equals(resultHnData.getCode())){
                   //放入缓存
                   String token = resultHnData.getData().getToken();
                   redisTemplate.opsForValue().set(redisKey, token,resultHnData.getData().getExpiresIn(), TimeUnit.SECONDS);
                   return resultHnData.getData().getToken();
               }else {
                   logger.error("获取token失败,code={}",resultHnData.getCode());
               }
           }
        }
        if(StringUtil.isBlank(accessToken)){
            throw new NullPointerException("认证失败");
        }
        return accessToken;
    }
}
