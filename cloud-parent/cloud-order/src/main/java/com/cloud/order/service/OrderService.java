package com.cloud.order.service;

import java.util.List;

import com.cloud.order.dao.base.model.SystemUser;

/**
 * @Description: TODO
 * @version V1.0
 * @Date 2018年11月6日 上午10:54:37
 */
public interface OrderService {
	
	List<SystemUser> getList();

}
