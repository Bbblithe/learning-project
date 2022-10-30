package com.blithe.service.impl;

import com.blithe.service.HelloService;

import org.springframework.stereotype.Service;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 08:36
 * Description:
 */

@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好 ：" +name;
    }
}
