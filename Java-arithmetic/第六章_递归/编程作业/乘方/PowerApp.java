package 第六章_递归.编程作业.乘方;

/**
 * Author:  blithe.xwj
 * Date:    2021/9/27 22:17
 * Description:
 */


class PowerApp {
    public static void main(String[] args) {
        System.out.print(power(3,18));
    }

    public static int power(int x , int y){
        if(y == 1){
            return x;
        }else if(y % 2 != 0){
            return x * power(x*x ,y / 2);
        }else{
            return power(x*x , y / 2);
        }
    }
}
