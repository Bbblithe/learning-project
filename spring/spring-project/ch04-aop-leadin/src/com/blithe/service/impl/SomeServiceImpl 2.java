package com.blithe.service.impl;

import com.blithe.service.SomeService;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/10 13:44
 * Description:
 */

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行了doSome方法");
    }

    @Override
    public void doOther() {
        System.out.println("执行了doOther方法");
    }
}
