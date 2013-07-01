/*
 * �� �� ��:  UserLoginLogService.java
 * ��    ��:  UserLoginLogService.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.user.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babyshow.user.dao.UserLoginLogDao;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-30]
 */
@Service
public class UserLoginLogService
{
    @Autowired
    private UserLoginLogDao userLoginLogDao;
    
    /**
     * 
     * ����deviceID��ѯ�û����һ�ε�¼ʱ��
     * 
     * @param deviceID
     * @return
     */
    public Date findUserLastLoginTimeByDeviceID(String deviceID)
    {
        return this.userLoginLogDao.findUserLastLoginTimeByDeviceID(deviceID);
    }
    
}
