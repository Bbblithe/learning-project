package 第五章.编程作业.栈_循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/22 09:34
 * Description:
 */


class LinkStackApp {
   public static void main(String[] args) {
      Stack theStack = new Stack(); // make stack

      theStack.push(20);
      theStack.push(40);

      theStack.displayStack();

      theStack.push(60);
      theStack.push(80);

      theStack.displayStack();

      theStack.pop();
      theStack.pop();

      theStack.displayStack();
   }
}