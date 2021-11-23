package 第八章_树.编程作业;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/10/20 22:21
 * Description:
 */


class TreeApp {
   public static void main(String[] args) {
      Tree tree = null;
      try {
         tree = Tree.create(getString());
      } catch (IOException e){
         e.printStackTrace();
      }
      tree.displayTree();
   }

   public static String getString() throws IOException {
      return new BufferedReader(new InputStreamReader(System.in)).readLine();
   }
}
