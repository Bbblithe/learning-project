package 第九章_哈希表.实验作业.自动扩容;

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
   private int num;

   public HashDouble(int size){
      arraySize = size;
      hashArray = new DataItem[size];
   }

   private int getPrime(int min){
      for(int i = min + 1; true ; i ++){
         if(isPrime(i)){
            return i;
         }
      }
   }

   private boolean isPrime(int i) {
      for(int j = 2 ; (j * j <= i); j ++){
         if(i%j == 0){
            return false;
         }
      }
      return true;
   }

   private void rehash(){
      if((double)num / arraySize >= 0.5){
         int[] data = new int[arraySize];
         DataItem[] newArray = new DataItem[getPrime(arraySize * 2)];
         for(int i = 0 ; i < arraySize ; i ++){
            if(hashArray[i] != null) {
               data[i] = hashArray[i].getKey();
            }
         }
         hashArray = newArray;
         for(int i = 0 ; i < arraySize ; i ++){
            if(data[i] != 0) {
               this.insertInto(new DataItem(data[i]));
            }
         }
         arraySize = getPrime(arraySize*2);
      }
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

   private void insertInto(DataItem item){
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

   public void insert(DataItem item){
      rehash();
      count = 0;
      int key = item.getKey();
      int hashVal = hashFunc(key);

      while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
         hashVal += ((count+1) * (count+1)) - count*count;
         hashVal %= arraySize;
         count ++;
      }
      hashArray[hashVal] = item;
      ++num;
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
      --num;
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
