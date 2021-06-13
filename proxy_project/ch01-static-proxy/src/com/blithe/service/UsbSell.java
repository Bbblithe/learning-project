package com.blithe.service;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/13 17:40
 * Description:
 */

// 表示功能的，厂家、商家都要完成的功能
public interface UsbSell {
    /**
     * 定义方法
     * @param amount 表示一次购买的数量，暂时不用
     * @return 返回值表示一个u盘的价格
     */
    float sell(int amount);

    // 可以多个其他的方法
}
