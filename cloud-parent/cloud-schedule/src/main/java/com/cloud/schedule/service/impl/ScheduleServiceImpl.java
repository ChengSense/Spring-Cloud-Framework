package com.cloud.schedule.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cloud.schedule.dao.base.SystemUserMapper;
import com.cloud.schedule.dao.base.model.SystemUser;
import com.cloud.schedule.dao.base.model.SystemUserExample;
import com.cloud.schedule.service.ScheduleService;

/**
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */

@Service
public class ScheduleServiceImpl implements ScheduleService {

	public List<SystemUser> getList() {
		SystemUserExample example = new SystemUserExample();
		example.createCriteria();
		List<SystemUser> list = systemUserMapper.selectByExample(example);
		return list;
	}

	@Resource
	private SystemUserMapper systemUserMapper;
}
