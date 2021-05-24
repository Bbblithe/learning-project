package test013;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 09:51
 * Description:
 * "中国人"类
 */


class Chinese {

    //身份证号【每一个对象的身份证号不同】
    //实例变量
    String id;

    //姓名【每一个对象的姓名不同】
    //实例变量
    String name;

    //国籍【每个对象都是由"Chinese类"实例化的，所以每一个中国人的国籍都是"中国"】
    //无论通过Chinee这个类实例话多少个java对象，这些java对象的国籍都是"中国"
    //实例变量【一个java对象就有一份，100个java对象，就有100个Country】，分析这种方式有什么缺点？
    //实例变量储存在java对象内部，在堆内存中，在构造方法执行的时候初始化。
    //所有人的国籍都是"中国"，这里声明为实例变量显然是不合适的，太浪费内存空间，没必要让每一个对象都保留一份"国籍"内存

    //不同的java对象由不同的空间，但是相同的java对象就不需要不同的空间，这样会浪费空间
    String country;

    public Chinese(){

    }

    public Chinese(String id,String name,String country){
        this.id=id;
        this.name=name;
        this.country=country;
    }

}
