package com.cloud.user.service;

import com.cloud.user.bean.request.RealNameAuthRequest;
import com.cloud.user.bean.response.RrealNameAuthResponse;

/**
 * @version V1.0
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */
public interface RealNameAuthService {

    RrealNameAuthResponse addUserInfo(RealNameAuthRequest request);

}
