/*
 * 文 件 名:  UploadStatusRequest.java
 * 描    述:  UploadStatusRequest.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.uploadstatus;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.babyshow.rest.RestRequest;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UploadStatusRequest extends RestRequest
{
    /**
     * 设备ID
     */
    @NotNull(message = "{user.deviceid.null}")
    @Size(min = 1, max = 64, message = "{user.deviceid.length}")
    private String device_id;
    
    /**
     * 七牛上传路径，由服务器指派
     */
    @NotNull(message = "{upload.qiniukey.null}")
    @Size(min = 1, max = 128, message = "{upload.qiniukey.length}")
    private String qiniu_key;
    
    /**
     * 上传状态
     */
    @NotNull(message = "{upload.status.null}")
    private Boolean upload_status;
    
    /**
     * 获取 device_id
     * 
     * @return 返回 device_id
     */
    public String getDevice_id()
    {
        return device_id;
    }
    
    /**
     * 设置 device_id
     * 
     * @param 对device_id进行赋值
     */
    public void setDevice_id(String device_id)
    {
        this.device_id = device_id;
    }
    
    /**
     * 获取 qiniu_key
     * 
     * @return 返回 qiniu_key
     */
    public String getQiniu_key()
    {
        return qiniu_key;
    }
    
    /**
     * 设置 qiniu_key
     * 
     * @param 对qiniu_key进行赋值
     */
    public void setQiniu_key(String qiniu_key)
    {
        this.qiniu_key = qiniu_key;
    }
    
    /**
     * 获取 upload_status
     * 
     * @return 返回 upload_status
     */
    public Boolean getUpload_status()
    {
        return upload_status;
    }
    
    /**
     * 设置 upload_status
     * 
     * @param 对upload_status进行赋值
     */
    public void setUpload_status(Boolean upload_status)
    {
        this.upload_status = upload_status;
    }
    
}
