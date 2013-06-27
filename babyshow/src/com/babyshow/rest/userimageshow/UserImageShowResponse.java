/*
 * �� �� ��:  UserImageShowResponse.java
 * ��    ��:  UserImageShowResponse.java
 * ʱ    ��:  2013-6-20
 */
package com.babyshow.rest.userimageshow;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-20]
 */
public class UserImageShowResponse
{
    /**
     * ��Ƭ�б�
     */
    private List<UserImageShowResponseImage> userImageShowResponseImageList = new ArrayList<UserImageShowResponseImage>();
    
    /**
     * ��Ƭ�ܸ���
     */
    @JsonProperty("total_number")
    private int totalNumber;
    
    /**
     * ��ȡ userImageShowResponseImageList
     * 
     * @return ���� userImageShowResponseImageList
     */
    public List<UserImageShowResponseImage> getUserImageShowResponseImageList()
    {
        return userImageShowResponseImageList;
    }
    
    /**
     * ���� userImageShowResponseImageList
     * 
     * @param ��userImageShowResponseImageList���и�ֵ
     */
    public void setUserImageShowResponseImageList(List<UserImageShowResponseImage> userImageShowResponseImageList)
    {
        this.userImageShowResponseImageList = userImageShowResponseImageList;
    }
    
    /**
     * ��ȡ totalNumber
     * 
     * @return ���� totalNumber
     */
    public int getTotalNumber()
    {
        return totalNumber;
    }
    
    /**
     * ���� totalNumber
     * 
     * @param ��totalNumber���и�ֵ
     */
    public void setTotalNumber(int totalNumber)
    {
        this.totalNumber = totalNumber;
    }
    
}