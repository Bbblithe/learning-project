package 第五章.表插入排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/8 22:35
 * Description:
 */


class SortedList {
   private Link first;

   public SortedList(){
      first = null;
   }

   public SortedList(Link [] linkArr){
      first = null;
      for(int j = 0 ; j <linkArr.length ; j++){
         insert( linkArr[j]);
      }
   }

   public void insert(Link k){
      Link previous = null;
      Link current = first;

      while(current != null && k.dData > current.dData){
         previous = current;
         current = current.next;
      }

      if(previous == null){
         first = k;
      }else{
         previous.next = k;
      }
      k.next = current;
   }

   public Link remove(){
      Link temp = first;
      first = first.next;
      return temp;
   }
}
