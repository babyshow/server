/*
 * �� �� ��:  UserBabyLikeResponse.java
 * ��    ��:  UserBabyLikeResponse.java
 * ʱ    ��:  2013-6-20
 */
package com.babyshow.rest.userbabylike;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserBabyLikeResponse
{
    /**
     * ������Ƭ��Like����
     */
    private String totalLikeCount;
    
    /**
     * ������ƬLike����
     */
    private String newLikeCount;
    
    /**
     * ��ȡ totalLikeCount
     * 
     * @return ���� totalLikeCount
     */
    public String getTotalLikeCount()
    {
        return totalLikeCount;
    }
    
    /**
     * ���� totalLikeCount
     * 
     * @param ��totalLikeCount���и�ֵ
     */
    public void setTotalLikeCount(String totalLikeCount)
    {
        this.totalLikeCount = totalLikeCount;
    }
    
    /**
     * ��ȡ newLikeCount
     * 
     * @return ���� newLikeCount
     */
    public String getNewLikeCount()
    {
        return newLikeCount;
    }
    
    /**
     * ���� newLikeCount
     * 
     * @param ��newLikeCount���и�ֵ
     */
    public void setNewLikeCount(String newLikeCount)
    {
        this.newLikeCount = newLikeCount;
    }
    
}
