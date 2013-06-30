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
}
