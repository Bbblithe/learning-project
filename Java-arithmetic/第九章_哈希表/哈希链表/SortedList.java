package 第九章_哈希表.哈希链表;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/3 11:04
 * Description:
 */


public class SortedList {
   private Link first;

   public SortedList(){
      first = null;
   }

   public void insert(Link theLink){
      int key = theLink.getKey();
      Link previous = null;
      Link current = first;

      while(current != null && key > current.getKey()){
         previous = current;
         current = current.next;
      }
      if(previous == null){
         first = theLink;
      }else{
         previous.next = theLink;
      }
      theLink.next = current;
   }

   public void delete(int key){
      Link previous = null;
      Link current = first;

      while(current != null && current.getKey() != key){
         previous = current;
         current = current.next;
      }

      if(previous == null){
         first = first.next;
      }else{
         previous.next = current.next;
      }
   }

   public Link find(int key){
      Link current = first;

      while(current != null && current.getKey() != key){
         current = current.next;
      }
      return current;
   }

   public void displayLink(){
      System.out.print("List (first-->last): ");
      Link current = first;
      while(current != null){
         current.displayLink();
         current = current.next;
      }
      System.out.println("");
   }
}
