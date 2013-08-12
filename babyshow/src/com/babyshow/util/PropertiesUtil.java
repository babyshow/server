/*
 * 文 件 名:  PropertiesUtil.java
 * 描    述:  PropertiesUtil.java
 * 时    间:  2013-8-13
 */
package com.babyshow.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;

import com.babyshow.rest.RestHelper;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-8-13]
 */
public class PropertiesUtil
{
    /**
     * 日志
     */
    private static Logger log = Logger.getLogger(PropertiesUtil.class);
    
    /**
     * 读取国际化资源文件
     * 
     * @param key
     * @return
     */
    public static String loadI18NProperty(String key)
    {
        Properties prop = new Properties(); 
        try
        {
            prop.load(new ClassPathResource("validatorMessages.properties").getInputStream());
        }
        catch (IOException e)
        {
            log.error("load validatorMessages.properties error");
        }
        return prop.getProperty(key);
    }
}
