package 第四章_栈和队列.优先队列;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/14 12:52
 * Description:
 */


public class PriorityQ {
   private int maxSize;
   private long[] queArray;
   private int nItems;

   public PriorityQ(int s){
      maxSize = s;
      queArray = new long[maxSize];
      nItems = 0;
   }

   public void insert(long item){
      int j;

      if(nItems == 0){
         queArray[nItems++] = item;
      }else{
         for(j = nItems - 1; j >= 0 ; j --){
            if(item > queArray[j]){
               queArray[j+1] = queArray[j];
            }
            else{
               break;
            }
         }
         queArray[j+1] = item;
         nItems++;
      }
   }

   public long remove(){
      return queArray[--nItems];
   }

   public long peekMin(){
      return queArray[nItems - 1];
   }

   public boolean isEmpty(){
      return (nItems == 0);
   }

   public boolean isFull(){
      return (nItems == maxSize);
   }
}
