/*
 * 文 件 名:  UserStatusRest.java
 * 描    述:  UserStatusRest.java
 * 时    间:  2013-6-17
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
 * <一句话功能简述>
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
     * 用户状态请求
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
     * rest 请求统一处理方法，接受请求对象、校验信息，统一返回响应对象
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
