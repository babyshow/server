/*
 * �� �� ��:  UserStatusResponse.java
 * ��    ��:  UserStatusResponse.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.rest.userstatus;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class UserStatusResponse extends RestResponse
{
    /**
     * �û�״̬
     */
    @JsonProperty("user_status")
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private String userStatus;
    
    /**
     * �û����
     */
    @JsonProperty("user_num")
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
    private int userNum;
    
    /**
     * ��ȡ userStatus
     * 
     * @return ���� userStatus
     */
    public String getUserStatus()
    {
        return userStatus;
    }
    
    /**
     * ���� userStatus
     * 
     * @param ��userStatus���и�ֵ
     */
    public void setUserStatus(String userStatus)
    {
        this.userStatus = userStatus;
    }
    
    /**
     * ��ȡ userNum
     * 
     * @return ���� userNum
     */
    public int getUserNum()
    {
        return userNum;
    }
    
    /**
     * ���� userNum
     * 
     * @param ��userNum���и�ֵ
     */
    public void setUserNum(int userNum)
    {
        this.userNum = userNum;
    }
    
}
