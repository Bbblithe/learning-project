package 第七章_高级排序.划分;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/23 09:37
 * Description:
 */


class PartitionApp {
   public static void main(String[] args) {
      int maxSize = 15;
      ArrayPar arr;
      arr = new ArrayPar(maxSize);

      for(int j = 0 ; j < maxSize ; j++){
         long n = (int)(Math.random()*199);
         arr.insert(n);
      }

      arr.display();

      long pivot = 99;
      System.out.print("Pivot is " + pivot);

      int partDex = arr.partitionIt(0,maxSize-1,pivot);

      System.out.println(", Partition is at index " + partDex);
      arr.display();
   }
}
