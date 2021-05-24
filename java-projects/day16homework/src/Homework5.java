/**
 * Author:  blithe.xwj
 * Date:    2020/11/22 11:03
 * Description:
 *  编写java程序用于显示人的姓名和年龄。
 *  定义一个人类Person该类中应该有两个私有属性姓名和年龄age。
 *  定义构造方法用来初始化数据成员。再定义显示dispaly方法将姓名和年龄打印出来。
 *  在main方法中创建人类的实例然后将信息显示出来
 */


public class Homework5 {
    public static void main(String[] args) {
        Person chushihua=new Person();
        chushihua.display();
        chushihua.setAge(100);
        chushihua.setName("blithe");
        chushihua.display();

        Person p2=new Person("blithe",17);
        p2.display();
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>150){
            System.out.println("不好意思，您输入年龄不合法");
        }
        else{
            this.age = age;
        }
    }

    public void display(){
        System.out.println(getAge()+","+getName());
    }
}
