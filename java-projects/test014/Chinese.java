package test014;

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

    //国籍【所有对象国籍一样，这种特征属于类级别的特征，可以提升为整个模版的特征，可以在变量前添加static关键字修饰】
    //静态变量，在类加载的时候初始化，不需要创建对象，内存就开辟了。
    //静态变量存储在方法区内存当中。
    static String country="中国";

    public Chinese(){

    }

    public Chinese(String id,String name){
        this.id=id;
        this.name=name;
    }

}
