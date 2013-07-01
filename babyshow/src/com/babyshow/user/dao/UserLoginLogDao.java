/*
 * �� �� ��:  UserLoginLogDao.java
 * ��    ��:  UserLoginLogDao.java
 * ʱ    ��:  2013-6-30
 */
package com.babyshow.user.dao;

import java.util.Date;

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
}
