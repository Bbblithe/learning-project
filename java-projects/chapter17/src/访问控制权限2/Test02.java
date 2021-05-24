package 访问控制权限2;

import 访问控制权限.User;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/4 21:56
 * Description:
 */


class Test02 {
    public static void main(String[] args) {
        User user=new User();

        //错误：protected在这里不行
        //System.out.println(user.age);

        //错误："默认"在这里也不行
        //System.out.println(user.name);

        //可以：公开的，在哪都行。
        System.out.println(user.weight);
    }
}
