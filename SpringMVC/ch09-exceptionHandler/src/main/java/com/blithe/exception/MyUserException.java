package com.blithe.exception;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 10:45
 * Description:
 */

public class MyUserException extends Exception{
    public MyUserException() {
        super();
    }

    public MyUserException(String message) {
        super(message);
    }
}
