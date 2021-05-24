package javase.reflect;

import javase.bean.User;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/14 09:08
 * Description:
 * 获取到Class，能干什么？
 *      通过Class的newInstance()方法来实例化对象
 *      注意：newInstance()方法内部实际上调用无参数构造方法，必须保证午无参数构造存在才可以。
 */


class ReflectTest02 {
    public static void main(String[] args) {

        // 这是不使用反射机制，创建对象
        User user = new User();
        System.out.println(user);

        // 下面这段代码是以反射机制的方式创建对象。
        try {
            // 通过反射机制获取class，通过class来实例化对象。
            Class c = Class.forName("javase.bean.User");// c代表User类型。

            // newInstance() 这个方法会调用User这个类的无参数构造方法，完成对象的创建。
            // 重点是
            Object obj = c.newInstance();

            System.out.println(obj);// javase.bean.User@23fc625e
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
