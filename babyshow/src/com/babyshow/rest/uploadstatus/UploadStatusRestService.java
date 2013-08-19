/*
 * �� �� ��:  UploadStatusService.java
 * ��    ��:  UploadStatusService.java
 * ʱ    ��:  2013-7-14
 */
package com.babyshow.rest.uploadstatus;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.image.bean.Image;
import com.babyshow.image.service.ImageService;
import com.babyshow.rest.RestHelper;
import com.babyshow.rest.RestResponse;
import com.babyshow.rest.RestService;
import com.babyshow.upload.bean.ImageUpload;
import com.babyshow.upload.service.ImageUploadService;
import com.babyshow.util.PropertiesUtil;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-7-14]
 */
@Service
public class UploadStatusRestService extends RestService
{
    @Autowired
    private ImageUploadService imageUploadService;
    
    @Autowired
    private ImageService imageService;
    
    public UploadStatusResponse handleUploadStatus(UploadStatusRequest uploadStatusRequest)
    {
        UploadStatusResponse uploadStatusResponse = new UploadStatusResponse();
        String deviceID = uploadStatusRequest.getDevice_id();
        
        // У��ID�Ƿ����
        boolean userValidate = this.validateUser(deviceID, uploadStatusResponse);
        if(!userValidate)
        {
            uploadStatusResponse.setRequest("uploadStatusRequest");
            return uploadStatusResponse;
        }
        
        // �������������ϴ���Ϣ�����ϴ��ɹ���ͼƬд��image��
        String qiniuKey = uploadStatusRequest.getQiniu_key();
        
        // У����ţkey
        boolean qiniuKeyValidate = this.validateQiniuKey(qiniuKey, uploadStatusResponse);
        if(!qiniuKeyValidate)
        {
            uploadStatusResponse.setRequest("uploadStatusRequest");
            return uploadStatusResponse;
        }
        
        ImageUpload imageUpload = this.imageUploadService.findImageUploadByQiniuKey(qiniuKey);
        // �ϴ��ɹ�
        if(uploadStatusRequest.getUpload_status())
        {
            Image image = new Image();
            image.setCreatedTime(new Date());
            image.setDescription(imageUpload.getDescription());
            image.setImageCode(imageUpload.getImageCode());
            image.setStatus(0);
            image.setLikeCount(0);
            image.setUrlKey(imageUpload.getQiniuKey());
            image.setUserCode(imageUpload.getUserCode());
            this.imageService.insertImage(image);
        }
        // �ϴ�ʧ��
        else
        {
            this.imageUploadService.updateImageUploadResultByQiniuKey(1, qiniuKey);
        }
           
        return uploadStatusResponse;
    }
    
    
    /**
     * 
     * У��qiniukey�����ڷ���true�������ڷ���false
     * <br>
     * У��ʧ��ʱrestResponse��д�������ʹ�����Ϣ
     * 
     * @param qiniuKey
     * @param restResponse
     * @return
     */
    private boolean validateQiniuKey(String qiniuKey, RestResponse restResponse)
    {
        ImageUpload imageUpload = this.imageUploadService.findImageUploadByQiniuKey(qiniuKey);
        if(imageUpload == null)
        {
            String errors = PropertiesUtil.loadI18NProperty("upload.qiniukey.notexist");
            RestHelper.generateErrorMsg(restResponse, errors);
            return false;
        }
        return true;
    }
}
