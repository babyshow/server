/*
 * �� �� ��:  UploadUrlResponse.java
 * ��    ��:  UploadUrlResponse.java
 * ʱ    ��:  2013-6-21
 */
package com.babyshow.rest.uploadurl;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-21]
 */
public class UploadUrlResponse extends RestResponse
{
    /**
     * ��ţ�ϴ�·��
     */
    @JsonProperty("qiniu_key")
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
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
