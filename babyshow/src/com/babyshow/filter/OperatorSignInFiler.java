/*
 * 文 件 名:  OperatorSignInFiler.java
 * 描    述:  OperatorSignInFiler.java
 * 时    间:  2013-8-2
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
 * 管理员登录过滤器，用来过滤所有需要登录才能访问的文件
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-8-2]
 */
public class OperatorSignInFiler implements Filter
{
    /**
     * 日志
     */
    private static Logger log = Logger.getLogger(OperatorSignInFiler.class);
    
    private static final String NO_CHECK = "noCheck";
    
    private static List<String> noCheckList = new ArrayList<String>();
    
    /**
     * 重载方法
     */
    @Override
    public void destroy()
    {
    }
    
    /**
     * 重载方法
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
        
        // 由于web.xml中设置Filter过滤全部请求，可以排除不需要过滤的url
        String requestURI = req.getRequestURI();
        
        // 过滤白名单
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
        
        // 判断用户是否登录，进行页面的处理
        if (null == session.getAttribute("operator"))
        {
            // 未登录用户，重定向到登录页面
            ((HttpServletResponse)response).sendRedirect(req.getContextPath() + "/rest/signin");
            return;
        }
        else
        {
            // 已登录用户，允许访问
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
        log.info("初始化filter....");
        String noChecks = init.getInitParameter(NO_CHECK);
        for (String no : noChecks.split(","))
        {
            // 取得工程名再加上配置的白名单相对路径
            noCheckList.add(init.getServletContext().getContextPath() + no.trim());
        }
    }
    
    /**
     * 
     * 检查白名单
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
