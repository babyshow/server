/*
 * �� �� ��:  UploadUrlResponse.java
 * ��    ��:  UploadUrlResponse.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.uploadurl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UploadUrlResponse
{
    /**
     * ��ţ�ϴ�·��
     */
    @JsonProperty("qiniu_key")
    private String qiniuKey;
    
    /**
     * ��ȡ qiniuKey
     * 
     * @return ���� qiniuKey
     */
    public String getQiniuKey()
    {
        return qiniuKey;
    }
    
    /**
     * ���� qiniuKey
     * 
     * @param ��qiniuKey���и�ֵ
     */
    public void setQiniuKey(String qiniuKey)
    {
        this.qiniuKey = qiniuKey;
    }
    
}
