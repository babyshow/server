/*
 * 文 件 名:  StringUtil.java
 * 描    述:  StringUtil.java
 * 时    间:  2013-6-27
 */
package com.babyshow.util;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-27]
 */
public class StringUtil
{
    /**
     * 
     * 将字符串首字母小写
     * 
     * @param s
     * @return
     */
    public static String lowerCaseFirstLetter(String str)
    {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

}
