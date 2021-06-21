package 第五章.编程作业.双端队列;


/**
 * Author:  blithe.xwj
 * Date:    2021/6/18 16:15
 * Description:
 */


class DequeApp {
   public static void main(String[] args) {
      Deque doubleEndQueue = new Deque();
      doubleEndQueue.insertLeft(300);
      doubleEndQueue.insertLeft(400);
      doubleEndQueue.insertRight(10);
      doubleEndQueue.insertRight(20);

      while(!doubleEndQueue.isEmpty()){
         System.out.println(doubleEndQueue.removeLeft());
         System.out.println(doubleEndQueue.removeRight());
      }

   }
}
