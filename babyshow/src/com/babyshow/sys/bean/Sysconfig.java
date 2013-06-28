/*
 * 文 件 名:  Sysconfig.java
 * 描    述:  Sysconfig.java
 * 时    间:  2013-6-17
 */
package com.babyshow.sys.bean;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class Sysconfig
{
    /**
     * 配置ID
     */
    private Integer id;
    
    /**
     * 参数代码
     */
    private String paramCode;
    
    /**
     * 参数值
     */
    private String paramValue;
    
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 获取 paramCode
     * 
     * @return 返回 paramCode
     */
    public String getParamCode()
    {
        return paramCode;
    }
    
    /**
     * 设置 paramCode
     * 
     * @param 对paramCode进行赋值
     */
    public void setParamCode(String paramCode)
    {
        this.paramCode = paramCode;
    }
    
    /**
     * 获取 paramValue
     * 
     * @return 返回 paramValue
     */
    public String getParamValue()
    {
        return paramValue;
    }
    
    /**
     * 设置 paramValue
     * 
     * @param 对paramValue进行赋值
     */
    public void setParamValue(String paramValue)
    {
        this.paramValue = paramValue;
    }
    
    /**
     * 获取 remark
     * 
     * @return 返回 remark
     */
    public String getRemark()
    {
        return remark;
    }
    
    /**
     * 设置 remark
     * 
     * @param 对remark进行赋值
     */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
    /**
     * 获取 id
     * 
     * @return 返回 id
     */
    public Integer getId()
    {
        return id;
    }
    
    /**
     * 设置 id
     * 
     * @param 对id进行赋值
     */
    public void setId(Integer id)
    {
        this.id = id;
    }
    
}
