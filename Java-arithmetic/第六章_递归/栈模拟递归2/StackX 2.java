package 第六章_递归.栈模拟递归2;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/15 18:20
 * Description:
 */


class StackX {
   private int maxSize;
   private int[] stackArray;
   private int top;

   public StackX(int s){
      maxSize = s;
      stackArray = new int[maxSize];
      top = -1;
   }

   public void push(int p){
      stackArray[++top] = p;
   }

   public int pop(){
      return stackArray[top--];
   }

   public int peek(){
      return stackArray[top];
   }

   public boolean isEmpty(){
      return (top == -1);
   }
}
