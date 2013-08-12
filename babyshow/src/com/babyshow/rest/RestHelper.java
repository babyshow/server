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
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.babyshow.image.ImageStaticConstant;
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
    /**
     * 日志
     */
    private static Logger log = Logger.getLogger(RestHelper.class);
    
    /**
     * Rest请求方法名
     */
    private final static String REQUEST = "Request";
    
    /**
     * Rest响应方法名
     */
    private final static String RESTSERVICE = "RestService";
    
    /**
     * Rest服务方法名
     */
    private final static String HANDLEMETHOD = "handle";
    
    /**
     * 
     * rest 请求统一处理方法，接受请求对象、校验信息，统一返回响应对象
     * 
     * @param object
     * @param result
     * @return
     */
    public RestResponse handleRest(HttpHeaders httpheaders, RestRequest restRequest, BindingResult bindingResult)
    {
        // http header 鉴权
        authHttpHeaders(httpheaders);
        
        // 确定Rest请求
        String methodName = restRequest.getClass().getSimpleName();
        String restName = methodName.replace(REQUEST, "");
        String handleName = HANDLEMETHOD + restName;
        RestResponse restResponse = null;
        Object restService = SpringContextUtil.getBean(StringUtil.lowerCaseFirstLetter(restName) + RESTSERVICE);
        Method method = null;
        try
        {
            method = restService.getClass().getMethod(handleName, restRequest.getClass());
            // 静态校验
            if (bindingResult.hasErrors())
            {
                restResponse = handleValidationError(method.getReturnType(), bindingResult);
                return restResponse;
            }
            // 使用java反射分发方法
            restResponse = (RestResponse)method.invoke(restService, restRequest);
        }
        catch (SecurityException e)
        {
            log.error("handleRest SecurityException");
            log.debug(e);
        }
        catch (NoSuchMethodException e)
        {
            log.error("handleRest NoSuchMethodException");
            log.debug(e);
        }
        catch (IllegalArgumentException e)
        {
            log.error("handleRest IllegalArgumentException");
            log.debug(e);
        }
        catch (IllegalAccessException e)
        {
            log.error("handleRest IllegalAccessException");
            log.debug(e);
        }
        catch (InvocationTargetException e)
        {
            log.error("handleRest InvocationTargetException");
            log.debug(e);
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
            log.error("handleValidationError InstantiationException");
            log.debug(e);
        }
        catch (IllegalAccessException e)
        {
            log.error("handleValidationError IllegalAccessException");
            log.debug(e);
        }
        List<ObjectError> objectErrorList = result.getAllErrors();
        ObjectError objectError = objectErrorList.get(0);

        // 获取错误信息
        String errors = objectError.getDefaultMessage();
        generateErrorMsg(restResponse, errors);
        
        String request = objectError.getObjectName();
        restResponse.setRequest(request);
        return restResponse;
    }

    /** 
     * 
     * 根据i18n文件中的错误信息处理返回码和返回信息
     * restResponse值会做相应改变
     * 
     * @param restResponse
     * @param objectError
     */
    public static void generateErrorMsg(RestResponse restResponse, String errors)
    {
        String[] error = errors.split(ImageStaticConstant.I18NSEPARATOR);
        // 国际化文件样式为"错误码#错误信息"
        if(error != null && error.length > 1)
        {
            String errorCode = error[0];
            restResponse.setErrorCode(errorCode);
            String errorMessage = error[1];
            restResponse.setError(errorMessage);
        }
        // 其他错误
        else
        {
            restResponse.setErrorCode(ImageStaticConstant.SYSTEM_ERROR);
            restResponse.setError(errors);
        }
    }
    
    /**
     * 
     * 鉴权http消息头
     * 
     * @param httpheaders
     * @return
     */
    private boolean authHttpHeaders(HttpHeaders httpheaders)
    {
        // TODO 消息头鉴权，目前不需要
        return true;
    }
    
    
    
    
}
