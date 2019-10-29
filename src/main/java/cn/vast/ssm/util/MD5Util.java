package cn.vast.ssm.util;

import java.security.MessageDigest;

/**
 * MD5加密工具
 *
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/28 23:10
 */
public class MD5Util {
    private static final String[] HEX_DIGITS = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f"
    };

    /**
     * MD5编码加密
     *
     * @param origin      源字符串
     * @param charsetName 编码类型
     *
     * @return 加密后的字符串
     */
    public static String MD5Encode(String origin, String charsetName) {
        String resultString = null;
        try {
            resultString = origin;
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetName == null || "".equals(charsetName)) {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetName)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultString;
    }

    /**
     * 二进制数组转16进制
     *
     * @param bytes 二进制数组
     *
     * @return 16进制字符串
     */
    private static String byteArrayToHexString(byte[] bytes) {
        StringBuilder resultSbf = new StringBuilder();
        for (byte b : bytes) {
            resultSbf.append(byteToHexString(b));
        }

        return resultSbf.toString();
    }

    /**
     * byte转换16进制
     *
     * @param b 待转换数值
     *
     * @return 对应的16进制
     */
    private static String byteToHexString(byte b) {
        int num = b;
        if (num < 0) {
            num += 256;
        }

        int quotient = num / 16;
        int remainder = num % 16;

        return HEX_DIGITS[quotient] + HEX_DIGITS[remainder];
    }

}
