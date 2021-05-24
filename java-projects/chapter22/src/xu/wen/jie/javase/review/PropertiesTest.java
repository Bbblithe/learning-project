package xu.wen.jie.javase.review;

import java.util.Properties;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 16:38
 * Description:
 */


class PropertiesTest {
    public static void main(String[] args) {
        // 创建对象
        Properties properties = new Properties();

        // 存
        properties.setProperty("username","blithe");
        properties.setProperty("password","qishinijiushi");

        // 取
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(username);
        System.out.println(password);

    }
}
