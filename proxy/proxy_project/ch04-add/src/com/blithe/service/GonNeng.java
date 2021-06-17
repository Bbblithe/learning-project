package com.blithe.service;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/17 11:00
 * Description:
 */

public class GonNeng implements HelloService{
   @Override
   public int print(String name) {
      System.out.println("其他人写好的功能方法");
      return 2;
   }
}
