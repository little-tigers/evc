package cn.v1.evc.cec.util;

import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by wr
 * on 2018/8/23
 */
public class AESUtil {

    /**
     * 加密
     *
     * @param content 需要加密的内容
     * @param aesKey  密钥，必须是16位字符串
     * @return
     */
    public static byte[] encrypt(String content, String aesKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec keySpec = new SecretKeySpec(aesKey.getBytes(), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] result = cipher.doFinal(content.getBytes("utf-8"));
            return result;
        } catch (Exception e) {
            System.err.println("加密失败，" + e.getMessage());
        }

        return null;

    }

    /**
     * AES加密
     *
     * @param content    待加密的内容
     * @param encryptKey 加密密钥
     * @return 加密后的byte[]
     * @throws Exception
     */
    public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
        KeyGenerator kGen = KeyGenerator.getInstance("AES");
        kGen.init(128);
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));

        return cipher.doFinal(content.getBytes("utf-8"));
    }

    /**
     * 解密
     *
     * @param content 要解密的内容
     * @param aesKey  密钥，必须是16位字符串
     * @return
     */
    public static String decrypt(byte[] content, String aesKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec keySpec = new SecretKeySpec(aesKey.getBytes(), "AES");
            cipher.init(Cipher.DECRYPT_MODE, keySpec);

            byte[] result = cipher.doFinal(content);
            return new String(result);

        } catch (Exception e) {
            System.err.println("解密失败，" + e.getMessage());
        }

        return null;

    }

    /**
     * 生成AES密钥 AES密钥生成规则：
     * 1、utToken、ts、appKey。utToken=test，ts=12345678，appkey
     * =app，则拼接后的值为test12345678app
     * 2、将拼接后的值按字典进行排序，得到值为12345678aeppstt，并进行16位的MD5加密，得到值即为AES加密密钥
     *
     * @param utToken
     * @param ts
     * @param appKey
     * @return
     */
    public static String generateAesKey(String utToken, String ts, String appKey) {
        String s = utToken + ts + appKey;
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String aesKey = MD5Util.getMD5(new String(charArr));
        return aesKey;
    }

    // 加密
    public static String getBase64(String str) {
        byte[] b = null;
        String s = null;
        try {
            b = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (b != null) {
            s = new Base64().encodeAsString(b);
        }
        return s;
    }

    // 解密
    public static String getFromBase64(String s) {
        byte[] b = null;
        String result = null;
        if (s != null) {
            Base64 decoder = new Base64();
            try {
                b = decoder.decode(s);
                result = new String(b, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * "AES/CBC/PKCS5Padding"
     *
     * @param data
     * @param secret
     * @param secretIv
     * @return
     * @throws Exception
     */
    public static byte[] encryptCBC(String data, String secret, String secretIv) throws Exception {
        SecretKeySpec seKey = new SecretKeySpec(secret.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, seKey, new IvParameterSpec(secretIv.getBytes()));
        byte[] decrypted = cipher.doFinal(data.getBytes());
        return decrypted;
    }

    // 解密
    public static byte[] DecryptCBC(byte[] data, String secret, String secretIv) throws Exception {
        SecretKeySpec sKeySpec = new SecretKeySpec(secret.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec(secretIv.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, sKeySpec, iv);
        byte[] dataByte = data;
        return cipher.doFinal(dataByte);
    }

    public static void main(String[] args) throws Exception {
        String content = "您好";
        String result = new String(Base64.encodeBase64String(aesEncryptToBytes(content, "abcdefgabcdefg12")));
        System.out.println(result);
        content = result;
        System.out.println(decrypt(Base64.decodeBase64(content), "abcdefgabcdefg12".toLowerCase()));
    }

    public static String encrypt1(String content, String encryptKey) throws Exception {
        return Base64.encodeBase64String(encrypt(content, encryptKey));
    }
}
