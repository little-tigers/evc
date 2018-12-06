package cn.v1.evc.cec.util;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class RandomUtils {

    public static String randomUUID() {
        String uuid = UUID.randomUUID().toString().replaceAll("\\-", "");
        return uuid;
    }

    public static String randomSeqUUID() {
        return RandomUtils.randomSeqUUID(new Date());
    }

    public static String randomSeqUUID(Date date) {
        String uuid = String.valueOf(date.getTime()) + "-" + UUID.randomUUID().toString().replaceAll("\\-", "");
        return uuid;
    }

    public static String randomWord(int len) {
        char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        return RandomUtils.randomWord(str, len);
    }

    public static String randomNumber(int len) {
        char[] str = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        return RandomUtils.randomWord(str, len);
    }

    private static String randomWord(char[] str, int len) {
        int maxNum = str.length;
        int i;
        int count = 0;
        StringBuffer randomStr = new StringBuffer("");
        Random r = new Random();
        while (count < len) {
            i = Math.abs(r.nextInt(maxNum));
            if (i >= 0 && i < str.length) {
                randomStr.append(str[i]);
                count++;
            }
        }
        return randomStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(RandomUtils.randomWord(6));
        System.out.println(RandomUtils.randomNumber(4));
        System.out.println(RandomUtils.randomUUID());
    }
}
