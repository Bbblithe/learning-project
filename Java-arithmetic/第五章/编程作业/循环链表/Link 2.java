package 第五章.编程作业.循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/19 20:33
 * Description:
 */


public class Link {
   public long dData;
   public Link next;

   public Link(long dData){
      this.dData = dData;
   }

   public void displayLink(){
      System.out.print(dData + " ");
   }
}
