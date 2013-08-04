/*
 * 文 件 名:  Page.java
 * 描    述:  Page.java
 * 时    间:  2013-8-4
 */
package com.babyshow.util;

/**
 * <一句话功能简述>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-8-4]
 */
public class Page
{
    /**
     * 当前页
     */
    private int curPage;
    
    /**
     * 当前开始记录数,用作mysql limit查询
     */
    private int curRecord;
    
    /**
     * 总记录数
     */
    private int totalRecord;
    
    /**
     * 每页显示的记录数
     */
    private int recordPerPage;
    
    /**
     * 总页数
     */
    private int totalPages;
    
    /**
     * 获取 curPage
     * 
     * @return 返回 curPage
     */
    public int getCurPage()
    {
        return curPage;
    }
    
    /**
     * 设置 curPage
     * 
     * @param 对curPage进行赋值
     */
    public void setCurPage(int curPage)
    {
        this.curPage = curPage;
    }
    
    /**
     * 获取 totalRecord
     * 
     * @return 返回 totalRecord
     */
    public int getTotalRecord()
    {
        return totalRecord;
    }
    
    /**
     * 设置 totalRecord
     * 
     * @param 对totalRecord进行赋值
     */
    public void setTotalRecord(int totalRecord)
    {
        this.totalRecord = totalRecord;
    }
    
    /**
     * 获取 recordPerPage
     * 
     * @return 返回 recordPerPage
     */
    public int getRecordPerPage()
    {
        return recordPerPage;
    }
    
    /**
     * 设置 recordPerPage
     * 
     * @param 对recordPerPage进行赋值
     */
    public void setRecordPerPage(int recordPerPage)
    {
        this.recordPerPage = recordPerPage;
    }
    
    /**
     * 获取 totalPages
     * 
     * @return 返回 totalPages
     */
    public int getTotalPages()
    {
        return totalPages;
    }
    
    /**
     * 设置 totalPages
     * 
     * @param 对totalPages进行赋值
     */
    public void setTotalPages(int totalPages)
    {
        this.totalPages = totalPages;
    }

    /**
     * 获取 curRecord
     * @return 返回 curRecord
     */
    public int getCurRecord()
    {
        return curRecord;
    }

    /**
     * 设置 curRecord
     * @param 对curRecord进行赋值
     */
    public void setCurRecord(int curRecord)
    {
        this.curRecord = curRecord;
    }
    
}
