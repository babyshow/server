/*
 * 文 件 名:  QiniuDownloadService.java
 * 描    述:  QiniuDownloadService.java
 * 时    间:  2013-7-15
 */
package com.babyshow.upload.qiniu;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONException;
import org.json.JSONStringer;
import org.springframework.stereotype.Service;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-15]
 */
@Service
public class QiniuDownloadService
{
    private static final String ACCESSKEY = "A2_3C646Jg0hz97YXDFMNppLHDNVOhSoCcMdmHra";
    
    private static final String SERKEY = "mthu8pKgS8SxHe9vcd1sE896IRKs-2KDzQiSCW85";
    
    public static final long EXPIRY = System.currentTimeMillis() / 1000 + 3600;
    
    private static final String SCOPE = "showbaby-develop.qiniudn.com/";
    
    
    private String generateSignature(String scope)
    {
        
        String jsonScope = null;
        try
        {
            jsonScope = new JSONStringer().object().key("S").value(scope).key("E").value(EXPIRY).endObject().toString();
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        
        return urlsafeEncode(jsonScope);
    }
    
    private byte[] makeHmac(String signature)
    {
        
        Mac mac = null;
        try
        {
            mac = Mac.getInstance("HmacSHA1");
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        byte[] secretKey = SERKEY.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey, "HmacSHA1");
        try
        {
            mac.init(secretKeySpec);
        }
        catch (InvalidKeyException e)
        {
            e.printStackTrace();
        }
        mac.update(signature.getBytes());
        
        return mac.doFinal();
    }
    
    /**
     * 获取图片下载地址
     * 
     * @param qiniukey 图片在七牛服务器的相对地址
     * @return
     */
    public String token(String qiniukey)
    {
        String scope = SCOPE + qiniukey;
        String signature = generateSignature(scope);
        String checksum = urlsafeEncodeString(makeHmac(signature));
        return ACCESSKEY + ":" + checksum + ":" + signature;
    }
    
    public static byte[] urlsafeEncodeBytes(byte[] src)
    {
        if (src.length % 3 == 0)
        {
            return encodeBase64Ex(src);// , false, true);
        }
        
        byte[] b = encodeBase64Ex(src);// , false, true);
        if (b.length % 4 == 0)
        {
            return b;
        }
        
        int pad = 4 - b.length % 4;
        byte[] b2 = new byte[b.length + pad];
        System.arraycopy(b, 0, b2, 0, b.length);
        b2[b.length] = '=';
        if (pad > 1)
        {
            b2[b.length + 1] = '=';
        }
        return b2;
    }
    
    private static byte[] encodeBase64Ex(byte[] src)
    {
        byte[] b64 = Base64.encodeBase64(src); // urlsafe version is not supported in version 1.4 or lower.
        
        for (int i = 0; i < b64.length; i++)
        {
            if (b64[i] == '/')
            {
                b64[i] = '_';
            }
            else if (b64[i] == '+')
            {
                b64[i] = '-';
            }
        }
        return b64;
    }
    
    public static String urlsafeEncodeString(byte[] src)
    {
        return new String(urlsafeEncodeBytes(src));
    }
    
    public static String urlsafeEncode(String text)
    {
        return new String(urlsafeEncodeBytes(text.getBytes()));
    }
    
}
