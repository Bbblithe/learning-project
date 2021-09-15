package 第五章_链表.表插入排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/8 22:39
 * Description:
 */


class ListInsertionSortApp {
   public static void main(String[] args){
      int size = 10;

      Link[] linkArray = new Link[size];

      for(int j = 0 ; j <size; j ++){
         int n = (int)(java.lang.Math.random()*99);
         Link newLink = new Link(n);
         linkArray[j] = newLink;
      }

      System.out.print("Unsorted array: ");
      for(int j = 0 ; j < size ; j++){
         System.out.print(linkArray[j].dData + " ");
      }
      System.out.println("");

      SortedList theSortedList = new SortedList(linkArray);

      for(int j = 0 ; j < size ; j ++){
         linkArray[j] = theSortedList.remove();
      }
      System.out.print("Sorted Array: ");
      for(int j = 0 ; j < size ; j ++){
         System.out.print(linkArray[j].dData + " ");
      }
      System.out.println("");
   }
}
