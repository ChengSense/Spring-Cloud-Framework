package com.cloud.account.dao.biz;

import java.util.List;

import com.cloud.account.dao.base.model.SystemUser;
import com.cloud.account.dao.base.model.SystemUserExample;

public interface BizSystemUserMapper {

	List<SystemUser> selectByExample(SystemUserExample example);

}