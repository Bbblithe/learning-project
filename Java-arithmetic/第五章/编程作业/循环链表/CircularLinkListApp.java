package 第五章.编程作业.循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/20 08:32
 * Description:
 */


class CircularLinkListApp {
   public static void main(String[] args) {
      CircularLinkList list = new CircularLinkList();
      list.insert(20);
      list.insert(30);
      list.insert(40);
      list.insert(50);

      list.displayList();

      System.out.println(list.find(30));

      list.delete();
      list.delete();

      list.displayList();

      list.step();
      list.insert(666);
      list.insert(222);

      list.displayList();
   }
}
