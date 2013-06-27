/*
 * �� �� ��:  RestHelper.java
 * ��    ��:  RestHelper.java
 * ʱ    ��:  2013-6-27
 */
package com.babyshow.rest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.babyshow.util.SpringContextUtil;
import com.babyshow.util.StringUtil;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-27]
 */
@Service
public class RestHelper
{
    private static Logger log = Logger.getLogger(RestHelper.class);
    
    private final static String REQUEST = "Request";
    
    private final static String RESTSERVICE = "RestService";
    
    private final static String HANDLEMETHOD = "handle";
    
    /**
     * 
     * rest ����ͳһ�������������������У����Ϣ��ͳһ������Ӧ����
     * 
     * @param object
     * @param result
     * @return
     */
    public RestResponse handleRest(RestRequest restRequest, BindingResult result)
    {
        String methodName = restRequest.getClass().getSimpleName();
        // ȷ��Rest����
        String restName = methodName.replace(REQUEST, "");
        String handleName = HANDLEMETHOD + restName;
        RestResponse restResponse = null;
        Object restService = SpringContextUtil.getBean(StringUtil.lowerCaseFirstLetter(restName) + RESTSERVICE);
        Method method = null;
        try
        {
            method = restService.getClass().getMethod(handleName, restRequest.getClass());
            // ��̬У��
            if (result.hasErrors())
            {
                restResponse = handleValidationError(method.getReturnType(), result);
            }
            // ʹ��java����ַ�����
            restResponse = (RestResponse)method.invoke(restService, restRequest);
        }
        catch (SecurityException e)
        {
            log.error("handleRest SecurityException", e);
        }
        catch (NoSuchMethodException e)
        {
            log.error("handleRest NoSuchMethodException", e);
        }
        catch (IllegalArgumentException e)
        {
            log.error("handleRest IllegalArgumentException", e);
        }
        catch (IllegalAccessException e)
        {
            log.error("handleRest IllegalAccessException", e);
        }
        catch (InvocationTargetException e)
        {
            log.error("handleRest InvocationTargetException", e);
        }
        return restResponse;
    }
    
    /**
     * 
     * ����̬У��������ʱ�ķ���
     * 
     * @param clazz
     * @param result
     * @return
     */
    private RestResponse handleValidationError(Class<?> clazz, BindingResult result)
    {
        RestResponse restResponse = null;
        try
        {
            restResponse = (RestResponse)clazz.newInstance();
        }
        catch (InstantiationException e)
        {
            log.error("handleValidationError InstantiationException", e);
        }
        catch (IllegalAccessException e)
        {
            log.error("handleValidationError IllegalAccessException", e);
        }
        List<ObjectError> objectErrorList = result.getAllErrors();
        ObjectError objectError = objectErrorList.get(0);
        restResponse.setError(objectError.getDefaultMessage());
        return restResponse;
    }
    
}
