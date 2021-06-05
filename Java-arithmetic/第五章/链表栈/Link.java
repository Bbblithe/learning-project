package 第五章.链表栈;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/4 20:12
 * Description:
 */


class Link {
   public long dData;
   public Link next;

   public Link(long dd) {
      dData = dd;
   }

   public void displayLink() {
      System.out.print(dData + " ");
   }
}
