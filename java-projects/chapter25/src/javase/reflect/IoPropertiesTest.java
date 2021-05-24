package javase.reflect;

import java.io.InputStream;
import java.util.Properties;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/14 10:24
 * Description:
 */


class IoPropertiesTest {
    public static void main(String[] args) throws Exception{

        // 获取一个文件的绝对路径了！！！
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        FileReader reader = new FileReader(path);*/

        // 直接以流的形式返回。
        InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo2.properties");

        Properties pro = new Properties();
        pro.load(in);
        in.close();
        // 通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);

        Class c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);
    }
}
