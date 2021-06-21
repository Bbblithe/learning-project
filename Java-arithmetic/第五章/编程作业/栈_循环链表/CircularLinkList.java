package 第五章.编程作业.栈_循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/19 20:37
 * Description:
 */


class CircularLinkList {
   private Link current;

   public CircularLinkList(){
      current = new Link(0);
      current.next = current;
   }

   public void insert(long dd){
      Link newLink = new Link(dd);
      newLink.next = current.next;
      current.next = newLink;
   }

   public Link delete(){
      Link temp = current;
      Link previous;
      while(current.next != temp){
         current = current.next;
      }
      if(current.next == current){
         current = null;
      }else {
         previous = current;
         previous.next = current.next.next;
         current = current.next;
      }
      return temp;
   }

   public void displayList(){
      Link temp = current;
      System.out.print("List (first--last): ");
      do{
         current.displayLink();
         current = current.next;
      }
      while(current != temp);
      System.out.println("");
   }

   public void step(){
      current = current.next;
   }

   public Link peek(){
      return current;
   }

   public boolean isEmpty(){
      return current == null;
   }

   public Link getPrevious(){
      Link temp = current;
      Link previous = null;
      while(current.next != temp){
         current = current.next;
      }
      previous = current;
      current = current.next;
      return previous;
   }

   public Link getCurrent() {
      return current;
   }

   public void setCurrent(Link current) {
      this.current = current;
   }
}
