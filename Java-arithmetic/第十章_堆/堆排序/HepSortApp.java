package 第十章_堆.堆排序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/8 19:56
 * Description:
 */


public class HepSortApp {
   public static void main(String[] args) throws IOException {
      int size,j;
      System.out.print("Enter number of items: ");
      size = getInt();
      Heap theHeap = new Heap(size);
      for(j = 0 ; j < size ; j ++){
         int random = (int)(Math.random()*100);
         Node newNode = new Node(random);
         theHeap.insertAt(j,newNode);
         theHeap.incrementSize();
      }

      System.out.print("Random: ");
      theHeap.displayArray();

      for(j = size/2-1; j >= 0 ;j --){
         theHeap.trickleDown(j);
      }

      System.out.print("Heap:  ");
      theHeap.displayArray();
      theHeap.displayHeap();

      for(j = size - 1 ; j >= 0; j --){
         Node biggestNode = theHeap.remove();
         theHeap.insertAt(j,biggestNode);
      }

      System.out.print("Sorted: ");
      theHeap.displayArray();
   }

   public static String getString() throws IOException {
      return new BufferedReader(new InputStreamReader(System.in)).readLine();
   }

   private static char getChar() throws IOException{
      return getString().charAt(0);
   }

   public static int getInt() throws IOException{
      return Integer.valueOf(getString());
   }
}
