package com.cloud.account.service;

import com.cloud.account.bean.request.AccountRequest;
import com.cloud.account.dao.base.model.SystemUser;
import com.github.pagehelper.PageInfo;

/**
 * @Description: TODO
 * @version V1.0
 * @Date 2018年11月6日 上午10:54:37
 */
public interface AccountService {
	
	PageInfo<SystemUser> getList(AccountRequest request);

}
