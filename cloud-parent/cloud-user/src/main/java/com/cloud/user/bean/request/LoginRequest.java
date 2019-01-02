package com.cloud.user.bean.request;

import com.cloud.base.bean.CloudRequest;
import com.cloud.base.util.General;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class LoginRequest extends CloudRequest {
    @Pattern(regexp = "^1[34578]\\d{9}$", message = "手机号不匹配")
    private String userName; //手机号

    @Pattern(regexp = "^.{6,9}")
    private String password;//登录密码
}
