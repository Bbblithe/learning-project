package 第五章_链表.编程作业.优先级队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/18 14:32
 * Description:
 */


public class Link {
   public long dData;
   public Link next;

   public Link(long dd){
      dData = dd;
   }

   public void displayLink(){
      System.out.print(dData + " ");
   }
}
