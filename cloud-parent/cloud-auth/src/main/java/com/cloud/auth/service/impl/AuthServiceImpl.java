package com.cloud.auth.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cloud.auth.dao.base.SystemUserMapper;
import com.cloud.auth.dao.base.model.SystemUser;
import com.cloud.auth.dao.base.model.SystemUserExample;
import com.cloud.auth.service.AuthService;

/**
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */

@Service
public class AuthServiceImpl implements AuthService {

	public List<SystemUser> getList() {
		SystemUserExample example = new SystemUserExample();
		example.createCriteria();
		List<SystemUser> list = systemUserMapper.selectByExample(example);
		return list;
	}

	@Resource
	private SystemUserMapper systemUserMapper;
}
