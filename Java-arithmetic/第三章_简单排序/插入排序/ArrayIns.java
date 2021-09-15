package 第三章_简单排序.插入排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/29 10:24
 * Description:
 */


public class ArrayIns {
   private long[] a;
   private int nElems;

   public ArrayIns(int max){
      a = new long[max];
      nElems = 0;
   }

   public void insert(long value){
      a[nElems] = value;
      nElems++;
   }

   public void display(){
      for(int j = 0 ; j < nElems ; j++){
         System.out.print(a[j] + " ");
      }
      System.out.println("");
   }

   public void insertionSort(){
      int in,out;

      for(out = 1 ; out < nElems ; out ++){
         long temp = a[out];// 复制
         in = out;
         while(in > 0 && a[in - 1] >= temp){
            a[in] = a[in - 1];
            in--;
         }
         a[in] = temp;
      }
   }

   public long median(){
      long mid = 0;
      int flag1,flag2;
      // 这里仅仅只需要一个变量，因为只用判断是否其大于其一半的数字。
      for(int i = 0 ; i < nElems ; i ++){
         flag1 = 0;
//         flag2 = 0;
         for(int j = 0 ; j < nElems ; j ++){
            if(a[i] > a[j]){
               flag1 ++;
            }
//            else{
//               flag2 ++;
//            }
         }
//         if(nElems %2 != 0){
//            if(flag1 == nElems/2 || flag2 == nElems/2){
//               mid = a[i];
//               return mid;
//            }
//         }else{
//            if(flag1 == (nElems/2)+1 || flag2 == (nElems/2)-1){
//               mid = a[i];
//               return mid;
//            }
//         }
         if(flag1 == nElems/2){
            mid = a[i];
            return mid;
         }
      }
      return mid;
   }

   public void noDups(){
      insertionSort();
      int slow=1,fast;
      for(fast = 1;fast < nElems ; fast++){
         if(a[fast] !=  a[slow - 1]){
            a[slow++] = a[fast];
         }
      }
      for(int i = slow ; i < nElems - 1; i ++){
         a[i] = 0;
      }
      nElems = slow ;
   }
}
