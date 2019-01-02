package com.cloud.auth.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.auth.dao.base.model.SystemUser;
import com.cloud.auth.service.AuthService;
import com.cloud.base.annotation.Access;
import com.cloud.base.bean.CloudResponse;

/**
 * @Description:账户类
 * @Date 2018年11月6日 上午10:46:39
 * @version V1.0
 */
@RequestMapping("auth")
@RestController
public class AuthController {
	Logger logger = LoggerFactory.getLogger(AuthController.class);

	/**
	 * @Description: account列表
	 * @param: request
	 * @return: CloudResponse<String>
	 */
	@Access
	@RequestMapping("list")
	public CloudResponse<List<SystemUser>> list() {
		return new CloudResponse<List<SystemUser>>(accountService.getList());
	}

	@Autowired
	private AuthService accountService;

}
