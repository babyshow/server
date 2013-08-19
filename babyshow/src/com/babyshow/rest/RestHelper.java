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
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.babyshow.image.ImageStaticConstant;
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
    /**
     * ��־
     */
    private static Logger log = Logger.getLogger(RestHelper.class);
    
    /**
     * Rest���󷽷���
     */
    private final static String REQUEST = "Request";
    
    /**
     * Rest��Ӧ������
     */
    private final static String RESTSERVICE = "RestService";
    
    /**
     * Rest���񷽷���
     */
    private final static String HANDLEMETHOD = "handle";
    
    /**
     * 
     * rest ����ͳһ�������������������У����Ϣ��ͳһ������Ӧ����
     * 
     * @param object
     * @param result
     * @return
     */
    public RestResponse handleRest(HttpHeaders httpheaders, RestRequest restRequest, BindingResult bindingResult)
    {
        // http header ��Ȩ
        authHttpHeaders(httpheaders);
        
        // ȷ��Rest����
        String methodName = restRequest.getClass().getSimpleName();
        String restName = methodName.replace(REQUEST, "");
        String handleName = HANDLEMETHOD + restName;
        RestResponse restResponse = null;
        Object restService = SpringContextUtil.getBean(StringUtil.lowerCaseFirstLetter(restName) + RESTSERVICE);
        Method method = null;
        try
        {
            method = restService.getClass().getMethod(handleName, restRequest.getClass());
            // ��̬У��
            if (bindingResult.hasErrors())
            {
                restResponse = handleValidationError(method.getReturnType(), bindingResult);
                return restResponse;
            }
            // ʹ��java����ַ�����
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

        // ��ȡ������Ϣ
        String errors = objectError.getDefaultMessage();
        generateErrorMsg(restResponse, errors);
        
        String request = objectError.getObjectName();
        restResponse.setRequest(request);
        return restResponse;
    }

    /** 
     * 
     * ����i18n�ļ��еĴ�����Ϣ��������ͷ�����Ϣ
     * restResponseֵ������Ӧ�ı�
     * 
     * @param restResponse
     * @param objectError
     */
    public static void generateErrorMsg(RestResponse restResponse, String errors)
    {
        String[] error = errors.split(ImageStaticConstant.I18NSEPARATOR);
        // ���ʻ��ļ���ʽΪ"������#������Ϣ"
        if(error != null && error.length > 1)
        {
            String errorCode = error[0];
            restResponse.setErrorCode(errorCode);
            String errorMessage = error[1];
            restResponse.setError(errorMessage);
        }
        // ��������
        else
        {
            restResponse.setErrorCode(ImageStaticConstant.SYSTEM_ERROR);
            restResponse.setError(errors);
        }
    }
    
    /**
     * 
     * ��Ȩhttp��Ϣͷ
     * 
     * @param httpheaders
     * @return
     */
    private boolean authHttpHeaders(HttpHeaders httpheaders)
    {
        // TODO ��Ϣͷ��Ȩ��Ŀǰ����Ҫ
        return true;
    }
    
    
    
    
}
