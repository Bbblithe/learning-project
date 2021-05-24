/**
 * Author:  blithe.xwj
 * Date:    2020/12/5 12:05
 * Description:
 *  关于Object类中的equals方法
 *      1、equals的源代码？
 *          public boolean equals(Object obj){
 *              return(this == obj);
 *          }
 *          以上这个方法Object类的默认实现。
 *
 *      2、SUN公司设计equals方法的目的是什么？
 *      以后编程的过程当中，都要通过equals方法来判断两个对象是否相当。
 *      equals方法是判断两个对象是否相等的。
 *
 *      3、我们需要研究一下Object类给的这个默认equals方法够不够用！！！！
 *          在Object类中的equals方法当中，默认采用的是"=="判断两个java对象
 *          是否相等。而"=="判断的是两个java对象的内存地址，我们应该判断
 *          两个java对象的内容是否相等。所以老祖宗的equals方法不够用，
 *          需要子类重写equals。
 *
 *      4、判断两个java对象是否相等，不能使用"=="，因为"=="比较的是两个
 *      对象的内存地址。
 */


class Test02 {
    public static void main(String[] args) {
        //判断两个基本数据类型的数据是否相等直接使用"=="就行。
        int a = 100;
        int b = 100;
        //这个"=="是判断a中保存的100和b中保存的100 是否相等
        System.out.println(a == b);//true（相等） false（不想等）

        //判断两个Java对象是否相等，我们怎么办？能直接使用"=="吗？
        //创建一个日期对象是：2008年8月8日。
        MyTime2 t1 = new MyTime2(2008, 8, 8);

        //这里创建了一个新的日期对象，但是表示的日期也是：2008年8月8日。
        MyTime2 t2 = new MyTime2(2008, 8, 8);

        //测试一下，比较两个对象是否相等，能不能使用"=="？？？
        //这里的"=="判断的是：t1中保存的对象内存地址和t2中保存的对象内存地址是否相等。
        System.out.println(t1 == t2);//false

        //重写Object equals方法之前(比较的是对象内存地址)
        //System.out.println(t1.equals(t2));//false

        //重写Object equals方法之后(比较的是内容。)
        System.out.println(t1.equals(t2));//true

        //再创建一个新的日期
        MyTime2 t3=new MyTime2(123,11,31);
        System.out.println(t1.equals(t3));//false

        //我们这个程序有bug吗？可以运行，但是效率怎么样？低（怎么改造）
        MyTime2 t4=null;
        System.out.println(t1.equals(t4));


    }
}

class MyTime2 {
    int year;
    int month;
    int day;

    public MyTime2() {

    }

    public MyTime2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    /*
    //重写Object类的equals方法
    //怎么重写？复制粘贴。相同的返回值类型、相同的方法名、相同的形式参数列表。
    //equals到底应该怎么重写？你自己定，你认为连个对象什么相等的时候表示相等，你就怎么重写就行了。
    public boolean equals(Object obj) {
        if (obj instanceof MyTime2) {
            MyTime2 obj2 = (MyTime2) obj;
            return (this.year == obj2.year && this.month == obj2.month && this.day == obj2.day);
        }
        else{
            return false;
        }
    }

     */
    //改良equals方法
    /*
    public boolean equals(Object obj) {
        //如果obj是空，直接返回false
        if (obj == null) {
            return false;
        }

        //若果obj不是一个MyTime，没必要比较了，直接返回false
        if (!(obj instanceof MyTime2)) {
            return false;
        }

        //若果this和obj保存的内存地址相同，没必要比较了，直接返回true。
        //内存地址相同的时候指向的堆内存的对象肯定是同一个咯。
        if (this == obj) {
            return true;
        }
        //程序执行到此处说明什么？
        //说明obj不是null，obj是Mytime类型。
        MyTime2 t = (MyTime2) obj;
        if (this.year == t.year && this.month == t.month && this.day == t.day) {
            return true;
        }
        return false;
    }

     */

    //再次改良。
    public boolean equals(Object obj) {
        //如果obj是空，直接返回false
        if (obj == null) {
            return false;
        }

        //若果obj不是一个MyTime，没必要比较了，直接返回false
        if (!(obj instanceof MyTime2)) {
            return false;
        }

        //若果this和obj保存的内存地址相同，没必要比较了，直接返回true。
        //内存地址相同的时候指向的堆内存的对象肯定是同一个咯。
        if (this == obj) {
            return true;
        }
        //程序执行到此处说明什么？
        //说明obj不是null，obj是Mytime类型。
        MyTime2 t = (MyTime2) obj;
        return this.year==t.year&&this.month==t.month&&this.day==t.day;
    }

}

/*
class person{
    private String idCard;

}

 */