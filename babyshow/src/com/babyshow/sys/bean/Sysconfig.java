/*
 * �� �� ��:  Sysconfig.java
 * ��    ��:  Sysconfig.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.sys.bean;

/**
 * <һ�仰���ܼ���> <������ϸ����>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class Sysconfig
{
    /**
     * ����ID
     */
    private String configID;
    
    /**
     * ��������
     */
    private String paramCode;
    
    /**
     * ����ֵ
     */
    private String paramValue;
    
    /**
     * ��ע
     */
    private String remark;
    
    /**
     * ��ȡ configID
     * 
     * @return ���� configID
     */
    public String getConfigID()
    {
        return configID;
    }
    
    /**
     * ���� configID
     * 
     * @param ��configID���и�ֵ
     */
    public void setConfigID(String configID)
    {
        this.configID = configID;
    }
    
    /**
     * ��ȡ paramCode
     * 
     * @return ���� paramCode
     */
    public String getParamCode()
    {
        return paramCode;
    }
    
    /**
     * ���� paramCode
     * 
     * @param ��paramCode���и�ֵ
     */
    public void setParamCode(String paramCode)
    {
        this.paramCode = paramCode;
    }
    
    /**
     * ��ȡ paramValue
     * 
     * @return ���� paramValue
     */
    public String getParamValue()
    {
        return paramValue;
    }
    
    /**
     * ���� paramValue
     * 
     * @param ��paramValue���и�ֵ
     */
    public void setParamValue(String paramValue)
    {
        this.paramValue = paramValue;
    }
    
    /**
     * ��ȡ remark
     * 
     * @return ���� remark
     */
    public String getRemark()
    {
        return remark;
    }
    
    /**
     * ���� remark
     * 
     * @param ��remark���и�ֵ
     */
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    
}
