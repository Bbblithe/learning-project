package com.blithe;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/15 20:13
 * Description:
 */

public class TestHelloMaven {

   @Test
   public void testAdd(){
      System.out.println("=====testAdd 测试add方法 =====");
      HelloMaven hello = new HelloMaven();
      int res = hello.add(10,20);
      // 判断结果是否正确
      Assert.assertEquals(30,res);
   }
}
