package com.blithe.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 16:29
 * Description:
 */

// 拦截器类：拦截用户请求
class MyInterceptor implements HandlerInterceptor {

    private long bTime = 0;
    /**
     * preHandler叫做预处理方法（是整个项目的入口）
     * 参数：
     *  Object Handler：被拦截的控制器对象
     * 返回值：
     *  true：请求通过拦截器的验证，可以执行处理器方法
     *  false：请求没有通过拦截器的验证，请求到达拦截器就截止，请求没有被处理
     *
     * 特点：
     *  1.方法在控制器方法（MyController的doSome）之前先执行的
     *      用户的请求首先到达此方法
     *
     *  2.在这个方法中可以获取请求的信息，验证请求是否符合要求。
     *      可以验证用户是否登陆，验证用户是否有权限访问某个连接地址（url）。
     *      如果验证成功，则放行请求，此时控制器方法执行
     *      如果验证失败，则截断请求，请求不能处理
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        bTime = System.currentTimeMillis();
        System.out.println("拦截器的MyInterceptor的preHandle()方法");
        return HandlerInterceptor.super.preHandle(request, response, handler);

        // 给浏览器一个返回结果
        // request.getRequestDispatcher("/tips.jsp").forward(request,response);
        // return true;
    }

    /*
        afterCompletion：最后执行的方法

        参数：
            Object handler：被拦截的处理器对象
            Exception ex：程序中发生的异常

        特点：
            1.在请求处理完成之后执行的（框架中规定是当你的视图处理完成后，对视图执行了forward，就认为请求处理完成）
        作用：
            使用其做资源回收工作，在程序请求中产生了一些对象，在这里进行删除操作
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器的MyInterceptor的afterCompletion()方法");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        long eTime = System.currentTimeMillis();
        System.out.println("从preHandle到请求处理完成的时间："  + (eTime - bTime));
    }

    /*
        postHandler：后处理方法。
        参数：
            Object Handler：被拦截的处理器对象MyController
            ModelAndView mv：处理器方法的返回值

        特点：
            1.在处理器方法之后执行（MyController.doSome()方法之后执行）
            2.能够获取到处理器方法的返回值ModelAndView，可以修改ModelAndView中的数据和视图，
            可以影响到最后的执行结果
        作用：主要是对原来的执行结果做二次的修正。
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器的MyInterceptor的postHandle()方法");
        // 对原来的doSome()执行结果，需要调整
        if(modelAndView != null){
            // 修改数据
            modelAndView.addObject("mydate",new Date());
            // 修改视图
            modelAndView.setViewName("other");
        }
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
