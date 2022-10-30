package com.blithe.config;

import com.blithe.web.LoginInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 08:59
 * Description:
 */

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    //添加拦截器对象，注入到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 创建拦截器对象
        HandlerInterceptor interceptor = new LoginInterceptor();
        // 指定拦截的请求uri地址
        String path[] = {"/user/**"};
        // 指定不拦截的地址
        String excludePath[] = {"/user/login"};
        registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);
    }
}
