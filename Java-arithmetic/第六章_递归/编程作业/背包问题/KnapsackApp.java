package 第六章_递归.编程作业.背包问题;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/28 19:41
 * Description:
 */


class KnapsackApp {
   static int []a = {11,8,7,6,5};;

   public static void main(String[] args) {
      knapsack(20,0 , 0);
   }


   public static void knapsack(int weight , int start ,int flag){
      if(start == a.length){
         start -= flag;
         return ;
      }
      if(weight == a[start]){
         System.out.println("有解");
         return ;
      }
      if(weight < a[start]){
         knapsack(weight , start + 1 , flag + 1);
      }
      knapsack(weight - a[start] , start + 1 ,flag);
   }
}
