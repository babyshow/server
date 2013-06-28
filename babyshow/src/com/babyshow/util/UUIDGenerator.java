/*
 * �� �� ��:  UUIDGenerator.java
 * ��    ��:  UUIDGenerator.java
 * ʱ    ��:  2013-6-20
 */
package com.babyshow.util;

import java.util.UUID;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UUIDGenerator
{
    
    private static final String IOS_USERID_PRIFIX = "IOS-U-";
    
    /**
     * 
     * ��ȡΨһ��Code
     * 
     * @return
     */
    public static String generateUserCode()
    {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }
    
}
