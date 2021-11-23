package 第四章_栈和队列.优先队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/17 22:31
 * Description:
 */


class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);

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
