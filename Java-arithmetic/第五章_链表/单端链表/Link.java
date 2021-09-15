package 第五章_链表.单端链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/31 22:48
 * Description:
 */


class Link {
   public int iData;
   public double dData;
   public Link next;

   public Link(int id,double dd){
      iData = id;
      dData = dd;
   }

   public void displayLink(){
      System.out.print("{" + iData + ", " + dData + "} ");
   }
}
