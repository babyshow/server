/*
 * 文 件 名:  UserStatusResponse.java
 * 描    述:  UserStatusResponse.java
 * 时    间:  2013-6-17
 */
package com.babyshow.rest.userstatus;

import com.babyshow.rest.RestResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class UserStatusResponse extends RestResponse
{
    /**
     * 用户状态
     */
    @JsonProperty("user_status")
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private String userStatus;
    
    /**
     * 用户序号
     */
    @JsonProperty("user_num")
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
    private int userNum;
    
    /**
     * 获取 userStatus
     * 
     * @return 返回 userStatus
     */
    public String getUserStatus()
    {
        return userStatus;
    }
    
    /**
     * 设置 userStatus
     * 
     * @param 对userStatus进行赋值
     */
    public void setUserStatus(String userStatus)
    {
        this.userStatus = userStatus;
    }
    
    /**
     * 获取 userNum
     * 
     * @return 返回 userNum
     */
    public int getUserNum()
    {
        return userNum;
    }
    
    /**
     * 设置 userNum
     * 
     * @param 对userNum进行赋值
     */
    public void setUserNum(int userNum)
    {
        this.userNum = userNum;
    }
    
}
