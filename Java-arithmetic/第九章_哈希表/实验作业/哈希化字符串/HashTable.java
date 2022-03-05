package 第九章_哈希表.实验作业.哈希化字符串;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/2 20:30
 * Description:
 */


class HashTable {
   private DataItem[] hashArray;
   private int arraySize;
   private DataItem nonItem = new DataItem("-1");

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

//   public int hashFunc(int key){
//      return key%arraySize;
//   }

   public int hashFunc(String key){
      int hashVal = 0;
      for(int j = 0 ; j < key.length() ; j ++){
         int letter = key.charAt(j) - 96;
         hashVal = (hashVal * 27 + letter) % arraySize;
      }
      return hashVal;
   }

   public void insert(DataItem item){
      String key = item.getKey();
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null && !"-1".equals(hashArray[hashVal].getKey())){
         ++hashVal;
         hashVal %= arraySize;
      }
      hashArray[hashVal] = item;
   }

   public DataItem delete(String key){
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

   public DataItem find(String key){
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null){
         if(hashArray[hashVal].getKey().equals(key)){
            return hashArray[hashVal];
         }
         ++hashVal;
         hashVal %= arraySize;
      }
      return null;
   }
}
