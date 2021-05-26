package 第三章.插入排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/29 10:32
 * Description:
 */


class InsertSortApp {
   public static void main(String[] args) {
      int maxSize = 100;
      ArrayIns arr;
      arr = new ArrayIns(maxSize);

      arr.insert(77);
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(77);
      arr.insert(33);
      arr.insert(666);
      arr.insert(66);
      arr.insert(59);
      arr.insert(77);
      arr.insert(66);
      arr.insert(88);
      arr.insert(99);

      arr.display();

      System.out.println(arr.median());

      arr.insertionSort();

      arr.display();
      long a = arr.median();
      System.out.println(a);

      arr.noDups();
      arr.display();
   }
}
