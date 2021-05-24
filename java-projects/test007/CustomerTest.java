package test007;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 15:21
 * Description:
 */


class CustomerTest {
    public static void main(String[] args) {
        //创建Customer对象
        Customer c1=new Customer();
        c1.name="zhangsan";
        //System.out.println("姓名："+c1.name);

        //c1购物
        c1.shooping();

        //再创建Customer对象
        Customer c2=new Customer();
        c2.name="lisi";
        /*
        System.out.println("姓名："+c2.name);
        System.out.println("姓名："+c1.name);//因为这两个new开出来的空间并不一样，即使都是Customer对象，但是内存地址不同，也就是最后输出的结果不同
        */

        //c2购物
        c2.shooping();

        //调用doSOme方法（修饰符上有static）
        //采用"类名."的方式来访问，显然这个方法在执行的过程中不需要对象的参加。
        Customer.doSome();

        //调用doOther
        Customer.doOther();
    }
}
