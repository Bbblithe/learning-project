package 第六章_递归.编程作业.乘法;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/17 18:53
 * Description:
 */


class Multiplication {
   public static void main(String[] args){
      System.out.println(mult(9,4));

   }

   public static int mult(int x,int y){
      if(y == 1){
         return x;
      }
      return x + mult(x , y -1);
   }
}
