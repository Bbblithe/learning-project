package shilian;

import java.util.Scanner;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/3 23:16
 * Description:
 */

//该程序是用于计算1+(1+2)+(1+2+3)+()
public class leijia {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int pre=0;
        for(int i=1;i<=n;i++){
            int result=0;
            for(int j=1;j<=i;j++){
                result+=j;
            }
            sum=pre+result;
            pre=sum;
        }
        System.out.println(sum);
    }
}
