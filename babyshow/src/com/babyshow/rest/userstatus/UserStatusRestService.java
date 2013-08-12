/*
 * 文 件 名:  UserStatusRestService.java
 * 描    述:  UserStatusRestService.java
 * 时    间:  2013-6-27
 */
package com.babyshow.rest.userstatus;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.rest.RestService;
import com.babyshow.rest.RestStaticConstant;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserLoginLogService;
import com.babyshow.user.service.UserService;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-27]
 */
@Service
public class UserStatusRestService extends RestService
{
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserLoginLogService userLoginLogService;
    
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
            // 设置用户登录信息
            User user = this.userService.findUserByDeviceID(deviceID);
            Date date = new Date();
            this.userLoginLogService.insertUserLoginTime(user.getUserCode(), date);
        }
        else
        {
            userService.addNewUserByDeviceID(deviceID);
            User user = userService.findUserByDeviceID(deviceID);
            int userNum = user.getRegNum();
            userStatus.setUserStatus(RestStaticConstant.USER_LOGIN_STATUS_FISRT);
            userStatus.setUserNum(userNum);
            
            // 设置用户首次登录信息
            Date date = new Date();
            this.userLoginLogService.insertUserLoginTime(user.getUserCode(), date);
        }
        return userStatus;
    }
}
