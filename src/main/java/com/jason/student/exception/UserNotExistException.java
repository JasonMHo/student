package com.jason.student.exception;

/**
 * @author jason
 * @date 2019-05-08  17:50:26
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在！");
    }
}
