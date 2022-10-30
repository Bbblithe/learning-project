package com.blithe.config;

import com.blithe.web.MyServlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 09:56
 * Description:
 */

@Configuration
public class WebApplicationConfig {

    // 注册servlet
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(), "/myservlet");
        return bean;
    }
}
