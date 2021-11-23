package 第四章_栈和队列.编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/30 22:14
 * Description:
 */


class StackZ {
   private Deque Stack;
   private int top;

   public StackZ(int s){
      Stack = new Deque(s);
      top = Stack.getRight();
   }

   public void push(long value){
      Stack.insertRight(value);
      top = Stack.getRight();
   }

   public long pop(){
      top = Stack.getRight()-1;
      return Stack.removeRight();
   }

   public long peek(){
      return Stack.getDequeArray()[top];
   }

   public boolean isEmpty(){
      return Stack.getNItems() == 0;
   }
}
