package 第四章.后缀表达式.中转后缀表达式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/22 09:40
 * Description:
 */


class InfixApp {
   public static void main(String[] args) throws IOException{
      String input,output;
      while(true){
         System.out.print("Enter infix : ");
         System.out.flush();
         input = getString();
         if("".equals(input)){
            break;
         }
         InToPost theTrans = new InToPost(input);
         output = theTrans.doTrans();
         System.out.println("Postfix is " + output + "\n");
      }
   }

   private static String getString() throws IOException {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
   }
}
