/*
 * 文 件 名:  BabyshowRest.java
 * 描    述:  BabyshowRest.java
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

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
@Controller
public class BabyshowRest
{
    @Autowired
    private RestHelper restHelper;
    
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
        return (UserStatusResponse)restHelper.handleRest(userStatusRequest, bindingResult);
    }
    

    
}
