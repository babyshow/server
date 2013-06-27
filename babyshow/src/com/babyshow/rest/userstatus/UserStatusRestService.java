/*
 * �� �� ��:  UserStatusRestService.java
 * ��    ��:  UserStatusRestService.java
 * ʱ    ��:  2013-6-27
 */
package com.babyshow.rest.userstatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.rest.RestStaticConstant;
import com.babyshow.user.service.UserService;

/**
 * <һ�仰���ܼ���>
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
        }
        else
        {
            userService.addNewUserByDeviceID(deviceID);
            // TODO ����ʹ�ò�ѯ��������ȷ�ϣ��Ƿ�̫�ã�������user���м��ֶα�ʾд���ʱ���ǵڶ��ٸ��û�
            int userNum = userService.findExistUserCount();
            userStatus.setUserStatus(RestStaticConstant.USER_LOGIN_STATUS_FISRT);
            userStatus.setUserNum(userNum);
        }
        return userStatus;
    }
}
