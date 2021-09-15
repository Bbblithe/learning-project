package 第四章_栈和队列.后缀表达式.计算后缀表达式;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/22 10:04
 * Description:
 */


class StackY {
   private int maxSize;
   private int[] stackArray;
   private int top;

   public StackY(int s){
      maxSize = s;
      stackArray = new int[maxSize];
      top = -1;
   }

   public void push(int j){
      stackArray[++top] = j;
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

   public int size(){
      return top+1;
   }

   public int peekN(int n){
      return stackArray[n];
   }

   public void displayStack(String s){
      System.out.print(s);
      System.out.print("Stack (bottom -- > top): ");
      for(int j = 0 ; j < size() ; j ++){
         System.out.print(peekN(j) + " ");
      }
      System.out.println("");
   }
}
