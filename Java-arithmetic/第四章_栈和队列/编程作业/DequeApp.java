package 第四章.编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/30 21:30
 * Description:
 */


class DequeApp {
   public static void main(String[] args) {
      Deque doubleEndQueue = new Deque(5);
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
