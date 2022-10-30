package com.blithe.config;

import com.blithe.web.MyServlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 09:56
 * Description:
 */

@Configuration
public class WebApplicationConfig {

    // 注册servlet
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return bean;
    }

    // 注册encodingFilter
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean reg = new FilterRegistrationBean();
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        // 指定编码方式
        filter.setEncoding("utf-8");
        // 指定request，response都使用encoding的值
        filter.setForceEncoding(true);
        reg.setFilter(filter);
        reg.addUrlPatterns("/*");
        return reg;
    }
}
