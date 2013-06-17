/*
 * �� �� ��:  UserStatusRest.java
 * ��    ��:  UserStatusRest.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.babyshow.user.bean.UserStatus;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
@Controller
public class UserStatusRest
{
    
    @RequestMapping(method = RequestMethod.GET, value = "/users/status")
    @ResponseBody
    public UserStatus getUserStatus(@RequestParam(value = "device_id", required = true)
    String deviceID)
    {
        UserStatus userStatus = new UserStatus();
        userStatus.setUserNum(0);
        return userStatus;
    }
    
}
