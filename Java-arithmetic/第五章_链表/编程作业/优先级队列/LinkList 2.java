package 第五章.编程作业.优先级队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/18 14:35
 * Description:
 */


public class LinkList {
   private Link first;

   public LinkList(){
      first = null;
   }

   public void insert(long key){
      Link previous = null;
      Link current = first;
      Link newLink = new Link(key);

      while (current != null && current.dData < key) {
         previous = current;
         current = current.next;
      }

      if(previous != null){
         previous.next = newLink;
      }else{
         first = newLink;
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
      while(current != null){
         current.displayLink();
         current = current.next;
      }
      System.out.println("");
   }

   public Link getFirst(){
      return first;
   }
}
