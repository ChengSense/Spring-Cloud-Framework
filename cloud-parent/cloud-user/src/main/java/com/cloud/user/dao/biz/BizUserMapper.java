package com.cloud.user.dao.biz;

import com.cloud.user.dao.base.model.User;
import com.cloud.user.dao.base.model.UserExample;

import java.util.List;

public interface BizUserMapper {

	List<User> selectByExample(UserExample example);

}