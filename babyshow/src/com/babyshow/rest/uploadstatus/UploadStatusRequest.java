/*
 * �� �� ��:  UploadStatusRequest.java
 * ��    ��:  UploadStatusRequest.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.uploadstatus;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UploadStatusRequest
{
    /**
     * �豸ID
     */
    private String device_id;
    
    /**
     * ��ţ�ϴ�·�����ɷ�����ָ��
     */
    private String qiniu_key;
    
    private boolean upload_status;
    
    /**
     * ��ȡ device_id
     * 
     * @return ���� device_id
     */
    public String getDevice_id()
    {
        return device_id;
    }
    
    /**
     * ���� device_id
     * 
     * @param ��device_id���и�ֵ
     */
    public void setDevice_id(String device_id)
    {
        this.device_id = device_id;
    }
    
    /**
     * ��ȡ qiniu_key
     * 
     * @return ���� qiniu_key
     */
    public String getQiniu_key()
    {
        return qiniu_key;
    }
    
    /**
     * ���� qiniu_key
     * 
     * @param ��qiniu_key���и�ֵ
     */
    public void setQiniu_key(String qiniu_key)
    {
        this.qiniu_key = qiniu_key;
    }
    
    /**
     * ��ȡ upload_status
     * 
     * @return ���� upload_status
     */
    public boolean isUpload_status()
    {
        return upload_status;
    }
    
    /**
     * ���� upload_status
     * 
     * @param ��upload_status���и�ֵ
     */
    public void setUpload_status(boolean upload_status)
    {
        this.upload_status = upload_status;
    }
    
}
