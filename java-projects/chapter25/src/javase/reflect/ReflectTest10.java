package javase.reflect;

import java.lang.reflect.Method;

import javase.service.UserService;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 15:53
 * Description:
 * 重点：必须掌握，通过反射机制怎么调用一个对象的方法？
 *      五颗星*****，必须掌握
 *
 *      反射机制，让代码很具有通用性，可变化的内容都是写到配置文件当中去，
 *      将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了，
 *      但是java代码不用变。
 */


class ReflectTest10 {
    public static void main(String[] args) throws Exception {
        // 不使用反射机制，怎么调用方法
        // 创建对象
        UserService userService = new UserService();
        // 调用方法
        /*
        要素分析：
            要素1：对象userService
            要素2：login方法名
            要素3：实参列表
            要素4：返回值
         */
        boolean loginSuccess = userService.login("admin","1223");
        System.out.println(loginSuccess ? "登陆成功":"登陆失败");

        // 使用反射机制来调用一个对象的方法该怎么做？
        Class userServiceClass = Class.forName("javase.service.UserService");
        // 创建对象
        Object o = userServiceClass.newInstance();
        // 获取Method
        Method loginMethod = userServiceClass.getMethod("login", String.class, String.class);
        //Method loginMethod = userServiceClass.getMethod("login",int.class);
        // 调用方法
        // 调用方法有几个要素？也需要4要素。
        // 反射机制中最最最最最最最最重要的一个方法，必须记住。
        /*
        四要素：
            loginMethod 方法名
            o 对象
            "admin","123" 实参列表
            retValue 返回值
         */
        Object retValue = loginMethod.invoke(o,"admin","123");
        System.out.println((Boolean)retValue ? "登陆成功":"登陆失败");

    }
}
