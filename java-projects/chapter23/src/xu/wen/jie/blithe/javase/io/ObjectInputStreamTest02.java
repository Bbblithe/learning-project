package xu.wen.jie.blithe.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.List;

import xu.wen.jie.blithe.javase.bean.User;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/7 14:55
 * Description:
 * 反序列化集合
 */


class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));
        //Object obj = ois.readObject();
        //System.out.println(obj instanceof List);
        List<User> list = (List<User>)ois.readObject();
        for(User user : list){
            System.out.println(user);
        }

        // 这里用这个方法只是为了复习一下集合的迭代器
        Iterator<User> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ois.close();
    }
}
