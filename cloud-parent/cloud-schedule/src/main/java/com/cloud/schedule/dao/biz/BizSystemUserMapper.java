package com.cloud.schedule.dao.biz;

import java.util.List;

import com.cloud.schedule.dao.base.model.SystemUser;
import com.cloud.schedule.dao.base.model.SystemUserExample;

public interface BizSystemUserMapper {

	List<SystemUser> selectByExample(SystemUserExample example);

}