package com.cloud.auth.dao.biz;

import java.util.List;

import com.cloud.auth.dao.base.model.SystemUser;
import com.cloud.auth.dao.base.model.SystemUserExample;

public interface BizSystemUserMapper {

	List<SystemUser> selectByExample(SystemUserExample example);

}