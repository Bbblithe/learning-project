package 第六章_递归.栈递归;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/15 17:29
 * Description:
 */


public class StackX {
   private int maxSize;
   private Params[] stackArray;
   private int top;

   public StackX(int s){
      maxSize = s;
      stackArray = new Params[maxSize];
      top = -1;
   }

   public void push(Params p){
      stackArray[++top] = p;
   }

   public Params pop(){
      return stackArray[top--];
   }

   public Params peek(){
      return stackArray[top];
   }
}
