/*
 * �� �� ��:  RestResponse.java
 * ��    ��:  RestResponse.java
 * ʱ    ��:  2013-6-27
 */
package com.babyshow.rest;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-27]
 */
public abstract class RestResponse
{
    /**
     * ������Rest��ַ
     */
    private String request;
    
    /**
     * ������
     */
    private String errorCode;
    
    /**
     * ������Ϣ
     */
    private String error;
    
    /**
     * ��ȡ request
     * 
     * @return ���� request
     */
    public String getRequest()
    {
        return request;
    }
    
    /**
     * ���� request
     * 
     * @param ��request���и�ֵ
     */
    public void setRequest(String request)
    {
        this.request = request;
    }
    
    /**
     * ��ȡ errorCode
     * 
     * @return ���� errorCode
     */
    public String getErrorCode()
    {
        return errorCode;
    }
    
    /**
     * ���� errorCode
     * 
     * @param ��errorCode���и�ֵ
     */
    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }
    
    /**
     * ��ȡ error
     * 
     * @return ���� error
     */
    public String getError()
    {
        return error;
    }
    
    /**
     * ���� error
     * 
     * @param ��error���и�ֵ
     */
    public void setError(String error)
    {
        this.error = error;
    }
    
}
