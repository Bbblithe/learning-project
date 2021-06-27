package 第六章_递归.二分查找;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/27 10:45
 * Description:
 */


class BinarySearchApp {
   public static void main(String[] args) {
      int maxSize = 100;
      ordArray arr = new ordArray(maxSize);

      arr.insert(72);
      arr.insert(90);
      arr.insert(45);
      arr.insert(126);
      arr.insert(54);
      arr.insert(99);
      arr.insert(144);
      arr.insert(27);
      arr.insert(135);
      arr.insert(81);
      arr.insert(108);
      arr.insert(9);
      arr.insert(117);
      arr.insert(63);
      arr.insert(36);
      arr.display();

      int searchKey = 27;
      if(arr.find(searchKey) != arr.size()){
         System.out.println("Found " + searchKey);
      }else{
         System.out.println("Can't find " + searchKey);
      }
   }
}
