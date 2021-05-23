package com.blithe.xwj.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class OneFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        // 1.调用请求对象读取请求包中请求行中URI，了解用户访问的资源文件是啥
        String uri = request.getRequestURI(); // [/网站名/资源文件名称/] == /myWeb/login.html or /myWeb/login_error.html or....

        // 2.如果本次请求资源文件与登陆有关【 login.html、login_error.html 或者 loginServlet 】此时应该无条件放行
        if(uri.indexOf("login") != -1 || "/myWeb/".equals(uri)){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        // 3.如果本次请求访问的是其他资源文件，需要得到用户在服务端HttpSession
        HttpSession session = request.getSession(false);
        if(session != null){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        // 4.拒绝请求
        request.getRequestDispatcher("/login_error.html").forward(servletRequest,servletResponse);
    }
}
