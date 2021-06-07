package 第五章.有序链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/7 22:28
 * Description:
 */


class Link {
   public long dData;
   public Link next;

   public Link(long dd){
      dData = dd;
   }

   public void displayLink(){
      System.out.print(dData + " ");
   }
}
