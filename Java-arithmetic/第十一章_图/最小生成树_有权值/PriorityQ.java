package 第十一章_图.最小生成树_有权值;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 15:45
 * Description:
 */


class PriorityQ {
   private final int SIZE = 20;
   private Edge[] queArray;
   private int size;

   public PriorityQ(){
      queArray = new Edge[SIZE];
      size = 0;
   }

   public void insert(Edge item){
      int j ;
      for( j = 0 ; j < size ; j ++){
         if(item.distance >= queArray[j].distance){
            break;
         }
      }

      for(int k = size - 1; k >= j ;k --){
         queArray[k+1] = queArray[k];
      }

      queArray[j] = item;
      size++;
   }

   public Edge removeMin(){
      return queArray[--size];
   }

   public void removeN(int n){
      for(int j = n ;j < size -1 ; j ++){
         queArray[j] = queArray[j+1];
      }
      size --;
   }

   public Edge peekMin(){return queArray[size -1];}

   public int size() {
      return size;
   }

   public boolean isEmpty(){
      return (size == 0);
   }

   public Edge peekN(int n){
      return queArray[n];
   }

   public int find(int findDex){
      for(int i = 0 ; i < size ; i ++){
         if(queArray[i].destVert == findDex){
            return i;
         }
      }
      return -1;
   }
}
