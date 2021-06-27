package 第2章编程作业;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/29 15:12
 * Description:
 */


class compareTest {
      public static void main(String[] args) {
      int maxSize = 100001;
      OrdArray arr;
      arr = new OrdArray(maxSize);
      Date start = new Date();
      for(int i = 0 ; i <= 100000 ; i ++){
            arr.insert(((int)(0+Math.random()*10000)),true);
      }
      Date end = new Date();

      System.out.println("消耗时间" + (end.getTime() - start.getTime()) + "毫秒");


      System.out.println("=====================");
   }
}
