/*
 * �� �� ��:  UserBabyLikeResponse.java
 * ��    ��:  UserBabyLikeResponse.java
 * ʱ    ��:  2013-6-20
 */
package com.babyshow.rest.userbabylike;

import com.babyshow.rest.RestResponse;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserBabyLikeResponse extends RestResponse
{
    /**
     * ������Ƭ��Like����
     */
    private Integer totalLikeCount;
    
    /**
     * ������ƬLike����
     */
    private Integer newLikeCount;
    
    /**
     * ��ȡ totalLikeCount
     * 
     * @return ���� totalLikeCount
     */
    public Integer getTotalLikeCount()
    {
        return totalLikeCount;
    }
    
    /**
     * ���� totalLikeCount
     * 
     * @param ��totalLikeCount���и�ֵ
     */
    public void setTotalLikeCount(Integer totalLikeCount)
    {
        this.totalLikeCount = totalLikeCount;
    }
    
    /**
     * ��ȡ newLikeCount
     * 
     * @return ���� newLikeCount
     */
    public Integer getNewLikeCount()
    {
        return newLikeCount;
    }
    
    /**
     * ���� newLikeCount
     * 
     * @param ��newLikeCount���и�ֵ
     */
    public void setNewLikeCount(Integer newLikeCount)
    {
        this.newLikeCount = newLikeCount;
    }
    
}
