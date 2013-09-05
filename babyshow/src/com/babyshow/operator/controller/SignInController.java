/*
 * �� �� ��:  SignInController.java
 * ��    ��:  SignInController.java
 * ʱ    ��:  2013-7-14
 */
package com.babyshow.operator.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.babyshow.operator.bean.Operator;
import com.babyshow.operator.dao.OperatorDao;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-14]
 */
@Controller
public class SignInController
{
    @Autowired
    private HttpServletRequest httpServletRequest;
    
    @Autowired
    private OperatorDao operatorDao;
    
    private static final String SIGNIN_MESSAGE = "message";
    
    private static final String SIGNIN_PASSWORD_ERROR = "�������";
    
    /**
     * ��¼rest��ַ�ض�����jspҳ��
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView signInForward(Map<String,Object> model)
    {
        return new ModelAndView("forward:/page/signin/signin.jsp");
    }
    
    /**
     * 
     * ��¼����
     * 
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView signIn(String username, String password, Map<String,Object> model, HttpSession session)
    {
        Operator operator = this.operatorDao.findOperatorByLoginName(username);
        if (isValid(operator, password))
        {
            session.setAttribute("operator", username);
            return new ModelAndView("redirect:/rest/mock/upload");
        }
        else
        {
            model.put(SIGNIN_MESSAGE, SIGNIN_PASSWORD_ERROR);
            return new ModelAndView("forward:/page/signin/signin.jsp");
        }
    }
    
    /**
     * 
     * �ǳ�����
     * 
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping(value = "/signout", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView signOut(String username, String password, Map<String,Object> model, HttpSession session)
    {
        session.removeAttribute("operator");
        return new ModelAndView("forward:/page/signin/signin.jsp");
    }
    
    /**
     * 
     * У���¼
     * 
     * @param loginForm
     * @return
     */
    public boolean isValid(Operator operator, String password)
    {
        if (operator != null && operator.getPassword() != null && operator.getPassword().equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
