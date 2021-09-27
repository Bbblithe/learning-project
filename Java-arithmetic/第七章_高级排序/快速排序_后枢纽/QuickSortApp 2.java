package 第七章_高级排序.快速排序_后枢纽;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/24 14:15
 * Description:
 */


class QuickSortApp {
   public static void main(String[] args){
      int maxSize = 5000;
      ArrayIns arr;
      arr = new ArrayIns(maxSize);

      for(int j = 0 ; j < maxSize ; j ++){
         arr.insert((int)(Math.random()*10000));
      }
//      arr.display();
      Date start = new Date();
      arr.quickSort();
      Date end = new Date();
//      arr.display();

      System.out.println("消耗时间:" + (end.getTime() - start.getTime()));
   }
}
