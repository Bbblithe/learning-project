package 第四章.编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/12 22:51
 * Description:
 */


class QueueApp {
   public static void main(String[] args){
      Queue theQueue = new Queue(5);

      theQueue.insert(10);
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);

      theQueue.remove();
      theQueue.remove();
      theQueue.remove();

      theQueue.insert(50);
      theQueue.insert(60);
      theQueue.insert(70);
      theQueue.insert(80);

      theQueue.show();
      System.out.println("===========");

      while ( !theQueue.isEmpty() ) {
         long n = theQueue.remove();
         System.out.print(n+" ");
      }
   }
}
