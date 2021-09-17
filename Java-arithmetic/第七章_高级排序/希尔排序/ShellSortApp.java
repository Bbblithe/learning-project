package 第七章_高级排序.希尔排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/17 18:47
 * Description:
 */


class ShellSortApp {
   public static void main(String[] args){
      int maxSize = 10;
      ArraySh ar = new ArraySh(maxSize);

      for(int j = 0 ; j < maxSize ; j ++){
         long n = (int)(Math.random()*99);
         ar.insert(n);
      }

      ar.display();
      ar.shellSort();
      ar.display();
   }
}
