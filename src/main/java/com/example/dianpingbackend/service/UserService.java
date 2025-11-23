package com.example.dianpingbackend.service;

import com.example.dianpingbackend.entity.User;
public interface UserService {
    // 获取验证码
    String getVerifyCode(String phone);

    // 验证码登录/注册
    User login(String phone, String code);
}
