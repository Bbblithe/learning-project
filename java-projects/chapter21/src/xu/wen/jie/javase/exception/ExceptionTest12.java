package xu.wen.jie.javase.exception;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/25 19:02
 * Description:
 * finally
 */


class ExceptionTest12 {
    public static void main(String[] args) {
        try{
            System.out.println("try....");
            // 推出JVM
            System.exit(0); // 退出JVM之后，finally语句中的代码就不执行了！
        }finally{
            System.out.println("finally....");
        }
    }
}
