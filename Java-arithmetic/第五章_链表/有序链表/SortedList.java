package 第五章_链表.有序链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/7 22:37
 * Description:
 */


class SortedList {
   private Link first;

   public SortedList(){
      first = null;
   }

   public boolean iseEmpty(){
      return first == null;
   }

   public void insert(long key){
      Link newLink = new Link(key);
      Link previous = null;
      Link current = first;

      while(current != null && key > current.dData){
         previous = current;
         current = current.next;
      }

      if(previous == null){
         first = newLink;
      }else{
         previous.next = newLink;
      }
      newLink.next = current;
   }

   public Link remove(){
      Link temp = first;
      first = first.next;
      return temp;
   }

   public void displayList(){
      System.out.print("List (first-->last): ");
      Link current = first;
      while(current != null ){
         current.displayLink();
         current = current.next;
      }
      System.out.println("");
   }
}
