package 第五章.有序链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/7 22:43
 * Description:
 */


class SortedListApp {
   public static void main(String[] args){
      SortedList theSortedList = new SortedList();
      theSortedList.insert(20);
      theSortedList.insert(40);

      theSortedList.displayList();

      theSortedList.insert(10);
      theSortedList.insert(30);
      theSortedList.insert(50);

      theSortedList.displayList();

      theSortedList.remove();

      theSortedList.displayList();
   }
}
