package javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 19:53
 * Description:
 * 反编译一个类的Constructor构造方法。
 */


class ReflectTest11 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        try {
            Class vipClass = Class.forName("java.lang.String");
            s.append(Modifier.toString(vipClass.getModifiers()) + " class " +vipClass.getSimpleName() + " {\n");

            // 拼接构造方法
            Constructor[] constructors = vipClass.getConstructors();
            for(Constructor constructor : constructors){
                s.append("\t");
                s.append(Modifier.toString(constructor.getModifiers())+ " " +vipClass.getSimpleName() + " (");
                // 拼接参数
                Class[] parameterTypes =constructor.getParameterTypes();
                for(Class parameter : parameterTypes){
                    s.append(parameter.getSimpleName() + ",");
                }
                if(parameterTypes.length > 0){
                    s.deleteCharAt(s.length() - 1);
                }
                s.append(") {}\n");
            }

            s.append("\n}");
            System.out.println(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
