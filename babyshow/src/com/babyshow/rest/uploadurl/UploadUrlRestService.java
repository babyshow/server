/*
 * 文 件 名:  UploadUrlRestService.java
 * 描    述:  UploadUrlRestService.java
 * 时    间:  2013-7-1
 */
package com.babyshow.rest.uploadurl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.upload.bean.ImageUpload;
import com.babyshow.upload.service.ImageUploadService;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;
import com.babyshow.util.DateUtil;
import com.babyshow.util.MD5;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class UploadUrlRestService
{
    @Autowired
    private UserService userService;
    
    @Autowired
    private ImageUploadService imageUploadService;
    
    /**
     * 查询七牛上传路径
     * 
     * @param uploadUrlRequest
     * @return
     */
    public UploadUrlResponse handleUploadUrl(UploadUrlRequest uploadUrlRequest)
    {
        UploadUrlResponse UploadUrlResponse = new UploadUrlResponse();
        String deviceID = uploadUrlRequest.getDevice_id();
        User user = this.userService.findUserByDeviceID(deviceID);
        String description = uploadUrlRequest.getImage_description();
        int shareType = uploadUrlRequest.getShare_type();
        String shareToken = uploadUrlRequest.getShare_token();
        String userCode = user.getUserCode();
        // 分配上传路径，采用MD5(用户帐号)/日期.jpg
        Date date = new Date();
        String qiniuKey = MD5.md5Str(userCode) + "/" + DateUtil.dateTo14String(date) + ".jpg";
        UploadUrlResponse.setQiniuKey(qiniuKey);
        // 入上传表
        ImageUpload imageUpload = new ImageUpload();
        imageUpload.setUserCode(userCode);
        imageUpload.setDescription(description);
        imageUpload.setShareType(shareType);
        imageUpload.setShareToken(shareToken);
        this.imageUploadService.insertImageUpload(imageUpload);
        return UploadUrlResponse;
    }
}
