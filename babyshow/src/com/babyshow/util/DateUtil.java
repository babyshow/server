/*
 * �� �� ��:  DateUtil.java
 * ��    ��:  DateUtil.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
public class DateUtil
{
    
    /**
     * 
     * ��ȡ��ǰ����YYYY-MM-DD��ʽ
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
     * ����ת��ΪYYYY-MM-DD��ʽ
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
     * ����ת��Ϊ14λYYYYMMDDHHMMSS
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
     * ��ȡdate���ڶ�Ӧ�ĺ�����
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
     * ��ȡ��ǰ���ڶ�Ӧ�ĺ�����
     * @return
     */
    public static long generateNowMillSecond()
    {
        Date date = new Date();
        return generateMillSecond(date);
    }
}
