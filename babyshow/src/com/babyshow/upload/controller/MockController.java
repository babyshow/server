package com.babyshow.upload.controller;

/*
 * �� �� ��:  BabyshowController.java
 * ��    ��:  BabyshowController.java
 * ʱ    ��:  2013-6-17
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
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
@Controller
public class MockController
{
    
    /**
     * �ϴ��û�����ҳ�����
     * 
     * @return
     */
    @RequestMapping(value = "/mock/upload", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView showUploadPage(Map<String,Object> model)
    {
        // ÿ��ˢ�������û�code
        model.put("usercode", UUIDGenerator.generateUserCode());
        // Ĭ���ϴ�ʱ��
        model.put("defaultDateTime", DateUtil.getNowNormalFormatString());
        // Ĭ���ϴ�Сʱ��
        model.put("defaultHourTime", "12:00");
        // Ĭ��ϲ������
        model.put("defaultLikeTimes", "1");
        return new ModelAndView("forward:/page/upload/upload.jsp");
    }
    
}
