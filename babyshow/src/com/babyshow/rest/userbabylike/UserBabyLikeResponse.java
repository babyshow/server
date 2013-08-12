/*
 * 文 件 名:  UserBabyLikeResponse.java
 * 描    述:  UserBabyLikeResponse.java
 * 时    间:  2013-6-20
 */
package com.babyshow.rest.userbabylike;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserBabyLikeResponse extends RestResponse
{
    /**
     * 所有照片被Like次数
     */
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private Integer totalLikeCount;
    
    /**
     * 新增照片Like次数
     */
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private Integer newLikeCount;
    
    /**
     * 获取 totalLikeCount
     * 
     * @return 返回 totalLikeCount
     */
    public Integer getTotalLikeCount()
    {
        return totalLikeCount;
    }
    
    /**
     * 设置 totalLikeCount
     * 
     * @param 对totalLikeCount进行赋值
     */
    public void setTotalLikeCount(Integer totalLikeCount)
    {
        this.totalLikeCount = totalLikeCount;
    }
    
    /**
     * 获取 newLikeCount
     * 
     * @return 返回 newLikeCount
     */
    public Integer getNewLikeCount()
    {
        return newLikeCount;
    }
    
    /**
     * 设置 newLikeCount
     * 
     * @param 对newLikeCount进行赋值
     */
    public void setNewLikeCount(Integer newLikeCount)
    {
        this.newLikeCount = newLikeCount;
    }
    
}
