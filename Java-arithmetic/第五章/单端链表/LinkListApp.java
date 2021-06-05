package 第五章.单端链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/3 22:42
 * Description:
 */


class LinkListApp {
   public static void main(String[] args) {
      LinkList theList = new LinkList();

      theList.insertFirst(22,2.99);
      theList.insertFirst(44,4.99);
      theList.insertFirst(66,6.99);
      theList.insertFirst(88,8.99);

      theList.displayList();

      while( !theList.isEmpty()){
         Link aLink = theList.deleteFirst();
         System.out.print("Deleted ");
         aLink.displayLink();
         System.out.println("");
      }
      theList.displayList();
   }
}
