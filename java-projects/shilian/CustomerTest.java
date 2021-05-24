package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/14 18:31
 * Description:
 */


class CustomerTest {
    public static void main(String[] args) {
        Customer xwj=new Customer();
        Time t=new Time();

        System.out.println("在这里输入您的账号：");
        java.util.Scanner shuruno= new java.util.Scanner(System.in);
        System.out.println("在这里输入你的时间：");
        java.util.Scanner shurutime=new java.util.Scanner(System.in);
        System.out.println("在这里输入你的年龄：");
        java.util.Scanner shuruage =new java.util.Scanner(System.in);
        System.out.println("这里输入你的名字：");
        java.util.Scanner shuruname =new java.util.Scanner(System.in);
        System.out.println("在这里输入你的地址：");
        java.util.Scanner shuruaddr=new java.util.Scanner(System.in);



        xwj.setNumber(shuruno.nextInt());
        System.out.println("您的学号是"+xwj.getNumber());

        xwj.setName(shuruname.nextLine());
        t.setTime(shurutime.nextInt());
        System.out.println("尊敬的"+xwj.getName()+t.getTime()+"好");

        xwj.setAge(shuruage.nextInt());
        System.out.println("您的年龄是"+xwj.getAge());

        xwj.setAddress(shuruaddr.nextLine());
        System.out.println("您居住在"+xwj.getAddress());
    }
}
