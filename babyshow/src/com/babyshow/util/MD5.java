/*
 * 文 件 名:  MD5.java
 * 描    述:  MD5.java
 * 时    间:  2013-7-1
 */
package com.babyshow.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
public final class MD5
{
    private static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    
    /**
     * 
     * 获取MD5加密字串
     * 
     * @param str
     * @return
     */
    public static String md5Str(String str)
    {
        if (str == null)
        {
            return "";
        }
        return md5Str(str, 0);
    }
    
    private static String md5Str(String str, int offset)
    {
        try
        {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] b = str.getBytes("UTF8");
            md5.update(b, offset, b.length);
            return byteArrayToHexString(md5.digest());
        }
        catch (NoSuchAlgorithmException ex)
        {
            return null;
        }
        catch (UnsupportedEncodingException ex)
        {
            return null;
        }
    }
    
    private static String byteArrayToHexString(byte[] b)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < b.length; i++)
        {
            sb.append(byteToHexString(b[i]));
        }
        return sb.toString();
    }
    
    private static String byteToHexString(byte b)
    {
        int n = b;
        if (n < 0)
        {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
}