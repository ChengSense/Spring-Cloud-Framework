package com.cloud.order.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cloud.order.dao.base.SystemUserMapper;
import com.cloud.order.dao.base.model.SystemUser;
import com.cloud.order.dao.base.model.SystemUserExample;
import com.cloud.order.service.OrderService;

/**
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */

@Service
public class OrderServiceImpl implements OrderService {

	public List<SystemUser> getList() {
		SystemUserExample example = new SystemUserExample();
		example.createCriteria();
		List<SystemUser> list = systemUserMapper.selectByExample(example);
		return list;
	}

	@Resource
	private SystemUserMapper systemUserMapper;
}
