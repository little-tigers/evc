/**
 * Create by gen
 */
package cn.v1.evc.cec.util;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * 字符串工具类, 继承org.apache.commons.lang3.StringUtils类
 *
 * @author ThinkGem
 * @version 2013-05-22
 */
public class StringUtil extends org.apache.commons.lang3.StringUtils {

    private static final char SEPARATOR = '_';
    private static final String CHARSET_NAME = "UTF-8";

    private static final String UNIT = "万千佰拾亿千佰拾万千佰拾元角分";
    private static final String DIGIT = "零壹贰叁肆伍陆柒捌玖";

    /**
     * 缩略字符串（不区分中英文字符）
     *
     * @param str    目标字符串
     * @param length 截取长度
     * @return
     */
    public static String abbr(String str, int length) {
        if (str == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int currentLength = 0;
            for (char c : replaceHtml(StringEscapeUtils.unescapeHtml4(str)).toCharArray()) {
                currentLength += String.valueOf(c).getBytes("GBK").length;
                if (currentLength <= length - 3) {
                    sb.append(c);
                } else {
                    sb.append("...");
                    break;
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 将小写金额转换成大写
     *
     * @param v 要转换的金额
     * @return
     */
    public static String change(double v) {
        if (v < 0 || v > Double.MAX_VALUE) {
            return "参数非法!";
        }
        long l = Math.round(v * 100);
        if (l == 0) {
            return "零元整";
        }
        String strValue = l + "";
        // i用来控制数
        int i = 0;
        // j用来控制单位
        int j = UNIT.length() - strValue.length();
        String rs = "";
        boolean isZero = false;
        for (; i < strValue.length(); i++, j++) {
            char ch = strValue.charAt(i);
            if (ch == '0') {
                isZero = true;
                if (UNIT.charAt(j) == '亿' || UNIT.charAt(j) == '万' || UNIT.charAt(j) == '元') {
                    rs = rs + UNIT.charAt(j);
                    isZero = false;
                }
            } else {
                if (isZero) {
                    rs = rs + "零";
                    isZero = false;
                }
                rs = rs + DIGIT.charAt(ch - '0') + UNIT.charAt(j);
            }
        }
        //      if (!rs.endsWith("分")) {
        //          rs = rs + "整";
        //      }
        rs = rs.replaceAll("亿万", "亿");
        return rs;
    }

    /**
     * "null"字符串转换为0
     *
     * @param str
     * @return
     * @author zzm
     * @date 2016年12月15日 下午4:58:48
     */
    public static String formatNullStrToZero(String str) {
        if (StringUtil.equals("null", str)
                || StringUtil.equals("Null", str)) {
            return "0";
        }
        return str;
    }

    /**
     * 转换为字节数组
     *
     * @param str
     * @return
     */
    public static byte[] getBytes(String str) {
        if (str != null) {
            try {
                return str.getBytes(CHARSET_NAME);
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        } else {
            return null;
        }
    }


    /**
     * 是否包含字符串
     *
     * @param str  验证字符串
     * @param strs 字符串组
     * @return 包含返回true
     */
    public static boolean inString(String str, String... strs) {
        if (str != null) {
            for (String s : strs) {
                if (str.equals(StringUtils.trim(s))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 转换为JS获取对象值，生成三目运算返回结果
     *
     * @param objectString 对象串
     *                     例如：row.user.id
     *                     返回：!row?'':!row.user?'':!row.user.id?'':row.user.id
     */
    public static String jsGetVal(String objectString) {
        StringBuilder result = new StringBuilder();
        StringBuilder val = new StringBuilder();
        String[] vals = StringUtils.split(objectString, ".");
        for (int i = 0; i < vals.length; i++) {
            val.append("." + vals[i]);
            result.append("!" + (val.substring(1)) + "?'':");
        }
        result.append(val.substring(1));
        return result.toString();
    }

    /**
     * 替换掉HTML标签方法
     */
    public static String replaceHtml(String html) {
        if (StringUtils.isBlank(html)) {
            return "";
        }
        String regEx = "<.+?>";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(html);
        String s = m.replaceAll("");
        return s;
    }

    /**
     * 替换为手机识别的HTML，去掉样式及属性，保留回车。
     *
     * @param html
     * @return
     */
    public static String replaceMobileHtml(String html) {
        if (html == null) {
            return "";
        }
        return html.replaceAll("<([a-z]+?)\\s+?.*?>", "<$1>");
    }

    /**
     * 转换字符串成SQL IN字符串
     *
     * @param str 对象串
     */
    public static String splitSqlIn(String str, String separatorChar) {
        return splitSqlIn(str, separatorChar, "','");
    }

    public static String splitSqlIn(String str, String separatorChar, String replaceChar) {
        StringBuffer result = new StringBuffer();
        result.append("'");
        result.append(str.replaceAll(separatorChar, replaceChar));
        result.append("'");
        return result.toString();
    }

    /**
     * 过滤表情与其他特殊字符，只保留汉字、字母、数字、下划线
     */
    public static String strFilter(String srcString) throws PatternSyntaxException {
        if (srcString == null) return null;
        Pattern pattern = Pattern.compile("^[\u4e00-\u9fa5_\\-!a-zA-Z0-9]+$");
        StringBuilder newName = new StringBuilder();
        for (int i = 0; i < srcString.length(); i++) {
            String tmp = srcString.substring(i, i + 1);
            if (pattern.matcher(tmp).matches()) {
                newName.append(tmp);
            }
        }
        return newName.toString();
    }

    /**
     * 驼峰命名法工具
     *
     * @return toCamelCase(" hello_world ") == "helloWorld"
     * toCapitalizeCamelCase("hello_world") == "HelloWorld"
     * toUnderScoreCase("helloWorld") = "hello_world"
     */
    public static String toCamelCase(String s) {
        if (s == null) {
            return null;
        }

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder(s.length());
        boolean upperCase = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == SEPARATOR) {
                upperCase = true;
            } else if (upperCase) {
                sb.append(Character.toUpperCase(c));
                upperCase = false;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    /**
     * 驼峰命名法工具
     *
     * @return toCamelCase(" hello_world ") == "helloWorld"
     * toCapitalizeCamelCase("hello_world") == "HelloWorld"
     * toUnderScoreCase("helloWorld") = "hello_world"
     */
    public static String toCapitalizeCamelCase(String s) {
        if (s == null) {
            return null;
        }
        s = toCamelCase(s);
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    /**
     * 转换为Double类型
     */
    public static Double toDouble(Object val) {
        if (val == null) {
            return 0D;
        }
        try {
            return Double.valueOf(StringUtils.trim(val.toString()));
        } catch (Exception e) {
            return 0D;
        }
    }

    /**
     * 转换为Float类型
     */
    public static Float toFloat(Object val) {
        return toDouble(val).floatValue();
    }

    /**
     * 转换为Integer类型
     */
    public static Integer toInteger(Object val) {
        return toLong(val).intValue();
    }

    /**
     * 转换为Long类型
     */
    public static Long toLong(Object val) {
        return toDouble(val).longValue();
    }

    /**
     * 转换为字节数组
     *
     * @param bytes
     * @return
     */
    public static String toString(byte[] bytes) {
        try {
            return new String(bytes, CHARSET_NAME);
        } catch (UnsupportedEncodingException e) {
            return StringUtils.EMPTY;
        }
    }

    /**
     * 驼峰命名法工具
     *
     * @return toCamelCase(" hello_world ") == "helloWorld"
     * toCapitalizeCamelCase("hello_world") == "HelloWorld"
     * toUnderScoreCase("helloWorld") = "hello_world"
     */
    public static String toUnderScoreCase(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean nextUpperCase = true;

            if (i < (s.length() - 1)) {
                nextUpperCase = Character.isUpperCase(s.charAt(i + 1));
            }

            if ((i > 0) && Character.isUpperCase(c)) {
                if (!upperCase || !nextUpperCase) {
                    sb.append(SEPARATOR);
                }
                upperCase = true;
            } else {
                upperCase = false;
            }

            sb.append(Character.toLowerCase(c));
        }

        return sb.toString();
    }

    /**
     * 压缩json<br/>
     * 将格式化的json字符串压缩为一行，去掉空格、tab，并把换行符改为显式的\r\n <br/>
     * ！！！只能处理正确json字符串，不对json字符串做校验
     *
     * @param json
     * @return
     */
    public static String compress(String json) {
        if (json == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean skip = true;// true 允许截取(表示未进入string双引号)
        boolean escaped = false;// 转义符
        for (int i = 0; i < json.length(); i++) {
            char c = json.charAt(i);
            if (!escaped && c == '\\') {
                escaped = true;
            } else {
                escaped = false;
            }
            if (skip) {
                if (c == ' ' || c == '\r' || c == '\n' || c == '\t') {
                    continue;
                }
            }
            sb.append(c);
            if (c == '"' && !escaped) {
                skip = !skip;
            }
        }
        return sb.toString().replaceAll("\r\n", "\\\\r\\\\n");
    }

    public static int compareTo(final CharSequence seq1, final CharSequence seq2) {
        return (seq1 == null ? "" : seq1.toString())
                .compareTo((seq2 == null ? "" : seq2.toString()));
    }

    //统计字符串重复字符次数集合
    public static Map<String, Integer> getRepeatNumMap(String[] array) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        num++;
                    }
                }
                map.put(array[i], num);
                num = 0;
            }
        }
        return map;
    }
}
