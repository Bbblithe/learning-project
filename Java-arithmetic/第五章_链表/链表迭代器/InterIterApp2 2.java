package 第五章.链表迭代器;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/15 13:10
 * Description:
 */


class InterIterApp2 {
   public static void main(String[] args){
      LinkList theList = new LinkList();
      ListIterator iter1 = theList.getIterator();

      iter1.insertAfter(21);
      iter1.insertAfter(40);
      iter1.insertAfter(30);
      iter1.insertAfter(7);
      iter1.insertAfter(45);

      theList.displayList();

      iter1.reset();
      Link aLink = iter1.getCurrent();
      if(aLink.dData % 3 == 0){
         iter1.deleteCurrent();
      }
      while(!iter1.atEnd()){
         iter1.nextLink();

         aLink = iter1.getCurrent();
         if(aLink.dData % 3 == 0){
            iter1.deleteCurrent();
         }
      }
      theList.displayList();
   }
}
