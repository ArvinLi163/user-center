package com.example.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户登录请求体
 * @author: ArvinLi
 * @date: 2024/02/28 19:52
 **/
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -5721999318836494332L;
    String userAccount;
    String userPassword;
}
