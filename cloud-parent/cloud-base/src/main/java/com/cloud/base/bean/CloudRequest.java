package com.cloud.base.bean;

import lombok.Data;

@Data
public class CloudRequest {
	private int pageNow;
	private int pageSize;

	private String token;
	private String sign;
	private String userId;
}
