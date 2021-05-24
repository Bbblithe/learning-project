package xu.wen.jie.javase.collection;

import java.util.Properties;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/2 11:15
 * Description:
 * 目前只需要掌握Properties属性类对象的相关方法即可。
 * Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型。
 * Properties被称为属性类对象.
 * Properties是线程安全的。
 */


class PropertiesTest01 {
    public static void main(String[] args) {
        // 创建一个Properties对象
        Properties pro = new Properties();

        // 需要掌握Properties的两个方法，一个存，一个取。
        pro.setProperty("url","asdfas:fasdf://localhost:3360://bjpowernode");
        pro.setProperty("username","root");
        pro.setProperty("password","123");
        pro.setProperty("driver","com.mysql.jdbc.Driver");

        // 通过key获取value
        String s1  = pro.getProperty("url");
        String s2  = pro.getProperty("username");
        String s3  = pro.getProperty("password");
        String s4  = pro.getProperty("driver");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
