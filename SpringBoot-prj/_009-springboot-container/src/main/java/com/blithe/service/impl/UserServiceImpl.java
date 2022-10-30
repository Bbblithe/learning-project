package com.blithe.service.impl;

import com.blithe.service.UserService;

import org.springframework.stereotype.Service;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 08:09
 * Description:
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行了业务方法的sayHello : " + name);
    }
}
