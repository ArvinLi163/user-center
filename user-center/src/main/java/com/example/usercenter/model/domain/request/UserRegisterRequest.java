package com.example.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户注册请求体
 * @author: ArvinLi
 * @date: 2024/02/28 19:52
 **/
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -543286974259314538L;
    String userAccount;
    String userPassword;
    String checkPassword;
}
