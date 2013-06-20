/*
 * �� �� ��:  UserStatusRest.java
 * ��    ��:  UserStatusRest.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.babyshow.rest.userstatus.UserStatusRequest;
import com.babyshow.rest.userstatus.UserStatusResponse;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
@Controller
public class UserStatusRest
{
    @Autowired
    private UserService userService;
    
    /**
     * 
     * �û�״̬����
     * 
     * @param userStatusRequest
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/users/status")
    @ResponseBody
    public UserStatusResponse getUserStatus(@Valid
    UserStatusRequest userStatusRequest, BindingResult bindingResult)
    {
        return (UserStatusResponse)handleRest(userStatusRequest, bindingResult);
    }
    
    /**
     * 
     * rest ����ͳһ�������������������У����Ϣ��ͳһ������Ӧ����
     * 
     * @param object
     * @param result
     * @return
     */
    private Object handleRest(Object object, BindingResult result)
    {
        
        UserStatusRequest userStatusRequest = (UserStatusRequest)object;
        userStatusRequest.getDevice_id();
        String deviceID = userStatusRequest.getDevice_id();
        User user = userService.findUserByDeviceID(deviceID);
        UserStatusResponse userStatus = new UserStatusResponse();
        if(user == null)
        {
           User userNew = userService.createNewUserByDeviceID(deviceID);
           userStatus.setUserNum(4444);
        }
        return userStatus;
    }
    
}
