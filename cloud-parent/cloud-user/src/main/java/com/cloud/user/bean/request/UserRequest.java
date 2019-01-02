package com.cloud.user.bean.request;

import com.cloud.base.bean.CloudRequest;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class UserRequest extends CloudRequest {
    @Pattern(regexp = "^1[34578]\\d{9}$",message="手机号不匹配")
    private String phone; //手机号

    @Pattern(regexp = "^[1-9]\\d{4,9}$")
    private String qq;//qq

    @Pattern(regexp = "^.{6,9}")
    private String password;//登录密码

    @Pattern(regexp = "\\d{6}",message="验证码错误")
    private String verifCode;// 验证码
}
