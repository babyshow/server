/*
 * 文 件 名:  DateUtil.java
 * 描    述:  DateUtil.java
 * 时    间:  2013-7-1
 */
package com.babyshow.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
public class DateUtil
{
    
    /**
     * 
     * 获取当前日期YYYY-MM-DD格式
     * 
     * @param date
     * @return
     */
    public static String getNowNormalFormatString()
    {
        return dateToNormalFormatString(new Date());
    }
    
    /**
     * 
     * 日期转化为YYYY-MM-DD格式
     * 
     * @param date
     * @return
     */
    public static String dateToNormalFormatString(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    
    /**
     * 
     * 日期转化为14位YYYYMMDDHHMMSS
     * 
     * @param date
     * @return
     */
    public static String dateTo14String(Date date)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(date);
    }
    
    /**
     * 
     * 获取date日期对应的毫秒数
     * 
     * @param date
     * @return
     */
    public static long generateMillSecond(Date date)
    {
        return date.getTime();
    }
    
    /**
     * 
     * 获取当前日期对应的毫秒数
     * @return
     */
    public static long generateNowMillSecond()
    {
        Date date = new Date();
        return generateMillSecond(date);
    }
}
