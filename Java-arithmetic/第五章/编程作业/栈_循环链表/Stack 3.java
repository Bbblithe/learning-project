package 第五章.编程作业.栈_循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/20 20:53
 * Description:
 */


class Stack {
   private CircularLinkList Stack;
   private int top = -1;
   private boolean flag = true;

   public Stack(){
      Stack = new CircularLinkList();
   }

   public void push(long value){
      top++;
      Stack.insert(value);
   }

   public long pop(){
      if(flag) {
         Stack.step();
         flag = false;
      }
      top--;
      if(top == -2){
         Stack.setCurrent(Stack.getPrevious());
      }
      return Stack.delete().dData;
   }

   public long peek(){
      return Stack.peek().dData;
   }

   public boolean isEmpty(){
      return top==-1;
   }
}
