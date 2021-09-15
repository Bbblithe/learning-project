package 第四章_栈和队列.编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/29 22:48
 * Description:
 */


class Deque {
   private int maxSize;
   private long[] dequeArray;
   private int left;
   private int right;
   private int nItems;

   public Deque(int s){
      maxSize = s;
      dequeArray = new long[maxSize];
      nItems = 0;
      left = maxSize;
      right = -1;
   }

   public void insertLeft(long value){
      if(left-- == 0){
         left = maxSize;
      }
      dequeArray[left] = value;
      nItems ++;
   }

   public void insertRight(long value){
      if(right ++ == maxSize){
         right = 0;
      }
      dequeArray[right] = value;
      nItems ++;
   }

   public long removeLeft(){
      long temp = dequeArray[left++];
      if(left == maxSize){
         left = 0;
      }
      nItems--;
      return temp;
   }

   public long removeRight(){
      long temp = dequeArray[right--];
      if(right == -1){
         right = maxSize - 1;
      }
      nItems--;
      return temp;
   }

   /**
    * @return if empty return true,else return false
    */
   public boolean isEmpty(){
      return nItems == 0;
   }

   public boolean isFull(){
      return nItems == maxSize;
   }

   public int getRight(){
      return this.right;
   }

   public long[] getDequeArray(){
      return this.dequeArray;
   }

   public int getNItems(){
      return this.nItems;
   }
}

