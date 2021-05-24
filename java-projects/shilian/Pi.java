package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/4 16:11
 * Description:
 */


class Pi {
    public static void main(String[] args){
        int sum=0;
        int i;
        int n1=10;
        int s=0;
        for(i=1;i<=n1;i+=2){
            int flag=1;
            sum+=s;
            s=1/i;
        }
        System.out.println(sum);
    }
}
