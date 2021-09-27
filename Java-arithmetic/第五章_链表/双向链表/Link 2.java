package 第五章_链表.双向链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/10 20:54
 * Description:
 */


class Link {
   public long dData;
   public Link next;
   public Link previous;

   public Link(long d){
      dData = d;
   }

   public void displayLink(){
      System.out.print(dData + " ");
   }
}
