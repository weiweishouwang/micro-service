package com.zhw.ms.common.utils;

import java.util.regex.Pattern;

/**
 * Created by 小殊 on 2016/5/6.10:37.
 * 字符串通用
 */
public class StringUtil {

    /**
     * 判断当前字符串是否都不为空
     *
     * @param values 被验证的字符串
     * @return ture :都不为空，false包含空值
     */
    public static boolean isNotEmpty(String... values) {
        boolean bNotEmpty = true;
        if (values!=null&&values.length > 0) {
            for (String item : values) {
                if (isEmpty(item)) {
                    bNotEmpty = false;
                    break;
                }
            }
        } else {
            bNotEmpty = false;
        }
        return bNotEmpty;
    }

    /**
     * 判断字符串为空
     *
     * @param value 被验证的字符串
     * @return ture :空字符串，false：非空字符串
     */
    public static boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }

    /**
     * 是否是数字
     *
     * @param value 验证字符串
     * @return the boolean
     */
    public static boolean isNumeric(String value){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(value).matches();
    }
}
