package test004;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/14 15:49
 * Description:
 */


public class UserTest {
    public static void main(String[] args){
        //创建User对象
        User user=new User();

        //编译报错，age属性私有化，在外部程序中不能直接访问
        //从此之后age属性非常的安全，但是有的太安全了。
        //对于目前的程序来说，age属性彻底在外部访问不到了。
        //System.out.println(user.age);

        //修改
        user.setAge(-100);

        //读取
        System.out.println(user.getAge());
    }
}
