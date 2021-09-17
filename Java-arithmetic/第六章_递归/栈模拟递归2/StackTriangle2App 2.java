package 第六章_递归.栈模拟递归2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/15 17:52
 * Description:
 */


class StackTriangle2App {
   static int theNumber;
   static int theAnswer;
   static StackX theStack;

   public static void main(String[] args) throws IOException {
      System.out.print("Enter a number: ");
      theNumber = getInt();
      stackTriangle();
      System.out.println("Triangle = " + theAnswer);
   }

   public static void stackTriangle(){
      theStack = new StackX(10000);

      theAnswer = 0;

      while(theNumber > 0){
         theStack.push(theNumber);
         --theNumber;
      }
      while( !theStack.isEmpty()){
         int newN = theStack.pop();
         theAnswer += newN;
      }
   }

   public static String getString() throws IOException{
      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(in);
      String s = br.readLine();
      return s;
   }

   public static int getInt() throws IOException{
      String s = getString();
      return Integer.parseInt(s);
   }
}
