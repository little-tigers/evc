import cn.v1.evc.cec.data.ReqStation;
import cn.v1.evc.cec.data.ResData;
import cn.v1.evc.cec.data.ResStation;
import cn.v1.evc.service.EvChargeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description:
 */
public class TestQueryStation {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-beans.xml");
        EvChargeService evChargeService = (EvChargeService) context.getBean("phChargeService");


        ResData<ResStation> stationResData = evChargeService.queryStation(new ReqStation());
        System.out.printf("stationResData"+stationResData);
    }
}
