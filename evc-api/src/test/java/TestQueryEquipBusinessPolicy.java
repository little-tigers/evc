import cn.v1.evc.cec.data.ReqEquipBusinessPolicy;
import cn.v1.evc.cec.data.ResData;
import cn.v1.evc.cec.data.ResEquipBusinessPolicy;
import cn.v1.evc.service.EvChargeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description:
 */
public class TestQueryEquipBusinessPolicy {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-beans.xml");
        EvChargeService evChargeService = (EvChargeService) context.getBean("phChargeService");
        ResData<ResEquipBusinessPolicy> resEquipBusinessPolicyResData = evChargeService.queryEquipBusinessPolicy(new ReqEquipBusinessPolicy("1707090230072"));
        System.out.printf("resEquipBusinessPolicyResData"+resEquipBusinessPolicyResData);
    }
}
