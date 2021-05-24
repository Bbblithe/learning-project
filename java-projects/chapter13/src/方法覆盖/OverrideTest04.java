package 方法覆盖;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/23 18:03
 * Description:
 *
 *      关于Object类中的toString()方法
 *          1、toString()方法的作用是什么？
 *              作用：将"java对象"转换成"字符串"的形式。
 *
 *          2、Object类中toString方法的默认实现是什么？
 *
 *          public String toString(){
 *              return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *          }
 *          toString :方法名的意思是转换成String
 *          含义：调用一个java对象的toString 方法就可以将该java对象转换成字符串的表示形式
 *
 *          3、那么toString方法给的默认实现够用吗？
 *
 */


public class OverrideTest04 {
    public static void main(String[] args){
        //创建一个日期对象
        MyDate t1=new MyDate();
        //调用toString()方法（将对象转换成字符串形式。）
        //问：你对这个输出结果满意吗？
        //重写MyDate的toString()方法之前的结果。
        //System.out.println(t1.toString());//方法覆盖.MyDate@23fc625e

        //重写MyDate的toString()方法之后的结果。
        System.out.println(t1.toString());

        //大家是否记得：当输出一个引用的时候，println方法会自动调用引用的toString方法
        System.out.println(t1);

        MyDate t2=new MyDate(2008,8,8);
        System.out.println(t2);//2008年8月8日。

        //创建学生对象
        Student s =new Student(2015022136,"blithe");
        //重写toString 方法之前
        //System.out.println(s);//方法覆盖.Student@3f99bd52
        //重写toString 方法之后
        //输出一个学生对象的时候，可能更愿意看到学生的信息，不愿意看到对象的内存地址。
        System.out.println(s.toString());
        //其实不输入toString 方法调用的也是s自带的toString 方法。
        System.out.println(s);

    }
}

//日期类
class MyDate{
    private int year;
    private int month;
    private int day;
    public MyDate(){
        this(1971,1,1);
    }

    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
        return day;
    }
    //从Object类中继承过来的那个方法已经无法满足我业务需求了。
    //我在子类MyDate中有必要对父类的toString方法进行覆盖/重写。
    //我的业务要求是：调用toString()方法进行字符串转换的时候
    //希望转换的结果是xxx年xx月xx日，这种格式的结果。
    //重写一定要复制粘贴，不要手动编写，会错的。

    //这里就是一个方法覆盖。
    public String toString(){
        return year+ "年" + month + "月" + day + "日" ;
    }
}

class Student{
    int no;
    String name;
    public Student(int no,String name){
        this.no=no;
        this.name=name;
    }

    //重写 方法覆盖。
    public String toString(){
        return "学号:"+no+",姓名:"+name;
    }
}