/*
 * 文 件 名:  QiniuUploadService.java
 * 描    述:  QiniuUploadService.java
 * 时    间:  2013-7-11
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
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-11]
 */
@Service
public class QiniuUploadService
{
    private static final String SCOPE = "showbaby-develop";
    
    public static final long DEADLINE = System.currentTimeMillis() / 1000 + 3600;
    
    public String callbackUrl;
    
    public String returnUrl;
    
    public void setCallbackUrl(String callbackUrl)
    {
        this.callbackUrl = callbackUrl;
    }
    
    public void setReturnUrl(String returnUrl)
    {
        this.returnUrl = returnUrl;
    }
    
    public String marshal()
        throws JSONException
    {
        
        JSONStringer stringer = new JSONStringer();
        
        stringer.object();
        stringer.key("scope").value(SCOPE);
        if (this.callbackUrl != null)
        {
            stringer.key("callbackUrl").value(this.callbackUrl);
        }
        if (this.returnUrl != null)
        {
            stringer.key("returnUrl").value(this.returnUrl);
        }
        stringer.key("deadline").value(this.DEADLINE);
        stringer.endObject();
        
        return stringer.toString();
    }
    
    public byte[] makeAuthToken()
    {
        
        byte[] accessKey = "A2_3C646Jg0hz97YXDFMNppLHDNVOhSoCcMdmHra".getBytes();
        byte[] secretKey = "mthu8pKgS8SxHe9vcd1sE896IRKs-2KDzQiSCW85".getBytes();
        try
        {
            String policyJson = this.marshal();
            byte[] policyBase64 = urlsafeEncodeBytes(policyJson.getBytes());
            
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec keySpec = new SecretKeySpec(secretKey, "HmacSHA1");
            mac.init(keySpec);
            
            byte[] digest = mac.doFinal(policyBase64);
            byte[] digestBase64 = urlsafeEncodeBytes(digest);
            byte[] token = new byte[accessKey.length + 30 + policyBase64.length];
            
            System.arraycopy(accessKey, 0, token, 0, accessKey.length);
            token[accessKey.length] = ':';
            System.arraycopy(digestBase64, 0, token, accessKey.length + 1, digestBase64.length);
            token[accessKey.length + 29] = ':';
            System.arraycopy(policyBase64, 0, token, accessKey.length + 30, policyBase64.length);
            
            return token;
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch (InvalidKeyException e)
        {
            e.printStackTrace();
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public String makeAuthTokenString()
    {
        byte[] authToken = this.makeAuthToken();
        return new String(authToken);
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
}
