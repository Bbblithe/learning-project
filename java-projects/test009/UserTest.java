package test009;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 19:52
 * Description:
 */


class UserTest {
    public static void main(String[] args) {
        User u1=new User(2015022136,"徐文杰");
        System.out.println(u1.getId());
        System.out.println(u1.getName());

        //想修改名字
        u1.setName("李四");
        System.out.println(u1.getName());


    }
}
