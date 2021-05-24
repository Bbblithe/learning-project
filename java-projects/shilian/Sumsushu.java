package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/20 07:25
 * Description:
 * 需求：求1-100中所有素数的和
 *
 */


public class Sumsushu {
    public static void main(String[] args){
        int sum=0;
        System.out.print("在这里输入你想求1~到你输入的数字之中所有的素数之和：");
        java.util.Scanner shuru=new java.util.Scanner(System.in);
        int x=shuru.nextInt();
        for(int i=2;i<=x;i++){
            boolean suShu=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    suShu=false;
                    break;
                }
            }
            if(suShu){
                sum+=i;
            }
        }
        System.out.println("1到"+x+"之间所有质数之和等于"+sum);
    }
}
