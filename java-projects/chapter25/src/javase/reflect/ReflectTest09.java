package javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 15:31
 * Description:
 * 了解一下，不需要掌握
 */


class ReflectTest09 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        try {
            Class userServiceClass = Class.forName("java.lang.String");
            s.append(Modifier.toString(userServiceClass.getModifiers()) + " class "+userServiceClass.getSimpleName()+" {\n");

            Method[] methods = userServiceClass.getDeclaredMethods();
            for(Method method : methods){
                s.append(Modifier.toString(method.getModifiers()));
                s.append(" "+method.getReturnType().getSimpleName());

                s.append(" "+method.getName());
                Class[] returnTypes = method.getParameterTypes();
                s.append("(");
                // 参数列表
                for(Class parameterType : returnTypes){
                    s.append(parameterType.getSimpleName()+" ");
                    s.append(",");
                }
                // 删除执行位置下标上的字符
                if(returnTypes.length > 0){
                    s.deleteCharAt(s.length()-1);
                }
                s.append("){}\n");
            }

            s.append("}");

            System.out.println(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
