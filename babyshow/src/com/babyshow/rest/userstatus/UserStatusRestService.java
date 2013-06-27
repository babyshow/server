/*
 * 文 件 名:  UserStatusRestService.java
 * 描    述:  UserStatusRestService.java
 * 时    间:  2013-6-27
 */
package com.babyshow.rest.userstatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.rest.RestStaticConstant;
import com.babyshow.user.service.UserService;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-27]
 */
@Service
public class UserStatusRestService
{
    @Autowired
    private UserService userService;
    
    /**
     * 
     * 处理用户状态Rest请求
     * 
     * @param userStatusRequest
     * @return
     */
    public UserStatusResponse handleUserStatus(UserStatusRequest userStatusRequest)
    {
        UserStatusResponse userStatus = new UserStatusResponse();
        String deviceID = userStatusRequest.getDevice_id();
        if(userService.isUserExistByDeviceID(deviceID))
        {
            userStatus.setUserStatus(RestStaticConstant.USER_LOGIN_STATUS_NONFISRT);
        }
        else
        {
            userService.addNewUserByDeviceID(deviceID);
            // TODO 这里使用查询表总数来确认，是否不太好，建议在user表中加字段表示写入的时候是第多少个用户
            int userNum = userService.findExistUserCount();
            userStatus.setUserStatus(RestStaticConstant.USER_LOGIN_STATUS_FISRT);
            userStatus.setUserNum(userNum);
        }
        return userStatus;
    }
}
