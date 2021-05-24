package xu.wen.jie.javase.exception;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/25 16:37
 * Description:
 * 异常对象有两个非常重要的方法：
 *      获取异常的简单描述信息：
 *          String msg = exception.getMessage();
 *
 *      打印异常追踪的堆栈信息：
 *          exception.printStackTrace();
 */


class ExceptionTest08 {
    public static void main(String[] args) {
        // 这里只是为了测试getMassage()方法和printStackTrace()方法。
        // 这里只是new了异常对象，但是没有将异常对象抛出。JVM会认为这是一个普通的java对象。
        NullPointerException e = new NullPointerException("空指针异常");

        // 获取异常简单描述信息：这个信息实际上就是构造方法上面的String参数。
        String msg = e.getMessage();
        System.out.println(msg);

        // 打印异常堆栈信息
        // java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的。
        e.printStackTrace();

        for(int i = 0;i<1000;i++){
            System.out.println(i);
        }
        System.out.println("Hello World");
    }
}
