package com.example.dianpingbackend.entity;

// 登录参数接收类（DTO）
public class LoginRequest {
    private String phone;
    private String code;

    // 必须提供getter和setter方法，否则Spring无法解析JSON
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}