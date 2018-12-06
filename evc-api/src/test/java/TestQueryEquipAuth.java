import cn.v1.evc.cec.data.ReqEquipAuth;
import cn.v1.evc.cec.data.ResData;
import cn.v1.evc.cec.data.ResEquipAuth;
import cn.v1.evc.service.EvChargeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description:
 */
public class TestQueryEquipAuth {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-beans.xml");
        EvChargeService evChargeService = (EvChargeService) context.getBean("phChargeService");
        ResData<ResEquipAuth> resEquipAuthResData = evChargeService.queryEquipAuth(new ReqEquipAuth("1707090230072"));
        System.out.printf("resEquipAuthResData"+resEquipAuthResData);
    }
}
