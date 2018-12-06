import cn.v1.evc.hn.data.ResHnData;
import cn.v1.evc.hn.data.ResMoney;
import cn.v1.evc.service.HnChargeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wr
 * @Date: 2018/12/4
 * @Description:
 */
public class TestHnQuery {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-beans.xml");
        HnChargeService hnChargeService = (HnChargeService) context.getBean("hnChargeService");
        ResHnData<ResMoney> resHnData = hnChargeService.queryMoney();
        System.out.printf(resHnData.getData().toString());
    }
}
