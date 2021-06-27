package 第2章编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/22 22:40
 * Description:
 */


class HighArrayApp {
   public static void main(String[] args) {
      HighArray highArray = new HighArray(10);
      highArray.insert(100);
      highArray.insert(200);
      highArray.insert(20);
      highArray.insert(0);
      highArray.insert(-200);
      highArray.insert(200000);
      highArray.insert(235);

      highArray.dispaly();

      System.out.println("==============================");

      HighArray highArrayOrdered = new HighArray(10);

      int size = highArray.getnElems();

      for(int i = 0 ; i < size ; i++){
         highArrayOrdered.insert(highArray.removeMax());
      }

      highArrayOrdered.dispaly();

      System.out.println("==============================");
      highArray.dispaly();
   }
}
