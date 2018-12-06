package cn.v1.evc.base;

/**
 * @Auther: wr
 * @Date: 2018/11/23
 * @Description:
 */
public enum CecCodeEnum {
    PH("PH"),TLD("TLD");

    private final String value;

    CecCodeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
