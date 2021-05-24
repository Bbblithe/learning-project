package javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javase.bean.Vip;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 20:26
 * Description:
 * 比上一个例子（ReflectTest11）更重要一些！！
 *
 * 通过反射机制调用构造方法实例化java对象。（这个不是重点）
 */


class ReflectTest12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 不使用反射机制怎么创建对象
        Vip v1 = new Vip();
        Vip v2 = new Vip(110,"zhangsan","2003/04/15",true);
        System.out.println(v2);

        // 使用反射机制怎么创建对象呢？
        Class VipClass = Class.forName("javase.bean.Vip");
        // 调用无参数构造方法
        VipClass.newInstance();
        // 调用有参数的构造方法怎么办？
        // 第一步：先获取到这个有参数的构造方法
        Constructor constructor1 = VipClass.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        // 第二步：调用构造方法new对象
        Object obj = constructor1.newInstance(111,"zhangsan","2015022136",true);
        System.out.println(obj);

        // 获取无参数构造方法
        Constructor constructor2 = VipClass.getConstructor();
        System.out.println(constructor2.newInstance());
    }
}
