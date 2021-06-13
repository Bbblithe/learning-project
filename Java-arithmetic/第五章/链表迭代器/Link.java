package 第五章.链表迭代器;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/12 23:13
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
