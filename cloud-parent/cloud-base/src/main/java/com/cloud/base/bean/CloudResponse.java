package com.cloud.base.bean;

import com.cloud.base.ExceptionConstant;

import lombok.Data;

@Data
public class CloudResponse<T> {

    private Integer code;
    private String msg;

    private T data;

    public CloudResponse(T data) {
        this.data = data;
        this.code = ExceptionConstant.REQUEST_SUCCESS.getCode();
        this.msg = ExceptionConstant.REQUEST_SUCCESS.getMsg();
    }

}
