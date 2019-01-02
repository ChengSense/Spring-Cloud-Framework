package com.cloud.base.exception;

import com.cloud.base.ExceptionConstant;

import lombok.Data;

@Data
public class CloudException extends RuntimeException {

	public CloudException(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public CloudException(ExceptionConstant ex) {
		super();
		this.code = ex.getCode();
		this.msg = ex.getMsg();
	}

	public CloudException(String msg) {
		super();
		this.msg = msg;
	}

	private static final long serialVersionUID = 70526377718473430L;
	private int code;
	private String msg;

}
