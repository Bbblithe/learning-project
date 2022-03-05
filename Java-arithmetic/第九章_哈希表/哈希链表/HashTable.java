package 第九章_哈希表.哈希链表;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/3 11:26
 * Description:
 */


public class HashTable {
    private SortedList[] hashArray;
    private int arraySize;

    public HashTable(int size){
        arraySize = size;
        hashArray = new SortedList[arraySize];
        for(int i = 0 ; i < arraySize ; i++){
            hashArray[i] = new SortedList();
        }
    }


    public void displayTable(){
        for(int i = 0 ; i < arraySize ; i ++){
            System.out.print(i + ". ");
            hashArray[i].displayLink();
        }
    }

    public int hashFunc(int key){
        return key % arraySize;
    }

    public void insert(Link theLink){
        int key = theLink.getKey();
        int hasVal = hashFunc(key);
        hashArray[hasVal].insert(theLink);
    }

    public void delete(int key){
        int hasVal = hashFunc(key);
        hashArray[hasVal].delete(key);
    }

    public Link find(int key){
        int hashVal = hashFunc(key);
        return hashArray[hashVal].find(key);
    }
}
