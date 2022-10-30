package com.blithe.config;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/29 09:09
 * Description:
 */

import com.blithe.vo.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Configuration：表示当前类是作为配置文件使用（用来配置容器的）
 *
 * SpringConfig 这个类就相当于beans.xml
 */
@Configuration
@ImportResource(value={"classpath:applicationContext.xml","classpath:bean.xml"})
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "com.blithe.vo")
public class SpringConfig {

    /**
     * 创建方法，方法的返回值是对象。在方法的方面加入@Bean
     * 方法的返回值对象就注入导容器中。
     *
     * @Bean:把对象注入到spring容器中（相当于<bean></bean>)
     *  说明：@Bean，不指定对象的名称，默认方法名是id
     */
    @Bean
    public Student createStudent(){
        Student s1 = new Student();
        s1.setAge(29);
        s1.setName("andy");
        s1.setSex("man");
        return s1;
    }

    /**
     * 指定对象在容器中的名称(指定<bean></bean>的id属性
     */
    @Bean(name="andy")
    public Student makeStudent(){
        Student s2 = new Student();
        s2.setAge(29);
        s2.setName("andy");
        s2.setSex("women");
        return s2;
    }
}
