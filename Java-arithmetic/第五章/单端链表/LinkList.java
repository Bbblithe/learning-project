package 第五章.单端链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/2 22:56
 * Description:
 */


class LinkList {
   private Link first;

   public void LinkList(){
      first = null;
   }

   public boolean isEmpty(){
      return (first == null);
   }

   public void insertFirst(int id, double dd){
      Link newLink = new Link(id,dd);
      newLink.next = first;
      first = newLink;
   }

   public Link deleteFirst(){
      Link temp = first ;
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
