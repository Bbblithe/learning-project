package xu.wen.jie.javase.exception;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/24 08:13
 * Description:
 * 以下代码报错的原因是什么？
 *      因为doSome()方法声明位置上使用了：throws ClassNotFoundException
 *      而ClassNotFoundException是编译时异常。必须编写代码时处理，没有处理
 *      编译器报错。
 */


class ExceptionTest04 {
    public static void main(String[] args) {
        // main方法中调用doSome()方法
        // 因为doSome()方法声明位置上：throws ClassNotFoundException
        // 我们在调用doSome()方法的时候必须对这种异常进行预先的处理。
        // 如果不处理，编译器就报错。
        // 编译器报错信息：Unhandled exception: java.lang.ClassNotFoundException
        //doSome();
    }

    /**
     * doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
     * 这个代码表示doSome()方法在执行过程中，有可能会出现ClassNotFoundException异常。
     * 叫做类没找到异常。这个异常直接父类是：Exception，所以ClassNotFoundException属于编译时异常。
     * @throws ClassNotFoundException
     */
    public static void doSome()throws ClassNotFoundException{
        System.out.println("doSome!!1");
    }

}
