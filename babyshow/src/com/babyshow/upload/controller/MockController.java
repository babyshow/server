package com.babyshow.upload.controller;

/*
 * 文 件 名:  BabyshowController.java
 * 描    述:  BabyshowController.java
 * 时    间:  2013-6-17
 */

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.babyshow.util.DateUtil;
import com.babyshow.util.UUIDGenerator;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
@Controller
public class MockController
{
    
    /**
     * 上传用户数据页面管理
     * 
     * @return
     */
    @RequestMapping(value = "/mock/upload", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView showUploadPage(Map<String,Object> model)
    {
        // 每次刷新生成用户code
        model.put("usercode", UUIDGenerator.generateUserCode());
        // 默认上传时间
        model.put("defaultDateTime", DateUtil.getNowNormalFormatString());
        // 默认上传小时数
        model.put("defaultHourTime", "12:00");
        // 默认喜欢次数
        model.put("defaultLikeTimes", "1");
        return new ModelAndView("forward:/page/upload/upload.jsp");
    }
    
}
