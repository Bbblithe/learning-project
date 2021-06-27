package 第五章.链表栈;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/4 20:14
 * Description:
 */


class LinkList {
   private Link first;

   public LinkList(){
      first = null;
   }

   public boolean isEmpty(){
      return first == null;
   }

   public void insertFirst(long dd){
      Link newLink = new Link(dd);
      newLink.next = first;
      first = newLink;
   }

   public long deleteFirst(){
      Link temp = first;
      first = first.next;
      return temp.dData;
   }

   public void displayList(){
      Link current = first;
      while(current != null){
         current.displayLink();
         current = current.next;
      }
      System.out.println("");
   }
}
