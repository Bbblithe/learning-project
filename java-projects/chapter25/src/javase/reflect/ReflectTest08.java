package javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 15:06
 * Description:
 * 作为了解内容（不需要掌握）：
 *      反射Method
 */


class ReflectTest08 {
    public static void main(String[] args) {
        try {
            // 获取类了
            Class userServiceClass = Class.forName("javase.service.UserService");
            // 获取所有的Method（包括私有的）
            Method[] methods = userServiceClass.getDeclaredMethods();
            //System.out.println(methods.length);//2

            // 遍历Method
            for(Method method : methods){
                // 获取修饰符列表
                System.out.println(Modifier.toString(method.getModifiers()));
                // 获取方法的返回值类型
                System.out.println(method.getReturnType().getSimpleName());
                // 获取方法名字
                System.out.println(method.getName());
                // 获取方法的修饰符列表（一个方法的参数可能会有多个。）
                Class[] parameterTypes = method.getParameterTypes();
                for(Class parameterType : parameterTypes){
                    System.out.println(parameterType.getSimpleName());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
