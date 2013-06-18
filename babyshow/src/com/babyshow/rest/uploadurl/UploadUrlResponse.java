/*
 * 文 件 名:  UploadUrlResponse.java
 * 描    述:  UploadUrlResponse.java
 * 时    间:  2013-6-21
 */
package com.babyshow.rest.uploadurl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UploadUrlResponse
{
    /**
     * 七牛上次路径
     */
    @JsonProperty("qiniu_key")
    private String qiniuKey;
    
    /**
     * 获取 qiniuKey
     * 
     * @return 返回 qiniuKey
     */
    public String getQiniuKey()
    {
        return qiniuKey;
    }
    
    /**
     * 设置 qiniuKey
     * 
     * @param 对qiniuKey进行赋值
     */
    public void setQiniuKey(String qiniuKey)
    {
        this.qiniuKey = qiniuKey;
    }
    
}
