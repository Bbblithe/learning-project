package 第八章_树.树234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/23 14:01
 * Description:
 */


class Tree234App {
    public static void main(String[] args) {
        long value = -1;
        Tree234 theTree = new Tree234();

        theTree.insert(50);
        theTree.insert(40);
        theTree.insert(60);
        theTree.insert(30);
        theTree.insert(70);

        while(true){
            System.out.print("Enter first letter of ");
            System.out.print("show, insert , fond , or quit: ");
            char choice = ' ';
            try {
                choice = getChar();
            } catch (IOException e){
                e.printStackTrace();
            }
            switch (choice){
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to find: ");
                    try {
                        value = getInt();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    theTree.insert(value);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    try {
                        value = getInt();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    int found = theTree.find(value);
                    System.out.println(found == -1 ? "Could not find " + value : "Found " + value);
                    break;
                case 'q':
                    System.out.println("Welcome next using .... bye ~");
                    return ;
                default:
                    System.out.print("Invalid entry\n");
            }
        }
    }

    public static  String getString() throws IOException {
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static char getChar() throws IOException{
        return getString().charAt(0);
    }

    public static int getInt() throws IOException{
        return Integer.parseInt(getString());
    }
}
