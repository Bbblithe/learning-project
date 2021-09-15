package 第五章.链表队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/5 22:40
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
