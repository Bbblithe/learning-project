package 第五章_链表.链表队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/5 22:54
 * Description:
 */


class LinkQueue {
   private FirstLastList theList;

   public LinkQueue(){
      theList = new FirstLastList();
   }

   public boolean isEmpty(){
      return theList.isEmpty();
   }

   public void insert(long j){
      theList.insertLast(j);
   }

   public long remove(){
      return theList.deleteFirst();
   }

   public void displayQueue(){
      System.out.print("Queue (front--rear): ");
      theList.displayList();
   }
}
