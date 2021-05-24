package test004;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/14 18:06
 * Description:
 */


public class CustomerTest {
    public static void main(String[] args) {
        Customer c=new Customer();

        //私有的属性不能在外部直接访问
        //c.id =20320;

        //操作入口变成了只能通过set和get方法进行访问
        //在set方法和get方法过程中进行安全过滤
        c.setId(2015022136);
        c.setName("xwj");
        c.setAge(17);
        c.setAddr("翠屏区");

        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getAddr());

    }
}
