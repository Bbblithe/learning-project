package com.blithe.exception;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 10:47
 * Description:
 */

// 当用户的姓名有异常，抛出NameException
public class NameException extends MyUserException{
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
