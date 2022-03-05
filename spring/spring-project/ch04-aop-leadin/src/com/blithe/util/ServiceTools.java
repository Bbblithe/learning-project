package com.blithe.util;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/10 13:54
 * Description:
 */

public class ServiceTools {
   public static void doLog(){
      System.out.println("时间：" + new Date());
   }

   public static void doTrans(){
      System.out.println("事务提交");
   }
}
