/*
 * �� �� ��:  UserLoginLogDao.java
 * ��    ��:  UserLoginLogDao.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.user.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-6-30]
 */
public interface UserLoginLogDao
{
    /**
     * 
     * ����deviceID��ѯ�û����һ�ε�¼ʱ��
     * 
     * @param deviceID
     * @return
     */
    public Date findUserLastLoginTimeByDeviceID(String deviceID); 
    
    /**
     * 
     * д���û���¼ʱ��
     * 
     * @param userCode
     * @param date
     */
    public void insertUserLoginTime(@Param("userCode") String userCode, @Param("date") Date date);
}
