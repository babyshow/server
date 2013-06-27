/*
 * 文 件 名:  RestHelper.java
 * 描    述:  RestHelper.java
 * 时    间:  2013-6-27
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
 * <一句话功能简述>
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
     * rest 请求统一处理方法，接受请求对象、校验信息，统一返回响应对象
     * 
     * @param object
     * @param result
     * @return
     */
    public RestResponse handleRest(RestRequest restRequest, BindingResult result)
    {
        String methodName = restRequest.getClass().getSimpleName();
        // 确定Rest请求
        String restName = methodName.replace(REQUEST, "");
        String handleName = HANDLEMETHOD + restName;
        RestResponse restResponse = null;
        Object restService = SpringContextUtil.getBean(StringUtil.lowerCaseFirstLetter(restName) + RESTSERVICE);
        Method method = null;
        try
        {
            method = restService.getClass().getMethod(handleName, restRequest.getClass());
            // 静态校验
            if (result.hasErrors())
            {
                restResponse = handleValidationError(method.getReturnType(), result);
            }
            // 使用java反射分发方法
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
     * 处理静态校验错误情况时的返回
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
