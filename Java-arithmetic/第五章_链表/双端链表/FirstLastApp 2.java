package 第五章_链表.双端链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/4 19:52
 * Description:
 */


class FirstLastApp {
   public static void main(String[] args){
      FirstLastList theList = new FirstLastList();

      theList.insertFirst(22);
      theList.insertFirst(44);
      theList.insertFirst(66);

      theList.insertLast(11);
      theList.insertLast(33);
      theList.insertLast(55);

      theList.displayList();

      theList.deleteFirst();
      theList.deleteFirst();

      theList.displayList();
   }
}
