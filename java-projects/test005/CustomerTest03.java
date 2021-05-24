package test005;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 10:27
 * Description:
 */


class CustomerTest03 {
    public static void main(String[] args) {
        Customer c1 =new Customer();
        System.out.println("账号："+c1.getNo());
        System.out.println("生日："+c1.getBirth());
        System.out.println("姓名："+c1.getName());

        Customer c2=new Customer(2015022136,"徐文杰","4月15日");
        System.out.println("账号："+c2.getNo());
        System.out.println("姓名："+c2.getName());
        System.out.println("生日："+c2.getBirth());
    }
}
