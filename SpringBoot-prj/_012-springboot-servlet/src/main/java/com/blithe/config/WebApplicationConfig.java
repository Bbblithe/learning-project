package com.blithe.config;

import com.blithe.web.MyServlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 09:21
 * Description:
 */

@Configuration
public class WebApplicationConfig {
    // 定义方法，注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        // 第一个参数Servlet对象，第二个是url地址
        // ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login","/test");
        return bean;
    }
}
