package com.blithe.web;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 08:56
 * Description:
 */

/**
 * 自定义拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
   /**
    *
    * @param request
    * @param response
    * @param handler 被拦截的控制器对象
    * @return bool
    *    true：请求能被controller处理
    *    false：请求被拦截
    * @throws Exception
    */
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      System.out.println("执行了 LoginInterceptor的preHandle方法");
      return HandlerInterceptor.super.preHandle(request, response, handler);
   }
}
