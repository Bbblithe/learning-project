package 第八章_树.二叉树;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/10/16 10:54
 * Description:
 */


class TreeApp {
   public static void main(String[] args) {
      int value;
      Tree theTree = new Tree();

      theTree.insert(50,1.5);
      theTree.insert(25,1.2);
      theTree.insert(75,1.7);
      theTree.insert(12,1.5);
      theTree.insert(37,1.2);
      theTree.insert(43,1.7);
      theTree.insert(30,1.5);
      theTree.insert(33,1.2);
      theTree.insert(87,1.7);
      theTree.insert(93,1.5);
      theTree.insert(97,1.5);

      while(true){
         System.out.print("Enter first letter of show, insert, find, delete, or traverse: ");
         int choice = 0;
         try {
            choice = getChar();
         } catch (IOException e) {
            e.printStackTrace();
         }
         switch(choice){
            case 's':
               theTree.displayTree();
               break;
            case 'i':
               System.out.print("Enter value to insert: ");
               try{
                  value = getInt();
               } catch(IOException e){
                  e.printStackTrace();
                  value = 2;
               }
               theTree.insert(value,value + 0.9);
               break;
            case 'f':
               System.out.print("Enter value to find: ");
               try{
                  value = getInt();
               } catch(IOException e){
                  e.printStackTrace();
                  value = 3;
               }
               Node found = theTree.find(value);
               if(found != null){
                  System.out.print("Found: ");
                  found.displayNode();
                  System.out.print("\n");
               }else{
                  System.out.print("Could not find ");
                  System.out.println(value);
               }
               break;
            case 'd':
               System.out.print("Enter value to delete: ");
               try{
                  value = getInt();
               } catch(IOException e){
                  e.printStackTrace();
                  value = 4;
               }
               boolean isDeleted = theTree.delete(value);
               if(isDeleted){
                  System.out.print("Deleted" + value + '\n');
               }else {
                  System.out.print("Could not delete ");
                  System.out.println(value);
               }
               break;
            case 't':
               System.out.print("Enter type 1 ,2 or 3: ");
               try{
                  value = getInt();
               } catch(IOException e){
                  e.printStackTrace();
                  value = 5;
               }
               theTree.traverse(value);
               break;
            default:
               System.out.print("Invalid entry\n");
         }
      }
   }

   public static String getString() throws IOException {
      /*
      InputStreamReader reader = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(reader);
      String s = br.readLine();
      return s;

       */
      return new BufferedReader(new InputStreamReader(System.in)).readLine();
   }

   public static char getChar() throws IOException{
      return getString().charAt(0);
   }

   public static int getInt() throws IOException{
      return Integer.parseInt(getString());
   }
}
