package 第七章_高级排序.希尔排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/17 18:39
 * Description:
 */


class ArraySh {
   private long[] theArray;
   private int nElems;

   public ArraySh(int max){
      theArray = new long[max];
      nElems = 0;
   }

   public void insert(long value){
      theArray[nElems++] = value;
   }

   public void display(){
      System.out.print("A = ");
      for(int j = 0 ; j < nElems ; j ++){
         System.out.print(theArray[j] + " ") ;
      }
      System.out.println("");
   }

   public void shellSort(){
      int inner, outer;
      long temp;

      int h = 1;
      while(h <= nElems/3){
         h = h*3 + 1;
      }

      while(h > 0){
         for(outer = h ; outer < nElems ; outer ++){
            temp = theArray[outer];
            inner = outer;
            while(inner > h-1 && theArray[inner - h] >= temp){
               theArray[inner] = theArray[inner - h];
               inner -= h;
            }
            theArray[inner] = temp;
         }
         h = (h-1)/3;
      }
   }
}
