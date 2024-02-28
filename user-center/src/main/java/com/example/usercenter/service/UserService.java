package com.example.usercenter.service;

import com.example.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 21188
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-02-27 09:52:47
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return
     */
    long userRegister(String userAccount,String userPassword,String checkPassword);
}
