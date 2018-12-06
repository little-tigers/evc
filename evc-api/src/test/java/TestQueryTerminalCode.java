import cn.v1.evc.cec.data.ReqTerminalCode;
import cn.v1.evc.cec.data.ResData;
import cn.v1.evc.cec.data.ResTerminalCode;
import cn.v1.evc.service.EvChargeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description:
 */
public class TestQueryTerminalCode {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-beans.xml");
        EvChargeService evChargeService = (EvChargeService) context.getBean("phChargeService");
        ResData<ResTerminalCode> terminalCodeResData = evChargeService.queryTerminalCode(new ReqTerminalCode("http://wx.evking.cn/app/download?code=2h007h"));
        System.out.printf("stationResData"+terminalCodeResData.getData().getTerminalCode());
    }
}
