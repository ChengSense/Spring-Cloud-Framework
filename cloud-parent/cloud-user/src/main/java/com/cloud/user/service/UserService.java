package com.cloud.user.service;

import com.cloud.user.bean.request.LoginRequest;
import com.cloud.user.bean.request.SmsCodeRequest;
import com.cloud.user.bean.request.UserRequest;
import com.cloud.user.bean.response.UserResponse;
import com.cloud.user.dao.base.model.User;

import java.util.List;

/**
 * @version V1.0
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */
public interface UserService {

    List<User> getList();

    UserResponse userRegist(UserRequest bean);

    UserResponse getSmsCode(SmsCodeRequest bean);

    UserResponse userLogin(LoginRequest request);

}
