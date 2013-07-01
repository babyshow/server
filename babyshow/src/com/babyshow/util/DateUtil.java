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
}
