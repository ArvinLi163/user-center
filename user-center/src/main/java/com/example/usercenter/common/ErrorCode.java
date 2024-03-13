package com.example.usercenter.common;

/**
 * @description: 错误码
 * @author: ArvinLi
 **/

public enum ErrorCode {
    SUCCESS(0,"ok",""),
    PARAMS_ERROR(40000,"请求参数错误",""),
    NULL_ERROR(40001,"请求数据为空",""),
    NOT_LOGIN(40100,"未登录",""),
    NO_AUTH(40101,"无权限",""),
    SYSTEM_ERROR(50000,"系统内部异常",""),
    NOT_EXIST(50001,"账户不存在",""),
    EXIST_ERROR(50002,"账户已存在",""),
    PLANETCODE_ERROR(50003,"星球编号已存在",""),
    LOGOUT_ERROR(50004,"退出失败","");


    private final int code;
    /**
     * 状态码信息
     */
    private final String message;
    /**
     * 状态码描述（详细）
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
