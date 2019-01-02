package com.cloud.user.bean.response;

import lombok.Data;

@Data
public class UserResponse {
    private String token;//token
    private String phone; //手机号
    private String qq;//qq
}