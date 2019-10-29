package cn.vast.ssm.util;

/**
 * 字符串处理工具类
 *
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/28 23:29
 */
public class StringUtil {
    /**
     * 字符串是否为空
     *
     * @param str 待判断字符串
     *
     * @return 是否为空字符串
     */
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    /**
     * 字符串是否不为空
     *
     * @param str 待判断字符串
     *
     * @return 是否不为空字符串
     */
    public static boolean isNotEmpty(String str) {
        return str != null && !"".equals(str.trim());
    }

    /**
     * 拼接模糊查询条件字符串
     *
     * @param str
     *
     * @return
     */
    public static String formatLike(String str) {
        if (isNotEmpty(str)) {
            return "%" + str + "%";
        }
        return null;
    }
}
