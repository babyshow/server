/*
 * �� �� ��:  StringUtil.java
 * ��    ��:  StringUtil.java
 * ʱ    ��:  2013-6-27
 */
package com.babyshow.util;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-27]
 */
public class StringUtil
{
    /**
     * 
     * ���ַ�������ĸСд
     * 
     * @param s
     * @return
     */
    public static String lowerCaseFirstLetter(String str)
    {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

}
