package 第五章_链表.链表迭代器;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/13 10:47
 * Description:
 */


class InterIterApp {
   public static void main(String[] args) throws IOException{
      LinkList theList = new LinkList();
      ListIterator iter1 = theList.getIterator();
      long value;

      iter1.insertAfter(20);
      iter1.insertAfter(40);
      iter1.insertAfter(80);
      iter1.insertAfter(60);

      while(true){
         System.out.print("Enter first letter of show,reset, ");
         System.out.print("next, get, before, after, delete: ");
         System.out.flush();
         int choice = getChar();
         switch(choice){
            case 's':
               if(!theList.isEmpty()){
                  theList.displayList();
               }
               else{
                  System.out.println("List is empty");
               }
               break;
            case 'r':
               iter1.reset();
               break;
            case 'n':
               if( !theList.isEmpty() && iter1.atEnd()){
                  iter1.nextLink();
               }else{
                  System.out.println("Can't go to next link");
               }
               break;
            case 'g':
               if( !theList.isEmpty()){
                  value = iter1.getCurrent().dData;
                  System.out.println("Returned " + value);
               }
               else{
                  System.out.println("List is empty");
               }
               break;
            case 'b':
               System.out.print("Enter value to insert: ");
               System.out.flush();
               value = getInt();
               iter1.insertBefore(value);
               break;
            case 'a':
               System.out.print("Enter value to insert: ");
               System.out.flush();
               value = getInt();
               iter1.insertAfter(value);
               break;
            case 'd':
               if( !theList.isEmpty()){
                  value = iter1.deleteCurrent();
                  System.out.println("Deleted " + value);
               }else{
                  System.out.println("Can't delete");
               }
               break;
            default:
               System.out.println("Invalid entry");
         }
      }
   }

   public static String getString() throws IOException{
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
   }

   public static char getChar() throws IOException{
      String s = getString();
      return s.charAt(0);
   }

   public static int getInt() throws IOException{
      String s = getString();
      return Integer.valueOf(s);
   }
}
