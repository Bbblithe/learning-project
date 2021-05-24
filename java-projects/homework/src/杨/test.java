package 杨;

import java.util.Scanner;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/1 11:32
 * Description:
 */


class test {
    public static void main(String[] args) {
        for(int i = 0 ; i < 20 ; i ++){
            System.out.println(F(i));
        }
        boolean result2 = Multiple(20,100);
        System.out.println(result2);
        minimun3();
        overload();
        overload(2);
    }

    /**
     * @param i 这里的i是第几项，从0开始往后数，第一项是0，第二项是1
     * @return
     */
    private static int F(int i) {
        if(i == 0){
            return 0;
        }
        if(i == 1){
            return 1;
        }
        int a,b,c;
        a = 0;
        b = 1;
        c = a + b;
        a = c + b;
        b = c;
        c = F(i - 1 ) + F(i - 2);
        return c;
    }

    // 实验2
    public static boolean Multiple(int a,int b){
        return b % a == 0;
    }

    public static void minimun3(){
        Scanner out = new Scanner(System.in);
        System.out.print("输入第一个浮点型数字");
        double first = out.nextDouble();
        System.out.print("输入第二个浮点型数字");
        double second = out.nextDouble();
        System.out.print("输入第三个浮点型数字");
        double third = out.nextDouble();
        if(first > second && second < third){
            System.out.println(second);
        }else if(first < second && first < third){
            System.out.println(first);
        }else if(third < second && third < first){
            System.out.println(third);
        }else{
            System.out.println("不存在最小值！(几个值中含有相等的值)");
        }
    }
    public static void overload(int a){
        System.out.println("我是方法重载1，调用我需要一个int类型参数");
    }
    public static void overload(){
        System.out.println("我是方法重载2，调用我什么也不需要");
    }
}
