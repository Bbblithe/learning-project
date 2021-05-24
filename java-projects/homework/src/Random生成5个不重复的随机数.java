import java.util.Random;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/21 09:29
 * Description:
 * 这个是我自己想出来的方法，杜老师讲解的方法在chapter20的random package里。
 */


class Random生成5个不重复的随机数 {
    public static void main(String[] args) {
        Random random =new Random();
        int []arr = new int[5];
        int num2;
        int num3;
        int num4;
        int num5;
        int a = 0;
        int num1 = random.nextInt(41);
        do{
            num2 = random.nextInt(41);
            a++;
        }while(num1 == num2);
        System.out.println("随机了"+a+"次");
        a = 0;
        do{
            num3 = random.nextInt(41);
            a++;
        }while(num3 == num1||num3 == num2);
        System.out.println("随机了"+a+"次");
        a = 0;
        do{
            num4 = random.nextInt(41);
            a++;
        }while(num4 == num1||num4 == num2||num4 == num3);
        System.out.println("随机了"+a+"次");
        a = 0;
        do{
            num5 = random.nextInt(41);
            a++;
        }while(num5 == num1||num5 == num2||num5 == num3||num5 == num4);
        System.out.println("随机了"+a+"次");

        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;
        arr[3] = num4;
        arr[4] = num5;
        for(int i=0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
