/*
 * �� �� ��:  OperatorSignInFiler.java
 * ��    ��:  OperatorSignInFiler.java
 * ʱ    ��:  2013-8-2
 */
package com.babyshow.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * ����Ա��¼����������������������Ҫ��¼���ܷ��ʵ��ļ�
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-8-2]
 */
public class OperatorSignInFiler implements Filter
{
    /**
     * ��־
     */
    private static Logger log = Logger.getLogger(OperatorSignInFiler.class);
    
    private static final String NO_CHECK = "noCheck";
    
    private static List<String> noCheckList = new ArrayList<String>();
    
    /**
     * ���ط���
     */
    @Override
    public void destroy()
    {
    }
    
    /**
     * ���ط���
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException
    {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpSession session = req.getSession();
        
        // ����web.xml������Filter����ȫ�����󣬿����ų�����Ҫ���˵�url
        String requestURI = req.getRequestURI();
        
        // ���˰�����
        if (check(requestURI))
        {
            chain.doFilter(request, response);
            return;
        }
        // if (requestURI.equals(req.getContextPath() + "/rest/signin"))
        // {
        // chain.doFilter(request, response);
        // return;
        // }
        
        // �ж��û��Ƿ��¼������ҳ��Ĵ���
        if (null == session.getAttribute("operator"))
        {
            // δ��¼�û����ض��򵽵�¼ҳ��
            ((HttpServletResponse)response).sendRedirect(req.getContextPath() + "/rest/signin");
            return;
        }
        else
        {
            // �ѵ�¼�û����������
            chain.doFilter(request, response);
        }
    }
    
    /**
     * init
     * 
     * @param arg0
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig init)
        throws ServletException
    {
        log.info("��ʼ��filter....");
        String noChecks = init.getInitParameter(NO_CHECK);
        for (String no : noChecks.split(","))
        {
            // ȡ�ù������ټ������õİ��������·��
            noCheckList.add(init.getServletContext().getContextPath() + no.trim());
        }
    }
    
    /**
     * 
     * ��������
     * 
     * @param path
     * @return
     */
    private boolean check(String path)
    {
        if (noCheckList == null || noCheckList.size() <= 0)
            return false;
        for (String s : noCheckList)
        {
            if (path.equals(s))
            {
                return true;
            }
        }
        return false;
    }
}
