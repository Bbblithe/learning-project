package xu.wen.jie.blithe.javase.bean;

import java.io.Serializable;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/7 14:19
 * Description:
 */


public class Student implements Serializable {

    // java虚拟机看到Serializable接口之后，会自动生成一个序列化版本号。
    // 这里没有手动写出来，java虚拟机会默认提供这个序列化版本号。
    // 建议将序列化版本号手动的写出来。不建议自动生成
    private static final long serialVersionUID = 8453324523452345L;// java虚拟机识别一个类的时候先通过类名，如果类名一致，再通过序列化版本号。

    private int no;
    //private String name;

    // 过了很久，Student这个类源代码改动了。
    // 源代码改动之后，需要重新编译，编译之后生成了全新的字节码文件。
    // 并且class文件再次运行的时候，java虚拟机生成的序列化版本号也会发生相应的改变。
    private int age;
    private String email;
    private String address;

    public Student (){

    }

    public Student (int no,String name){
        this.no = no;
        //this.name = name;
    }

    public void setNo(int no){
        this.no = no;
    }

    public int getNo(){
        return no;
    }

    /*public void setName(String name){
        this.name = name;
    }*/

    /*public String getName(){
        return name;
    }*/

    /*public String toString(){
        return "学生"+name+"，学号"+no;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
