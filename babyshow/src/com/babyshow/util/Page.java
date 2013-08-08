/*
 * �� �� ��:  Page.java
 * ��    ��:  Page.java
 * ʱ    ��:  2013-8-4
 */
package com.babyshow.util;

/**
 * <һ�仰���ܼ���>
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-8-4]
 */
public class Page
{
    /**
     * ��ǰҳ
     */
    private int curPage;
    
    /**
     * ��ǰ��ʼ��¼��,����mysql limit��ѯ
     */
    private int curRecord;
    
    /**
     * �ܼ�¼��
     */
    private int totalRecord;
    
    /**
     * ÿҳ��ʾ�ļ�¼��
     */
    private int recordPerPage;
    
    /**
     * ��ҳ��
     */
    private int totalPages;
    
    /**
     * ��ȡ curPage
     * 
     * @return ���� curPage
     */
    public int getCurPage()
    {
        return curPage;
    }
    
    /**
     * ���� curPage
     * 
     * @param ��curPage���и�ֵ
     */
    public void setCurPage(int curPage)
    {
        this.curPage = curPage;
    }
    
    /**
     * ��ȡ totalRecord
     * 
     * @return ���� totalRecord
     */
    public int getTotalRecord()
    {
        return totalRecord;
    }
    
    /**
     * ���� totalRecord
     * 
     * @param ��totalRecord���и�ֵ
     */
    public void setTotalRecord(int totalRecord)
    {
        this.totalRecord = totalRecord;
    }
    
    /**
     * ��ȡ recordPerPage
     * 
     * @return ���� recordPerPage
     */
    public int getRecordPerPage()
    {
        return recordPerPage;
    }
    
    /**
     * ���� recordPerPage
     * 
     * @param ��recordPerPage���и�ֵ
     */
    public void setRecordPerPage(int recordPerPage)
    {
        this.recordPerPage = recordPerPage;
    }
    
    /**
     * ��ȡ totalPages
     * 
     * @return ���� totalPages
     */
    public int getTotalPages()
    {
        return totalPages;
    }
    
    /**
     * ���� totalPages
     * 
     * @param ��totalPages���и�ֵ
     */
    public void setTotalPages(int totalPages)
    {
        this.totalPages = totalPages;
    }

    /**
     * ��ȡ curRecord
     * @return ���� curRecord
     */
    public int getCurRecord()
    {
        return curRecord;
    }

    /**
     * ���� curRecord
     * @param ��curRecord���и�ֵ
     */
    public void setCurRecord(int curRecord)
    {
        this.curRecord = curRecord;
    }
    
}
