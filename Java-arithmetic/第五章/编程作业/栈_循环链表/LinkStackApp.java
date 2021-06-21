package 第五章.编程作业.栈_循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/21 16:39
 * Description:
 */


class LinkStackApp {
   public static void main(String[] args) {
      Stack theStack = new Stack();

      theStack.push(20);
      theStack.push(40);
      theStack.push(60);
      theStack.push(80);

      while( !theStack.isEmpty()){
         long value = theStack.pop();
         System.out.println(value);
      }

      theStack.push(20);
      theStack.push(300);
      theStack.push(4000);

      while( !theStack.isEmpty()){
         long value = theStack.pop();
         System.out.println(value);
      }
   }
}
