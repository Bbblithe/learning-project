package 第四章_栈和队列.栈;

import java.io.IOException;

import static 第四章_栈和队列.栈.StackYApp.getString;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/10 22:18
 * Description:
 */


class BracketsApp {
   public static void main(String[] args) throws IOException {
      String input;
      while(true){
         System.out.print("Enter string containing delimiters: ");
         System.out.flush();
         input = getString();
         if( input.equals("")){
            break;
         }
         BracketChecker theChecker = new BracketChecker(input);
         theChecker.check();
      }
   }
}
