package xu.wen.jie.blithe.javase.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 19:44
 * Description:
 * DataInputStream:数据字节输入流
 * DataOutputStream写的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道写入的顺序。
 * 读的顺序需要和写的顺序一直。才可以正常读取数据。
 *
 * 中国电信开发项目：
 *      话务员，每天打电话。。。
 */


class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(new FileInputStream("data"));
        // 开始读
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean sex = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i+1000);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);
        dis.close();
    }
}
