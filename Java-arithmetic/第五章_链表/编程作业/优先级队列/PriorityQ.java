package 第五章_链表.编程作业.优先级队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/18 15:11
 * Description:
 */


class PriorityQ {
   LinkList PQ = null;

   public PriorityQ(){
      PQ = new LinkList();
   }

   public void insert(long item){
      PQ.insert(item);
   }

   public long remove(){
      Link temp = PQ.remove();
      return temp.dData;
   }

   public boolean isEmpty(){
      return PQ.getFirst() == null;
   }
}
