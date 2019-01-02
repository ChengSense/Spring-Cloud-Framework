package com.cloud.user.controller;

import com.cloud.base.annotation.Access;
import com.cloud.user.bean.request.LoginRequest;
import com.cloud.user.bean.request.SmsCodeRequest;
import com.cloud.user.bean.request.UserRequest;
import com.cloud.user.bean.response.UserResponse;
import com.cloud.user.dao.base.model.User;
import com.cloud.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version V1.0
 * @Description:账户类
 * @Date 2018年11月6日 上午10:46:39
 */
@RequestMapping("user")
@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * @Description: 用户列表
     * @param: request
     * @return: CloudResponse<String>
     */
    @Access
    @RequestMapping("list")
    public List<User> userlist(String name) {
        return userService.getList();
    }

    /**
     * @Description: 发送短信验证码
     * @param: request
     * @return: List<User>
     */
    @RequestMapping("getSmsCode")
    public UserResponse getSmsCode(@RequestBody SmsCodeRequest request) {
        return userService.getSmsCode(request);
    }

    /**
     * @Description: 用户注册
     * @param: request
     * @return: List<User>
     */
    @Access(false)
    @RequestMapping("regist")
    public UserResponse userRegist(@RequestBody @Validated UserRequest request) {
        return userService.userRegist(request);
    }

    /**
     * @Description: 用户登录
     * @param: request
     * @return: List<User>
     */
    @Access
    @RequestMapping("login")
    public UserResponse userLogin(@RequestBody LoginRequest request) {
        return userService.userLogin(request);
    }

    @Autowired
    private UserService userService;

}
