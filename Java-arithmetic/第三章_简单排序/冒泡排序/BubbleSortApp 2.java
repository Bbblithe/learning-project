package 第三章_简单排序.冒泡排序;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/6 21:58
 * Description:
 */


class BubbleSortApp {
   public static void main(String[] args){
      int maxSize = 100001;
      ArrayBub arr;
      arr = new ArrayBub(maxSize);

      for(int j = 0 ; j < maxSize ; j ++){
         arr.insert((int)(Math.random()*10000));
      }



//      arr.insert(77);
//      arr.insert(99);
//      arr.insert(44);
//      arr.insert(55);
//      arr.insert(22);
//      arr.insert(88);
//      arr.insert(11);
//      arr.insert(00);
//      arr.insert(66);
//      arr.insert(33);

//      arr.display();

      Date start = new Date();
      arr.bubbleSort();
      Date end = new Date();
//      arr.display();

      System.out.println("消耗时间:" + (end.getTime() - start.getTime()));
   }
}
