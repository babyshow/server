/*
 * 文 件 名:  UserMockController.java
 * 描    述:  UserMockController.java
 * 时    间:  2013-8-4
 */
package com.babyshow.usermock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.babyshow.image.ImageStaticConstant;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;
import com.babyshow.util.Page;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-8-4]
 */
@Controller
public class UserMockController
{
    @Autowired
    private UserService userService;
    
    /**
     * 登录rest地址重定向至jsp页面
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/mock/user", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView userMockForwardCurPage()
    {
        // 不带页码，默认为第一页
        ModelAndView modelAndView = this.userMock(1);
        return modelAndView;
    }
    
    /**
     * 根据curPage生成mock用户页面的ModelAndView
     * 
     * @return
     */
    private ModelAndView userMock(int curPage)
    {
        int recordPerPage = ImageStaticConstant.DEFAULT_RECORD_PER_PAGE;
        User userCondition = new User();
        Page page = new Page();
        page.setCurPage(curPage);
        
        // 处理分页信息
        int curRecord;
        if (curPage > 0)
        {
            curRecord = (curPage - 1) * recordPerPage;
        }
        else
        {
            curRecord = 0;
        }
        page.setCurRecord(curRecord);
        page.setRecordPerPage(recordPerPage);
        int userCount = this.userService.findUserListCountByQueryCondition(userCondition);
        List<User> userList = this.userService.findUserListByQueryConditionAndPage(userCondition, page);
        if (userList == null)
        {
            page.setTotalPages(1);
        }
        else
        {
            page.setTotalPages(userCount / recordPerPage + 1);
        }
        
        ModelAndView modelAndView = new ModelAndView("forward:/page/user/user.jsp");
        modelAndView.addObject(userList);
        modelAndView.addObject(page);
        return modelAndView;
    }
    
    /**
     * 登录rest地址重定向至jsp页面
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/mock/user/{curPage}", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView userMockForward(@PathVariable
    int curPage)
    {
        ModelAndView modelAndView = this.userMock(curPage);
        return modelAndView;
    }
    
}
