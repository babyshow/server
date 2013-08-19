/*
 * �� �� ��:  UploadUrlRestService.java
 * ��    ��:  UploadUrlRestService.java
 * ʱ    ��:  2013-7-1
 */
package com.babyshow.rest.uploadurl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.rest.RestService;
import com.babyshow.upload.bean.ImageUpload;
import com.babyshow.upload.service.ImageUploadService;
import com.babyshow.user.bean.User;
import com.babyshow.user.service.UserService;
import com.babyshow.util.QiNiuUtil;
import com.babyshow.util.UUIDGenerator;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-7-1]
 */
@Service
public class UploadUrlRestService extends RestService
{
    @Autowired
    private UserService userService;
    
    @Autowired
    private ImageUploadService imageUploadService;
    
    /**
     * ��ѯ��ţ�ϴ�·��
     * 
     * @param uploadUrlRequest
     * @return
     */
    public UploadUrlResponse handleUploadUrl(UploadUrlRequest uploadUrlRequest)
    {
        UploadUrlResponse UploadUrlResponse = new UploadUrlResponse();
        String deviceID = uploadUrlRequest.getDevice_id();
        
        // У��ID�Ƿ����
        boolean userValidate = this.validateUser(deviceID, UploadUrlResponse);
        if(!userValidate)
        {
            UploadUrlResponse.setRequest("uploadUrlRequest");
            return UploadUrlResponse;
        }
        
        User user = this.userService.findUserByDeviceID(deviceID);
        String description = uploadUrlRequest.getImage_description();
        int shareType = uploadUrlRequest.getShare_type();
        String shareToken = uploadUrlRequest.getShare_token();
        String userCode = user.getUserCode();
        // �����ϴ�·��
        String imageCode = UUIDGenerator.generateImageCode();
        String qiniuKey = QiNiuUtil.generateQiniuKey(userCode, imageCode, "jpg");
        UploadUrlResponse.setQiniuKey(qiniuKey);
        // ���ϴ���
        ImageUpload imageUpload = new ImageUpload();
        imageUpload.setUserCode(userCode);
        imageUpload.setDescription(description);
        imageUpload.setShareType(shareType);
        imageUpload.setShareToken(shareToken);
        imageUpload.setImageCode(imageCode);
        imageUpload.setQiniuKey(qiniuKey);
        this.imageUploadService.insertImageUpload(imageUpload);
        return UploadUrlResponse;
    }
}
