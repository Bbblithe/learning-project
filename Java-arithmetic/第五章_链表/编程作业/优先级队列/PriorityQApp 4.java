package 第五章_链表.编程作业.优先级队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/18 15:18
 * Description:
 */


class PriorityQApp {
   public static void main(String[] args) {
      PriorityQ thePQ = new PriorityQ();

      thePQ.insert(30);
      thePQ.insert(50);
      thePQ.insert(10);
      thePQ.insert(40);
      thePQ.insert(20);

      while( !thePQ.isEmpty()){
         long item = thePQ.remove();
         System.out.print(item + " ");
      }
   }
}
