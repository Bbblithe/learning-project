package 第五章_链表.链表栈;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/4 20:18
 * Description:
 */


class LinkStack {
   private LinkList theList;

   public LinkStack(){
      theList = new LinkList();
   }

   public void push(long j){
      theList.insertFirst(j);
   }

   public long pop(){
      return theList.deleteFirst();
   }

   public boolean isEmpty(){
      return ( theList.isEmpty());
   }

   public void displayStack(){
      System.out.print("Stack (top-->bottom): ");
      theList.displayList();
   }
}
