package 第十章_堆.编程作业.对比堆排序与直接插入;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/6 16:26
 * Description:
 */


class HeapApp {
   public static void main(String[] args) throws IOException {


      Heap heap1 = new Heap(1000000);
      Heap heap2 = new Heap(1000000);
      Date start = new Date();
      for(int i = 0 ; i < 1000000 ; i ++){
         heap1.insert((int)Math.random() * 10000);
      }
      Date end = new Date();
      System.out.println("时间" + (end.getTime() - start.getTime()));

      start = new Date();
      for(int i = 0 ; i < 1000000 ; i++){
         heap2.toss(new Node((int) Math.random() *  10000));
      }
      heap2.restoreHeap();
      end = new Date();
      System.out.println("时间" + (end.getTime() - start.getTime()));
   }


   public static String getString() throws IOException {
      return new BufferedReader(new InputStreamReader(System.in)).readLine();
   }

   private static char getChar() throws IOException{
      return getString().charAt(0);
   }

   public static int getInt() throws IOException{
      return Integer.valueOf(getString());
   }
}
