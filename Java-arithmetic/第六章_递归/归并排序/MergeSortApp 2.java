package 第六章_递归.归并排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/29 16:30
 * Description:
 */


class MergeSortApp {
   public static void main(String[] args) {
      int maxSize = 100;
      DArray arr;
      arr = new DArray(maxSize);

      arr.insert(64);
      arr.insert(21);
      arr.insert(33);
      arr.insert(70);
      arr.insert(12);
      arr.insert(84);
      arr.insert(44);
      arr.insert(3);
      arr.insert(99);
      arr.insert(0);
      arr.insert(108);
      arr.insert(36);

      arr.display();

      arr.mergeSort();

      arr.display();
   }
}
