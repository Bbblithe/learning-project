package 第四章_栈和队列.栈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/7 22:32
 * Description:
 */


class StackYApp {
   public static void main(String[] args)throws IOException{
      String input,output;
      while(true){
         System.out.println("Enter a word:");
         System.out.flush();
         input = getString();
         if(input.equals("")){// if enter a "enter" quit
            break;
         }
         Reverser theReverser = new Reverser(input);
         output = theReverser.doRev();
         System.out.println("After reverser:");
         System.out.println(output);
      }
   }

   public static String getString() throws IOException{
      return new BufferedReader(new InputStreamReader(System.in)).readLine();
   }
}
