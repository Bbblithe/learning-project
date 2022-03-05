package 第九章_哈希表.实验作业.二次探次哈希表;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/2 20:30
 * Description:
 */


class HashDouble {
   private DataItem[] hashArray;
   private int arraySize;
   private DataItem nonItem = new DataItem(-1);
   private int count;

   public HashDouble(int size){
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
      count = 0;
      int key = item.getKey();
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
         hashVal += ((count+1) * (count+1)) - count*count;
         hashVal %= arraySize;
         count ++;
      }
      hashArray[hashVal] = item;
   }

   public DataItem delete(int key){
      count = 0;
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null){
         if(hashArray[hashVal].getKey() == key) {
            DataItem temp = hashArray[hashVal];
            hashArray[hashVal] = nonItem;
            return temp;
         }
         hashVal += ((count+1) * (count+1)) - count*count;
         hashVal %= arraySize;
         count ++;
      }
      return null;
   }

   public DataItem find(int key){
      count = 0;
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null){
         if(hashArray[hashVal].getKey() == key){
            return hashArray[hashVal];
         }
         hashVal += ((count+1) * (count+1)) - count*count;
         hashVal %= arraySize;
         count ++;
      }
      return null;
   }
}
