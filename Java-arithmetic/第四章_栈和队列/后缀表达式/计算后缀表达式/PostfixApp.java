package 第四章_栈和队列.后缀表达式.计算后缀表达式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/22 22:50
 * Description:
 */


class PostfixApp {
   public static void main(String[] args) throws IOException {
      String input;
      int output;

      while(true){
         System.out.print("Enter postfix: ");
         System.out.flush();
         input = getString();
         if("".equals(input)){
            break;
         }
         ParsePost aParser = new ParsePost(input);
         output = aParser.doParse();
         System.out.println("Evaluates to " + output);
      }
   }

   public static String getString() throws IOException{
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
   }
}
