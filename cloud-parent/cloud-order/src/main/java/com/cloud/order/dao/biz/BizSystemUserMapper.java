package com.cloud.order.dao.biz;

import java.util.List;

import com.cloud.order.dao.base.model.SystemUser;
import com.cloud.order.dao.base.model.SystemUserExample;

public interface BizSystemUserMapper {

	List<SystemUser> selectByExample(SystemUserExample example);

}