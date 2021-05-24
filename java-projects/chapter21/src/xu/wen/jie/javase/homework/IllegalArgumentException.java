package xu.wen.jie.javase.homework;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 10:01
 * Description:
 * 自定义异常
 */


class IllegalArgumentException extends Exception{
    public IllegalArgumentException(){

    }

    public IllegalArgumentException(String s){
        super(s);
    }
}
