/*
 * 文 件 名:  SpringContextUtil.java
 * 描    述:  SpringContextUtil.java
 * 时    间:  2013-6-27
 */
package com.babyshow.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-27]
 */
@Service
public class SpringContextUtil implements ApplicationContextAware
{
    
    /**
     * Spring应用上下文环境
     */
    @Autowired
    private static ApplicationContext applicationContext;
    
    /**
     * 
     * 实现ApplicationContextAware接口的回调方法，设置上下文环境
     * 
     * @param applicationContext
     */
    public void setApplicationContext(ApplicationContext applicationContext)
    {
        SpringContextUtil.applicationContext = applicationContext;
    }
    
    /**
     * 
     * 获取ApplicationContext对象
     * 
     * @return
     */
    public static ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }
    
    /**
     * 获取对象 这里重写了bean方法，起主要作用
     * 
     * @param beanName
     * @return Object beanName对应spring容器中的实例
     */
    public static Object getBean(String beanName)
    {
        return applicationContext.getBean(beanName);
    }
}
