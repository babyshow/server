/*
 * 文 件 名:  UUIDGenerator.java
 * 描    述:  UUIDGenerator.java
 * 时    间:  2013-6-20
 */
package com.babyshow.util;

import java.util.UUID;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UUIDGenerator
{
    
    private static final String IOS_USERID_PRIFIX = "IOS-U-";
    
    /**
     * 
     * 获取唯一的Code
     * 
     * @return
     */
    public static String generateUserCode()
    {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }
    
}
