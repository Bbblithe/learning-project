package 第六章_递归.归并排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/28 20:33
 * Description:
 */


class MergeApp {
   public static void main(String[] args){
      int[] arrayA = {23,47,81,95};
      int[] arrayB = {7,14,39,55,62,74};
      int[] arrayC = new int[10];

      merge(arrayA, 4 , arrayB , 6 ,arrayC);
      display(arrayC,10);
   }

   public static void merge(int[] arrA,int sizeA , int[] arrB,int sizeB , int[] arrC){
      int aDex = 0 ,bDex = 0, cDex = 0;

      while(aDex < sizeA && bDex < sizeB){
         if(arrA[aDex] < arrB[bDex]){
            arrC[cDex++] = arrA[aDex++];
         }else{
            arrC[cDex++] = arrB[bDex++];
         }
      }
      while(aDex < sizeA){
         arrC[cDex++] = arrA[aDex++];
      }
      while(bDex < sizeB){
         arrC[cDex++] = arrB[bDex++];
      }
   }

   public static void display(int[] theArray , int size){
      for(int i = 0 ; i < size ; i ++){
         System.out.print(theArray[i] + " ");
      }
      System.out.println("");
   }
}
