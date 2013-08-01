/*
 * 文 件 名:  OperatorDao.java
 * 描    述:  OperatorDao.java
 * 时    间:  2013-8-1
 */
package com.babyshow.operator.dao;

import com.babyshow.operator.bean.Operator;

/**
 * <一句话功能简述>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-8-1]
 */
public interface OperatorDao
{
    public Operator findOperatorByLoginName(String loginName);
}
