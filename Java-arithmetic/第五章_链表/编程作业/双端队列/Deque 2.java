package 第五章_链表.编程作业.双端队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/18 15:56
 * Description:
 */


class Deque {
   private FirstLastLinkList dequeList = null;
   private int nItems;

   public Deque(){
      dequeList = new FirstLastLinkList();
      nItems = 0;
   }

   public void insertLeft(long value){
      dequeList.insertFirst(value);
      nItems ++;
   }

   public void insertRight(long value){
      dequeList.insertAfter(value);
      nItems ++;
   }

   public long removeLeft(){
      nItems --;
      return dequeList.deleteFirst();
   }

   public long removeRight(){
      nItems --;
      return dequeList.deleteLast();
   }

   public boolean isEmpty(){
      return dequeList.isEmpty();
   }

   public int getNItems(){
      return nItems;
   }
}
