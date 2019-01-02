package com.cloud.base;

/**
 * @version V1.0
 * @Description: 异常枚举量类
 * @Date 2018年11月6日 下午1:39:23
 */
public enum ExceptionConstant {
    REQUEST_ERROR(00000, "请求失败！"),
    REQUEST_SUCCESS(10000, "请求成功!"),
    SIGNATURE_ERROR(30001, "签名错误!"),
    SIGNATURE_PARAME_NULL(30002, "签名参数为空!"),
    TOKEN_PARAME_NULL(30003, "TOKEN参数为空!"),
    USER_NAME_OR_PASSWORD_ERROR(40003, "用户名密码错误!"),
    USER_NAME_USED(40000, "用户已被使用！"),
    VERIF_CODE_SEND_ERROR(40001, "短信发送失败，请重新再试!"),
    VERIF_CODE_EXPIRED(40002, "短信验证码已失效！"),
    VERIF_CODE_ERROR(40003, "短信错误！");

    ExceptionConstant(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private Integer code;
    private String msg;
}
