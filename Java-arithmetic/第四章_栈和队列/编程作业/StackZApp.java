package 第四章_栈和队列.编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/30 22:30
 * Description:
 */


class StackZApp {
   public static void main(String[] args) {
      StackZ stack = new StackZ(10);

      stack.push(100);
      stack.push(1111);
      stack.push(0);
      stack.push(666);

      while(!stack.isEmpty()){
         System.out.println(stack.pop());
      }
   }
}
