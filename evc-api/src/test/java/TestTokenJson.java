import cn.v1.evc.base.CecCodeEnum;
import cn.v1.evc.cec.token.CecToken;

/**
 * @Auther: wr
 * @Date: 2018/11/22
 * @Description:
 */
public class TestTokenJson {

    public static void main(String[] args) {
        String tokenStr = CecToken.getAccessToken(CecCodeEnum.PH.getValue());
        System.out.printf("token:"+tokenStr);
    }
}
