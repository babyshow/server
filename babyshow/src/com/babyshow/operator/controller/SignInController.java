/*
 * 文 件 名:  SignInController.java
 * 描    述:  SignInController.java
 * 时    间:  2013-7-14
 */
package com.babyshow.operator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-14]
 */
@Controller
public class SignInController
{
    @Autowired
    private HttpServletRequest httpServletRequest;
    
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView signIn(String username, String password)
    {
        // TODO 数据库中校验帐号密码
        return new ModelAndView("redirect:/rest/mock/upload");
    }
}
