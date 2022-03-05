package 第九章_哈希表.哈希链表;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/3 11:32
 * Description:
 */


class HashTableApp {
    public static void main(String[] args) throws IOException{
        int aKey;
        Link aDataItem;
        int size,n,keysPerCell = 100;
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;

        HashTable theHashTable = new HashTable(size);

        for(int i = 0 ; i < n ; i ++){
            aKey = (int)(Math.random()*keysPerCell * size);
            aDataItem = new Link(aKey);
            theHashTable.insert(aDataItem);
        }

        while(true){
            System.out.print("Enter first letter of show, insert, delete or find: ");
            char choice = getChar();
            switch (choice){
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    theHashTable.insert(new Link(aKey));
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    theHashTable.delete(getInt());
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if(aDataItem != null){
                        System.out.println("Found " + aKey);
                    }else{
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }

    }

    public static String getString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    private static char getChar() throws IOException{
        return getString().charAt(0);
    }

    public static int getInt() throws IOException{
        return Integer.valueOf(getString());
    }
}
