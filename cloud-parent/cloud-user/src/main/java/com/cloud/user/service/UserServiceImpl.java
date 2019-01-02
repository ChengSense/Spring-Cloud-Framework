package com.cloud.user.service;

import com.cloud.base.CacheConstant;
import com.cloud.base.ExceptionConstant;
import com.cloud.base.bean.CloudRequest;
import com.cloud.base.cache.CloudRedisTemplate;
import com.cloud.base.exception.CloudException;
import com.cloud.base.util.General;
import com.cloud.user.bean.request.LoginRequest;
import com.cloud.user.bean.request.SmsCodeRequest;
import com.cloud.user.bean.request.UserRequest;
import com.cloud.user.bean.response.SmsResponse;
import com.cloud.user.bean.response.UserResponse;
import com.cloud.user.dao.base.UserMapper;
import com.cloud.user.dao.base.model.User;
import com.cloud.user.dao.base.model.UserExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */

@Service
public class UserServiceImpl implements UserService {

    public List<User> getList() {
        UserExample example = new UserExample();
        example.createCriteria();
        List<User> list = userMapper.selectByExample(example);
        return list;
    }

    public UserResponse getSmsCode(SmsCodeRequest bean) {
        String code = General.smsCode();
        String token = General.generalId();
        cloudRedisTemplate.set(CacheConstant.USER_REGIST_VERIF_CODE + token, code, 30000);
        SmsResponse smsResponse = smsService.sendSmsCode(bean.getPhone(), code);
        if (smsResponse.getStatus() != 1) throw new CloudException(ExceptionConstant.VERIF_CODE_SEND_ERROR);
        UserResponse response = new UserResponse();
        response.setToken(token);
        return response;
    }

    public UserResponse userLogin(LoginRequest request) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(request.getUserName()).andPasswordEqualTo(General.md5(request.getPassword()));
        List<User> list = userMapper.selectByExample(userExample);

        if (list == null || list.isEmpty()) {
            //用户不存在
            throw new CloudException(ExceptionConstant.USER_NAME_OR_PASSWORD_ERROR);
        }

        User user = list.get(0);
        String token = General.generalId();
        CloudRequest cloudRequest = new CloudRequest();
        cloudRequest.setToken(token);
        cloudRequest.setUserId(String.valueOf(user.getUserId()));

        //缓存放入用户信息
        cloudRedisTemplate.setObject(token, cloudRequest);

        UserResponse response = new UserResponse();
        response.setToken(token);
        response.setPhone(user.getPhone());
        return response;
    }

    public UserResponse userRegist(UserRequest bean) {
        UserExample example = new UserExample();
        example.createCriteria().andPhoneEqualTo(bean.getPhone());
        List<User> list = userMapper.selectByExample(example);

        if (!list.isEmpty()) {
            //用户被注册
            throw new CloudException(ExceptionConstant.USER_NAME_USED);
        }
        String verifCode = cloudRedisTemplate.get(CacheConstant.USER_REGIST_VERIF_CODE + bean.getToken());
        if (StringUtils.isBlank(verifCode)) {
            //短信验证码失效
            throw new CloudException(ExceptionConstant.VERIF_CODE_EXPIRED);
        }

        if (!verifCode.equals(bean.getVerifCode())) {
            //短信验证码错误
            throw new CloudException(ExceptionConstant.VERIF_CODE_ERROR);
        }

        User user = new User();
        BeanUtils.copyProperties(bean, user);
        user.setPassword(General.md5(user.getPassword()));
        userMapper.insertSelective(user);

        String token = General.generalId();
        CloudRequest cloudRequest = new CloudRequest();
        cloudRequest.setUserId(String.valueOf(user.getUserId()));
        cloudRequest.setToken(token);
        cloudRedisTemplate.set(token, cloudRequest);

        UserResponse response = new UserResponse();
        response.setToken(bean.getToken());
        return response;
    }


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SmsService smsService;

    @Autowired
    private CloudRedisTemplate cloudRedisTemplate;

}
