package 第四章.栈;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/7 21:46
 * Description:
 */


class StackXApp {
   public static void main(String[] args){
      StackX theStack = new StackX(10);

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
