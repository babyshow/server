/*
 * �� �� ��:  OperatorDao.java
 * ��    ��:  OperatorDao.java
 * ʱ    ��:  2013-8-1
 */
package com.babyshow.operator.dao;

import com.babyshow.operator.bean.Operator;

/**
 * <һ�仰���ܼ���>
 * 
 * @author  ztc
 * @version  [BABYSHOW V1R1C1, 2013-8-1]
 */
public interface OperatorDao
{
    public Operator findOperatorByLoginName(String loginName);
}
