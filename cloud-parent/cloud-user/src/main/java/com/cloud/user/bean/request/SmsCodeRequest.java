package com.cloud.user.bean.request;

import lombok.Data;
import javax.validation.constraints.Pattern;

@Data
public class SmsCodeRequest {
    @Pattern(regexp = "^1[34578]\\d{9}$",message="手机号不匹配")
    private String phone; //手机号
}
