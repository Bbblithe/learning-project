package 第五章.链表队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/5 22:56
 * Description:
 */


class LinkQueueApp {
   public static void main(String[] args) {
      LinkQueue theQueue = new LinkQueue();
      theQueue.insert(20);
      theQueue.insert(40);

      theQueue.displayQueue();

      theQueue.insert(60);
      theQueue.insert(80);

      theQueue.displayQueue();

      theQueue.remove();
      theQueue.remove();

      theQueue.displayQueue();
   }
}
