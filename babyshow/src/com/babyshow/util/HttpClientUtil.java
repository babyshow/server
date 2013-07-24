/*
 * �� �� ��:  HttpClientUtil.java
 * ��    ��:  HttpClientUtil.java
 * ʱ    ��:  2013-7-8
 */
package com.babyshow.util;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;

/**
 * 
 * ����apache httpclient 4.x ����GET��POST����
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-8]
 */
public class HttpClientUtil
{
    /**
     * ��־
     */
    private static Logger log = Logger.getLogger(HttpClientUtil.class);
    
    /**
     * 
     * ��ָ��URL post���ݣ����ݿ�ΪString��File����Map��ֵ�Զ�Ӧ
     * 
     * �ɹ�����true��ʧ�ܷ���false
     * @param url
     * @param map
     * @return
     */
    public static boolean postData(String url, Map<String, Object> map)
    {
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httpost = new HttpPost(url);
        MultipartEntity multipartEntity = new MultipartEntity();
        Object paramValue = null;
        StringBody stringBody = null;
        FileBody fileBody = null;
        try
        {
            for (String paramName : map.keySet())
            {
                paramValue = map.get(paramName);
                if (paramValue instanceof String)
                {
                    stringBody = new StringBody((String)paramValue);
                    multipartEntity.addPart(paramName, stringBody);
                }
                else if (paramValue instanceof File)
                {
                    fileBody = new FileBody((File)paramValue);
                    multipartEntity.addPart(paramName, fileBody);
                }
            }
        }
        catch (UnsupportedEncodingException e)
        {
            log.info("UnsupportedEncodingException", e);
        }
        
        httpost.setEntity(multipartEntity);
        
        HttpResponse httpResponse = null;
        try
        {
            httpResponse = httpclient.execute(httpost);
        }
        catch (ClientProtocolException e)
        {
            log.info("ClientProtocolException", e);
        }
        catch (IOException e)
        {
            log.info("IOException", e);
        }
        finally
        {
            httpclient.getConnectionManager().shutdown();
        }
        if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
        {
            return true;
        }
        else
        {
            log.info("httpResponse Code is " + httpResponse.getStatusLine().getStatusCode());
            return false;
        }
    }
}
