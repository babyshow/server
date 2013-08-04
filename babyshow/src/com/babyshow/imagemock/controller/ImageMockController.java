/*
 * 文 件 名:  ImageMockController.java
 * 描    述:  ImageMockController.java
 * 时    间:  2013-8-5
 */
package com.babyshow.imagemock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.babyshow.image.ImageStaticConstant;
import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;
import com.babyshow.user.bean.User;
import com.babyshow.util.Page;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-8-5]
 */
@Controller
public class ImageMockController
{
    @Autowired
    private ImageService imageService;
    
    /**
     * 登录rest地址重定向至jsp页面
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/mock/user/{userID}/image", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView imageMockForwardCurPage(@PathVariable String userID)
    {
        // 不带页码，默认为第一页
        ModelAndView modelAndView = this.imageMock(userID, 1);
        return modelAndView;
    }
 
    /**
     * 登录rest地址重定向至jsp页面
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/mock/user/{userID}/image/{curPage}", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView userMockForward(@PathVariable String userID, @PathVariable int curPage)
    {
        ModelAndView modelAndView = this.imageMock(userID, curPage);
        return modelAndView;
    }

    /**
     * 
     * 用户图片分页查询
     * 
     * @param userID
     * @param curPage
     * @return
     */
    private ModelAndView imageMock(String userID, int curPage)
    {
        int recordPerPage = ImageStaticConstant.DEFAULT_RECORD_PER_PAGE;
        Image imageCondition = new Image();
        imageCondition.setUserCode(userID);
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
        int imageCount = this.imageService.findImageListCountByQueryCondition(imageCondition);
        List<Image> imageList = this.imageService.findImageListByQueryConditionAndPage(imageCondition, page);
        if (imageList == null)
        {
            page.setTotalPages(1);
        }
        else
        {
            page.setTotalPages(imageCount / recordPerPage + 1);
        }
        // user对象页面使用
        User user = new User();
        user.setUserCode(userID);
        ModelAndView modelAndView = new ModelAndView("forward:/page/image/image.jsp");
        modelAndView.addObject(imageList);
        modelAndView.addObject(page);
        modelAndView.addObject(user);
        return modelAndView;
    }

    
    /**
     * 修改图片喜欢次数
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/mock/image/{imageCode}/{count}", method = RequestMethod.POST)
    public @ResponseBody
    void imageCountMock(@PathVariable String imageCode, @PathVariable int count)
    {
        if (this.imageService.checkImageExistByImageCode(imageCode) && count >= 0)
        {
            this.imageService.updateImageLikeCount(imageCode, count);
        }
    }
    
}
