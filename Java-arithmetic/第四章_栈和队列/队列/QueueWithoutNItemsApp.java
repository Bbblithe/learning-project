package 第四章_栈和队列.队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/13 23:14
 * Description:
 */


class QueueWithoutNItemsApp {
    public static void main(String[] args){
        QueueWithoutNItems theQueue = new QueueWithoutNItems(5);

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

        while( !theQueue.isEmpty()){
            long n = theQueue.remove();
            System.out.print(n + " ");
        }
    }
}
