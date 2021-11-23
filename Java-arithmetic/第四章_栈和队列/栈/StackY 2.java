package 第四章_栈和队列.栈;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/7 21:50
 * Description:
 */


class StackY {
   private int maxSize;
   private char[] stackArray;
   private int top;

   public StackY(int max){
      maxSize = max;
      stackArray = new char[max];
      top = -1;
   }

   public void push(char j){
      stackArray[++top] = j;
   }

   public char pop(){
      return stackArray[top--];
   }

   public char peek(){
      return stackArray[top];
   }

   /**
    * @return true if stack is empty
    */
   public boolean isEmpty(){
      return (top == -1);
   }
}

class Reverser{
   private String input,output;

   public Reverser(String in){
      input = in;
   }

   public String doRev(){
      int StackSize = input.length();
      StackY theStack = new StackY(StackSize);

      for(int i = 0 ; i < input.length() ; i++){
         theStack.push(input.charAt(i));
      }

      output = "";
      for(int i = 0 ; i < input.length() ; i ++){
         output+=theStack.pop();
      }

      return output;
   }
}