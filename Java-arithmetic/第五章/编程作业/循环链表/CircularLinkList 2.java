package 第五章.编程作业.循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/19 20:37
 * Description:
 */


class CircularLinkList {
   private Link current;

   public CircularLinkList(){
      current = null;
   }

   public void insert(long dd){
      Link newLink = new Link(dd);
      if(current == null){
         current = newLink;
      }else {
         newLink.next = current.next;
      }
      current.next = newLink;
   }

   public Link find(long key){
      Link temp = current;
      do{
         if(current.dData == key){
            break;
         }
         current = current.next;
      }while( temp!= current);
//      while (current.dData != key && i != 1) {
//         if(temp == current){
//            i ++;
//         }
//         if(i == 1){
//            break;
//         }
//         current = current.next;
//      }
      if(current.dData == key){
         return current;
      }else{
         return null;
      }
   }

   public Link delete(){
      Link temp = current;
      Link previous = null;
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
}
