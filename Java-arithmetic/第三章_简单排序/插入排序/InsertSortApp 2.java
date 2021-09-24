package 第三章_简单排序.插入排序;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/29 10:32
 * Description:
 */


class InsertSortApp {
   public static void main(String[] args) {
      int maxSize = 100001;
      ArrayIns arr;
      arr = new ArrayIns(maxSize);

//      arr.insert(77);
//      arr.insert(99);
//      arr.insert(44);
//      arr.insert(55);
//      arr.insert(22);
//      arr.insert(88);
//      arr.insert(11);
//      arr.insert(00);
//      arr.insert(77);
//      arr.insert(33);
//      arr.insert(666);
//      arr.insert(66);
//      arr.insert(59);
//      arr.insert(77);
//      arr.insert(66);
//      arr.insert(88);
//      arr.insert(99);

      for(int i = 0 ; i < maxSize ; i ++){
         arr.insert((int)(Math.random()*10000));
      }

//      arr.display();

      System.out.println(arr.median());

      Date start = new Date();
      arr.insertionSort();
      Date end = new Date();
      System.out.println("消耗时间:" + (end.getTime() - start.getTime()));

//      arr.display();
//      long a = arr.median();
//      System.out.println(a);

//      arr.noDups();
//      arr.display();
   }
}
