package com.example.usercenter.exception;

/**
 * @description: 自定义异常类
 * @author: ArvinLi
 **/
public class BusinessException extends RuntimeException{
    private int code;
    private String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }
}
