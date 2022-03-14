package com.blithe.handler;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 16:29
 * Description:
 */

// 拦截器类：拦截用户请求
class MyInterceptor implements HandlerInterceptor {

    // 验证登陆的用户信息,如果有就return true
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("1111拦截器的MyInterceptor的preHandle()方法");
        String loginName = "";
        // 从Session中获取信息
        Object name = request.getSession().getAttribute("name");
        if(name != null){
            loginName = String.valueOf(name);
        }

        // 判断登陆的账户是否符合要求
        if("zhangsan".equals(loginName)){
            return true;
        }
        // 给用户提示
        request.getRequestDispatcher("/tips.jsp").forward(request,response);
        return false;
    }


}
