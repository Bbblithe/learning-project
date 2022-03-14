package com.blithe.handler;

import com.blithe.exception.AgeException;
import com.blithe.exception.NameException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 10:53
 * Description:
 * @ControllerAdvice：控制器增强（给控制器类增加功能，增加了异常处理方法）
 *  位置：放在类的上面
 *  特点：必须让框架识别出这个注解所在的包名，需要在SpringMVC声明组件扫描器。
 *  指定@ControllerAdvice所在的包名
 */
@ControllerAdvice
class GlobalExceptionHandler {
    // 定义方法处理发生的异常
    /*
        处理异常的方法和控制器方法的定义相同，可以有多个参数，
        返回值类型也可以是ModelAndView、String、void、Object

        形参是一个Exception，表示Controller抛出的异常对象，通
        过形参可以获取发生的异常信息

        加入注解：@ExceptionHandler(异常的class)：表死异常的类型，当发生此类型异常时
        由当前注解方法来执行
     */
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception e){
        // 处理NameException的异常
        /*
        异常发生需要处理的逻辑
            1、需要将异常记录下来（数据库，或者日志中）：时间，（位置）哪一个方法，异常的错误内容
            2、发送通知，将异常的信息通过邮件，短信，微信发送给相关技术人员
            3、给用户友好的提示
         */
        // 给用户的提示
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你的姓名不能为空！");
        // 可能在jsp中使用异常对象
        mv.addObject("ex",e);
        mv.setViewName("nameError");
        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception e){
        // 处理NameException的异常
        /*
        异常发生需要处理的逻辑
            1、需要将异常记录下来（数据库，或者日志中）：时间，（位置）哪一个方法，异常的错误内容
            2、发送通知，将异常的信息通过邮件，短信，微信发送给相关技术人员
            3、给用户友好的提示
         */
        // 给用户的提示
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","您的年龄不合法！");
        // 可能在jsp中使用异常对象
        mv.addObject("ex",e);
        mv.setViewName("ageError");
        return mv;
    }

    // 需要处理其他未知异常，不知类型的异常
    @ExceptionHandler
    public ModelAndView doOtherException(Exception e){
        // 处理其他异常
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","发生异常了！");
        // 可能在jsp中使用异常对象
        mv.addObject("ex",e);
        mv.setViewName("defaultError");
        return mv;
    }
}
