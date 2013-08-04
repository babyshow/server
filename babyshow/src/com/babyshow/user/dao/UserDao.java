/*
 * 文 件 名:  UserDao.java
 * 描    述:  UserDao.java
 * 时    间:  2013-6-17
 */
package com.babyshow.user.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.babyshow.user.bean.User;
import com.babyshow.util.Page;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-17]
 */
public interface UserDao
{
    
    /**
     * 
     * 根据userID查User
     * 
     * @param userID
     * @return
     */
    public User findUserByUserID(String userID);
    
    /**
     * 
     * 插入user
     * 
     * @param user
     */
    public void insertUser(User user);
    
    /**
     * 
     * 根据deviceID查User
     * 
     * @param deviceID
     * @return
     */
    public User findUserByDeviceID(String deviceID);
    
    /**
     * 
     * 查询存在的用户个数
     * 
     * @return
     */
    public int findExistUserCount();
    
    /**
     * 根据deviceID、日期查询用户所有Baby照片在指点日期前被喜欢的次数
     * 
     * @param deviceID
     * @return
     */
    public int findUserBabyLikeCountByDeviceIDAndDate(String deviceID, Date date);
    
    
    /**
     * 
     * 根据user查询条件、page信息分页查询用户列表
     * 
     * @param userCondition
     * @param page
     * @return
     */
    public List<User> findUserListByQueryConditionAndPage(@Param("userCondition") User userCondition, @Param("page") Page page); 
    
    /**
     * 
     * 根据user查询条件查询记录总数
     * 
     * @param userCondition
     * @return
     */
    public int findUserListCountByQueryCondition(@Param("userCondition") User userCondition); 
  
    
}
