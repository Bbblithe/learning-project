package javase.reflect;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 20:52
 * Description:
 * 重点：给你一个类，怎么获取这个类的父类，已经实现了哪些接口？
 */


class ReflectTest13 {
    public static void main(String[] args) throws Exception{
        // String 举例
        Class c = Class.forName("java.lang.String");

        // 获取String的父类
        Class superClass = c.getSuperclass();
        System.out.println(superClass.getName());

        // 获取String类实现的所有接口（一个类可以实现多个接口）
        Class[] interfaces = c.getInterfaces();
        for(Class in : interfaces){
            System.out.println(in.getName());
        }
    }
}
