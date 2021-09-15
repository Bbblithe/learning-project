package 第三章_简单排序.选择排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/6 22:31
 * Description:
 */


class ArraySel {
   private long[] a;
   private int nElems;

   public ArraySel(int max){
      a = new long[max];
      nElems = 0;
   }

   public void insert(long value){
      a[nElems] = value;
      nElems++;
   }

   public void display(){
      for(int j = 0; j < nElems ; j ++){
         System.out.println(a[j] + " ");
      }
   }

   public void selectionSort(){
      int out,min,in;
      for(out = 0 ; out < nElems - 1; out ++){
         min = out ;
         for(in = out + 1; in < nElems ; in++){
            if(a[in] < a[min]){
               min = in;
            }
            swap(out,min);
         }
      }
   }

   private void swap(int one, int two) {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
}
