package xu.wen.jie.blithe.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/7 14:40
 * Description:
 * 反序列化
 */


class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        // 开始反序列化,读
        Object obj = ois.readObject();

        // 反序列化回来是一个学生对象，所以会调用学生对象的toString()方法
        System.out.println(obj);

        ois.close();
    }
}
