package xu.wen.jie.blithe.javase.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import xu.wen.jie.blithe.javase.bean.User;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/7 14:46
 * Description:
 * 能不能一次序列化多个对象呢？
 *      可以，可以将对象放到集合当中，序列化集合。
 * 提示：
 *      参与序列化的ArrayList集合以及集合中的元素User都需要实现 java.io.Serializable接口。
 *
 */


class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(2,"lisi"));
        userList.add(new User(3,"wangwu"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));

        // 序列化一个集合，这个集合对象中放了很多其他对象。
        oos.writeObject(userList);

        oos.flush();

        oos.close();
    }
}