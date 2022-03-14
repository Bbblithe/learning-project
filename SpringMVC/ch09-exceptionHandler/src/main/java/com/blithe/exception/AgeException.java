package com.blithe.exception;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 10:48
 * Description:
 */

// 当年龄有问题时，抛出异常
public class AgeException extends MyUserException{
    public AgeException(String message) {
        super(message);
    }

    public AgeException() {
        super();
    }
}
