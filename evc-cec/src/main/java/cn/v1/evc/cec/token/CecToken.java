package cn.v1.evc.cec.token;

import cn.v1.evc.cec.base.CecPropertiesUtil;
import cn.v1.evc.cec.base.CecUtil;
import cn.v1.evc.cec.base.CecData;
import cn.v1.evc.cec.data.ReqToken;
import cn.v1.evc.cec.data.ResData;
import cn.v1.evc.cec.data.ResToken;
import cn.v1.evc.cec.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description:
 */
public class CecToken {

    private static Logger logger = LoggerFactory.getLogger(CecToken.class);

    //请求后缀
    private static final String SUFFIX = "query_token";

    private static RedisTemplate redisTemplate;

    //初始化redis
    static {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-redis.xml");
        redisTemplate = (RedisTemplate) context.getBean("redisTemplate");
    }

    /**
     * 获取运营商平台令牌
     *
     * @param cecCode 运营商简码
     * @return
     */
    public static String getAccessToken(String cecCode) {
        String accessToken ="";
        if(StringUtil.isNotBlank(cecCode)){
            //获取前缀
            String prefix = CecPropertiesUtil.getProperty("TOKEN.KEY_PREFIX");
            String redisKey = prefix+":token :"+cecCode;
            logger.info("redisKey："+redisKey);
            accessToken = (String) redisTemplate.opsForValue().get(redisKey);
            if(StringUtil.isBlank(accessToken)){
                //数据加密
                CecData cecData = CecUtil.getCecData(cecCode);
                if(cecData != null){
                    cecData.setUrl(cecData.getUrl()+SUFFIX);
                    cecData.setData(new ReqToken(cecData.getOperatorID(), cecData.getOperatorSecret()));
                    ResData<ResToken> resData = CecUtil.parseObject(cecData, ResToken.class);
                    System.out.printf("获取token返回---------"+resData.getRet());
                    if(resData != null && "0".equals(resData.getRet())){
                        ResToken resToken = resData.getData();
                        String token = resToken.getAccessToken();
                        logger.info("获取token值：{}",token);
                        if(StringUtil.isNotBlank(token)){
                            //放入缓存
                            redisTemplate.opsForValue().set(redisKey, token,resData.getData().getTokenAvailableTime(), TimeUnit.SECONDS);
                            return token;
                        }
                    }
                }
            }
        }
        if(StringUtil.isBlank(accessToken)){
            throw new NullPointerException("获取token失败");
        }
        return accessToken;
    }
}
