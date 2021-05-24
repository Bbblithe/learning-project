package xu.wen.jie.javase.exception;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/25 20:29
 * Description:
 */


/**
 * 栈操作异常:自定义异常
 */
class MyStackOperationException extends Exception{// 编译时异常
    public MyStackOperationException(){

    }

    public MyStackOperationException(String s ){
        super(s);
    }
}
