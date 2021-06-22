package 第五章.编程作业.栈_循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/22 09:21
 * Description:
 */


class Stack{
   private CircularLinkList theList;

   public Stack(){
      theList = new CircularLinkList();
   }
   public void push(long dd){
      theList.insertFirst(dd);
   }

   public long pop(){
      return theList.deleteFirst().dData;
   }

   public boolean isEmpty(){
      return theList.isEmpty();
   }

   public void displayStack() {
      System.out.print("Stack (top-->bottom): ");
      theList.displayList();
   }
}