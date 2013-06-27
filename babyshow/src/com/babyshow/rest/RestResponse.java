/*
 * 文 件 名:  RestResponse.java
 * 描    述:  RestResponse.java
 * 时    间:  2013-6-27
 */
package com.babyshow.rest;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-27]
 */
public abstract class RestResponse
{
    /**
     * 所请求Rest地址
     */
    private String request;
    
    /**
     * 错误码
     */
    private String errorCode;
    
    /**
     * 错误信息
     */
    private String error;
    
    /**
     * 获取 request
     * 
     * @return 返回 request
     */
    public String getRequest()
    {
        return request;
    }
    
    /**
     * 设置 request
     * 
     * @param 对request进行赋值
     */
    public void setRequest(String request)
    {
        this.request = request;
    }
    
    /**
     * 获取 errorCode
     * 
     * @return 返回 errorCode
     */
    public String getErrorCode()
    {
        return errorCode;
    }
    
    /**
     * 设置 errorCode
     * 
     * @param 对errorCode进行赋值
     */
    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }
    
    /**
     * 获取 error
     * 
     * @return 返回 error
     */
    public String getError()
    {
        return error;
    }
    
    /**
     * 设置 error
     * 
     * @param 对error进行赋值
     */
    public void setError(String error)
    {
        this.error = error;
    }
    
}
