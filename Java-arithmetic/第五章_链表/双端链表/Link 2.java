package 第五章_链表.双端链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/4 19:33
 * Description:
 */


class Link {
   public long dData;
   public Link next;

   public Link(long d){
      dData = d;
   }

   public void displayLink(){
      System.out.print(dData + " ");
   }
}
