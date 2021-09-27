package 第五章_链表.编程作业.双端队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/18 15:25
 * Description:
 */


class FirstLastLinkList {
   private Link first;
   private Link last;

   public FirstLastLinkList(){
      first = null;
      last = null;
   }

   public boolean isEmpty(){
      return first == null;
   }

   public void insertFirst(long key){
      Link newLink = new Link(key);

      if(isEmpty()){
         last = newLink;
      }
      newLink.next = first;
      first = newLink;
   }

   public void insertAfter(long key){
      Link newLink = new Link(key);
      if(isEmpty()){
         first = newLink;
      }else{
         last.next = newLink;
      }
      last = newLink;
   }

   public long deleteFirst(){
      long temp = first.dData;
      if(first.next == null){
         last = null;
      }
      first = first.next;
      return temp;
   }

   public long deleteLast(){
      long temp = last.dData;
      Link previous = null;
      Link current = first;
      if(current.next == null){
         first = null;
         last = null;
         return temp;
      }
      while(current.next != null){
         previous = current ;
         current = current.next;
      }
      previous.next = null;
      return temp;
   }

   public void displayList(){
      System.out.print("List (first-->last): ");
      Link current = first;
      while(current.next != null){
         System.out.print(current.dData + " ");
      }
      System.out.println("");
   }
}
