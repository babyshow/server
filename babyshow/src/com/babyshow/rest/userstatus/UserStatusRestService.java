/*
 * �� �� ��:  UserStatusRestService.java
 * ��    ��:  UserStatusRestService.java
 * ʱ    ��:  2013-6-27
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
 * <һ�仰���ܼ���>
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
     * �����û�״̬Rest����
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
            // �����û���¼��Ϣ
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
            
            // �����û��״ε�¼��Ϣ
            Date date = new Date();
            this.userLoginLogService.insertUserLoginTime(user.getUserCode(), date);
        }
        return userStatus;
    }
}
