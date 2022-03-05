package 第九章_哈希表.实验作业.哈希化字符串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/2 20:40
 * Description:
 */


class HashTableApp {
    public static void main(String[] args) throws IOException{
        DataItem aDataItem;
        int aKey, size,n ,keysPerCell;
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;

        HashTable theHashTable = new HashTable(size);


        while(true){
            System.out.print("Enter first letter of show, insert, delete or find: ");
            char choice = getChar();
            switch (choice){
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    theHashTable.insert(new DataItem(getString()));
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    theHashTable.delete(getString());
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    String result = "";
                    aDataItem = theHashTable.find(getString());
                    if(aDataItem != null){
                        System.out.println("Found " + result);
                    }else{
                        System.out.println("Could not find " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    private static char getChar() throws IOException{
        return getString().charAt(0);
    }


    public static String getString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static int getInt() throws IOException{
        return Integer.valueOf(getString());
    }
}
