/*
 * �� �� ��:  UserStatus.java
 * ��    ��:  UserStatus.java
 * ʱ    ��:  2013-6-17
 */
package com.babyshow.user.bean;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public class UserStatus
{
    /**
     * �û�״̬
     */
    private String userStatus;
    
    /**
     * �û����
     */
    private int userNum;
    
    /**
     * ��ȡ userStatus
     * 
     * @return ���� userStatus
     */
    public String getUserStatus()
    {
        return userStatus;
    }
    
    /**
     * ���� userStatus
     * 
     * @param ��userStatus���и�ֵ
     */
    public void setUserStatus(String userStatus)
    {
        this.userStatus = userStatus;
    }
    
    /**
     * ��ȡ userNum
     * 
     * @return ���� userNum
     */
    public int getUserNum()
    {
        return userNum;
    }
    
    /**
     * ���� userNum
     * 
     * @param ��userNum���и�ֵ
     */
    public void setUserNum(int userNum)
    {
        this.userNum = userNum;
    }
    
}
