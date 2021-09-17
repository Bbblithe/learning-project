package 第四章_栈和队列.栈;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/5 18:01
 * Description:
 */


class StackX {
   private int maxSize;
   private long[] stackArray;
   private int top;

   public StackX(int max){
      maxSize = max;
      stackArray = new long[max];
      top = -1;
   }

   public void push(long value){
      stackArray[++top] = value;
   }

   public long pop(){
      return stackArray[top--];
   }

   public long peek(){
      return stackArray[top];
   }

   public boolean isEmpty(){
      return(top == -1);
   }
}
