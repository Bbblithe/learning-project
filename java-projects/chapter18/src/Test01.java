/**
 * Author:  blithe.xwj
 * Date:    2020/12/5 11:10
 * Description:
 *
 *  关于Object类中的toString()方法
 *      1、源代码长什么样
 *          public String toString(){
 *              return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *          }
 *          源代码上toString()方法的默认实现是：
 *              类名@对象的内存地址转换为十六进制的形式
 *
 *      2、SUN公式设计toString()方法的目的是什么？
 *          toString()方法的作用是什么？
 *              toString()方法的设计目的是：通过调用这个方法可以将一个"java对象"转换成"字符串表示形式"
 *
 *      3、其实SUN公司开发java语言的时候，建议所有的子类都去重写toString()方法。
 *      toString()方法应该是一个简洁的、详实的、易阅读的.
 */

class Test01 {
    public static void main(String[] args) {
        MyTime t1=new MyTime(1979,1,1);
        //一个日期对象转换成字符串形式的话，我可能还是更希望看到一个具体的日期信息。
        String s1=t1.toString();

        //MyTime类重写toString()方法之前
        //System.out.println(s1); //MyTime@23fc625e

        //MyTime类重写toString()方法之后
        System.out.println(s1);//1979年1月1日

        //注意：输出引用的时候，会自动调用该引用的toString()方法。
        System.out.println(t1);
    }
}
class MyTime{
    int year;
    int month;
    int day;
    public MyTime(){

    }

    public MyTime(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    // 重写toString()方法
    // 这个toString()方法怎么重写呢？
    // 越简洁越好，可读性越强越好。
    public String toString(){
        return this.year+"年"+this.month+"月"+this.day+"日";
    }
}
