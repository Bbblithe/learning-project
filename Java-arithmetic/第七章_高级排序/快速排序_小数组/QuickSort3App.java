package 第七章_高级排序.快速排序_小数组;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/29 11:20
 * Description:
 */


class QuickSort3App {
   public static void main(String[] args) {
      int maxSize = 16;
      ArrayIns arr = new ArrayIns(maxSize);

      for(int j = 0 ; j < maxSize ; j ++){
         arr.insert((long) (Math.random()*99));
      }

      arr.display();
      arr.quickSort();
      arr.display();
   }
}
