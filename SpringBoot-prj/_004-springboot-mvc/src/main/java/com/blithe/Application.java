package com.blithe;

import com.blithe.vo.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // 声明对象，对象能注入到容器
    @Bean
    public Student myStudent(){
        return new Student();
    }

}
