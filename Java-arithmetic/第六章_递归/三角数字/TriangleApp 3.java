package 第六章_递归.三角数字;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/22 20:52
 * Description:
 */


class TriangleApp {
    static int theNumber;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        int answer = triangle(theNumber);
        System.out.println("Triangle = " + answer);
    }

    public static int triangle(int n){
        System.out.println("Entering: n = " + n);
        if(n == 1){
            return 1;
        }else{
            int temp = triangle(n - 1);
            System.out.println("Returning " + temp);
            return n + temp;
        }
    }

    public static String getString() throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        return reader.readLine();
    }

    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}
