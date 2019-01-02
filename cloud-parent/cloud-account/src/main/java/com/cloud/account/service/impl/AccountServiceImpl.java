package com.cloud.account.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.cloud.account.bean.request.AccountRequest;
import org.springframework.stereotype.Service;

import com.cloud.account.dao.base.SystemUserMapper;
import com.cloud.account.dao.base.model.SystemUser;
import com.cloud.account.dao.base.model.SystemUserExample;
import com.cloud.account.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */

@Service
public class AccountServiceImpl implements AccountService {

	public PageInfo<SystemUser> getList(AccountRequest request) {
		PageHelper.startPage(3 , 3);
		SystemUserExample example = new SystemUserExample();
		example.createCriteria();
		List<SystemUser> list = systemUserMapper.selectByExample(example);
		return new PageInfo<SystemUser>(list);
	}

	@Resource
	private SystemUserMapper systemUserMapper;
}
