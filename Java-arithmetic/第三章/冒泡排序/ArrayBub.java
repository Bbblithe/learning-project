package 第三章.冒泡排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/5 12:54
 * Description:
 */


public class ArrayBub {
   private long[] a;
   private int nElems;

   public ArrayBub(int max){
      a = new long[max];
      nElems = 0 ;
   }

   public void insert(long value){
      a[nElems] = value;
      nElems ++;
   }

   public void display(){
      for(int i = 0 ; i < nElems ; i++){
         System.out.print(a[i] + " ");
      }
      System.out.println("");
   }

   public void bubbleSort(){
      int leftOut,rightOut,in;

      // 双向移动
      for(leftOut = 0,rightOut = nElems - 1 ; rightOut > 1 && leftOut < rightOut; leftOut ++ ,rightOut --){
         for(in = leftOut ; in < rightOut ; in ++) {
            if (a[in] > a[in + 1]) {
               swap(in, in + 1);
            }
         }
         for(in = rightOut - 1 ; in > leftOut ; in -- ){
            if(a[in] < a[in - 1]) {
               swap(in , in - 1);
            }
         }
      }
      // 单项移动
//      int out,in;
//
//      for(out = nElems - 1 ; out > 1 ; out --){
//         for(in = 0 ; in < out ; in ++) {
//            if (a[in] > a[in + 1]) {
//               swap(in, in + 1);
//            }
//         }
//      }
   }

   public void oddEvenSort(){
      int odd,even;
      // 仍然使用布尔标记法。
      boolean oddSort = false,evenSort = false;
      while(!oddSort || !evenSort) {// 循环结束条件是，奇数排列不发生交换，且偶数列也不发生交换了。
         oddSort = true;
         evenSort = true;
         for (even = 0; even < nElems-1; even += 2) {
            if (a[even] > a[even + 1]) {
               swap(even, even + 1);
               evenSort = false; // 如果发生交换则让evenSort变为false
            }
         }
         for (odd = 1; odd < nElems-1; odd += 2) {
            if (a[odd] > a[odd + 1]) {
               swap(odd, odd + 1);
               oddSort = false; // 如果发生交换则让oddSort变为false
            }
         }
      }
   }

   private void swap(int one, int two) {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
}
