package com.stackroute.demo.exception;

public class UserAlreadyExistsException extends Exception {
    private String msg;
    public UserAlreadyExistsException()
    {

    }
    public UserAlreadyExistsException(String msg)
    {
        super(msg);
        this.msg=msg;
    }
}
