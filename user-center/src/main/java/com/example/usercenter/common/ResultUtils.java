package com.example.usercenter.common;

/**
 * @description: 返回工具类
 * @author: ArvinLi
 **/
public class ResultUtils {
    /**
     * 成功
     * @param data 返回的数据对象
     * @return 通用返回类对象
     * @param <T> 泛型
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode 自定错误码对象
     * @return 通用返回类对象
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param code 自定义错误码
     * @param message 自定义状态码信息
     * @param description 自定义状态码描述
     * @return 通用返回类对象
     */
    public static BaseResponse error(int code,String message,String description) {
        return new BaseResponse<>(code,null,message,description);
    }
    /**
     * 失败
     * @param errorCode 自定错误码对象
     * @param message 自定义状态码信息
     * @param description 自定义状态码描述
     * @return 通用返回类对象
     */
    public static BaseResponse error(ErrorCode errorCode,String message,String description) {
        return new BaseResponse<>(errorCode.getCode(),null,message,description);
    }

    /**
     * 失败
     * @param errorCode 自定错误码对象
     * @param description 自定义状态码描述
     * @return 通用返回类对象
     */
    public static BaseResponse error(ErrorCode errorCode,String description) {
        return new BaseResponse<>(errorCode.getCode(),errorCode.getMessage(),description);
    }
}
