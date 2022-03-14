package com.blithe.controller;

import com.blithe.vo.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/4 19:00
 * Description:
 */

/**
 * @RequestMapping:
 *  value=表示所有请求地址的公共部分（模块名称）
 *  位置：放在类的上面
 */
@Controller(value = "myController")
public class MyController {

    /**
     * 逐个接收请求参数：
     *  要求：处理器（控制器）方法的形参名和请求中参数名必须一致
     *  同名的请求参数赋值给同名的形参
     * 框架接收请求参数
     *  1.使用request对象接收请求参数
     *      String strName = request.getParameter("name");
     *      String strAge = request.getParameter("age");
     *  2.springmvc框架通过DispatcherServlet 调用MyController的doSome()方法
     *      调用方法时，按名称对应，把接收的参数赋值给形参
     *          doSome(strName,Integer.valueOf(strAge))
     *          框架会提供类型转换的功能，能把String转为int，long，float，double等类型。
     *  400状态码：客户端错误，表示提交请求参数过程中，发生了错误
     */
    @RequestMapping(value ="/receiveProperty.do")
    public ModelAndView doSome(String name,Integer age){
        // 可以在方法`中直接使用name，age
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

    /**
     * 请求中参数名和处理器方法的形参名不一样
     * @RequestParam:解决请求中参数名形参名不一样的问题
     *      属性：1.value 请求中的参数名称
     *          2.required 是一个boolean，默认是true
     *              true：表示请求中必须包含此参数。
     *      位置：在处理器方法的形参定义的前面
     */
    @RequestMapping(value ="/receiveParam.do")
    public ModelAndView receiveParam(@RequestParam(value = "rname",required = false) String name,
                                     @RequestParam(value = "rage") Integer age){
        System.out.println("doSome,name = " + name + "，age = " + age);
        // 可以在方法`中直接使用name，age
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);

        mv.setViewName("show");
        return mv;
    }

    /**
     * 处理器方法形参是java对象，这个对象的属性名和请求中参数名一样
     * 框架会创建形参的java对象给属性赋值。请求中的参数名是name，框架会调用setName()
     * @return
     */
    @RequestMapping(value ="/receiveObject.do")
    public ModelAndView receiveParam(Student stu){
        System.out.println("doSome,name = " + stu.getName() + "，age = " + stu.getAge());
        // 可以在方法`中直接使用name，age
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",stu.getName());
        mv.addObject("myage",stu.getAge());
        mv.addObject("mystudent",stu);









        mv.setViewName("show");
        return mv;
    }
}
