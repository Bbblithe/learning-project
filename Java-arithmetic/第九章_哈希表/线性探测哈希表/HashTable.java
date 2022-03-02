package 第九章_哈希表.线性探测哈希表;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/2 20:30
 * Description:
 */


class HashTable {
   private DataItem[] hashArray;
   private int arraySize;
   private DataItem nonItem = new DataItem(-1);

   public HashTable(int size){
      arraySize = size;
      hashArray = new DataItem[size];
   }

   public void displayTable(){
      System.out.print("Table: ");
      for(int j = 0 ;j < arraySize ; j ++){
         if(hashArray[j] != null){
            System.out.print(hashArray[j].getKey() + " ");
         }else{
            System.out.print("** ");
         }
      }
      System.out.println("");
   }

   public int hashFunc(int key){
      return key%arraySize;
   }

   public void insert(DataItem item){
      int key = item.getKey();
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
         ++hashVal;
         hashVal %= arraySize;
      }
      hashArray[hashVal] = item;
   }

   public DataItem delete(int key){
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null){
         if(hashArray[hashVal].getKey() == key) {
            DataItem temp = hashArray[hashVal];
            hashArray[hashVal] = nonItem;
            return temp;
         }
         ++hashVal;
         hashVal %= arraySize;
      }
      return null;
   }

   public DataItem find(int key){
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null){
         if(hashArray[hashVal].getKey() == key){
            return hashArray[hashVal];
         }
         ++hashVal;
         hashVal %= arraySize;
      }
      return null;
   }
}
