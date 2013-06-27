/*
 * �� �� ��:  SpringContextUtil.java
 * ��    ��:  SpringContextUtil.java
 * ʱ    ��:  2013-6-27
 */
package com.babyshow.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-27]
 */
@Service
public class SpringContextUtil implements ApplicationContextAware
{
    
    /**
     * SpringӦ�������Ļ���
     */
    @Autowired
    private static ApplicationContext applicationContext;
    
    /**
     * 
     * ʵ��ApplicationContextAware�ӿڵĻص����������������Ļ���
     * 
     * @param applicationContext
     */
    public void setApplicationContext(ApplicationContext applicationContext)
    {
        SpringContextUtil.applicationContext = applicationContext;
    }
    
    /**
     * 
     * ��ȡApplicationContext����
     * 
     * @return
     */
    public static ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }
    
    /**
     * ��ȡ���� ������д��bean����������Ҫ����
     * 
     * @param beanName
     * @return Object beanName��Ӧspring�����е�ʵ��
     */
    public static Object getBean(String beanName)
    {
        return applicationContext.getBean(beanName);
    }
}
