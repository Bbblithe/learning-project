package 访问控制权限;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/4 21:41
 * Description:
 */


public class Test01 {
    public static void main(String[] args) {
        User user=new User();

        //private修饰的变量只能在本类访问，所以这里无法访问user.id
        //System.out.println(user.id);


        System.out.println(user.age);
        System.out.println(user.name);
        System.out.println(user.weight);
    }
}
