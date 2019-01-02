package com.cloud.user.controller;

import com.cloud.base.annotation.Access;
import com.cloud.user.bean.request.RealNameAuthRequest;
import com.cloud.user.bean.request.TaoBaoRequest;
import com.cloud.user.bean.response.RrealNameAuthResponse;
import com.cloud.user.bean.response.TaobaoResponse;
import com.cloud.user.service.RealNameAuthService;
import com.cloud.user.service.TaoBaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Description: 用户实名认证理类
 * @Date 2018年11月6日 上午10:46:39
 */
@RequestMapping("realNameAuth")
@RestController
public class RealNameAuthController {
    Logger logger = LoggerFactory.getLogger(RealNameAuthController.class);

    /**
     * @Description: 添加用户实名信息
     * @param: TaoBaoRequest
     * @return: TaobaoResponse
     */
    @Access
    @RequestMapping("addUserInfo")
    public RrealNameAuthResponse addUserInfo(RealNameAuthRequest request) {
        return realNameAuthService.addUserInfo(request);
    }

    @Autowired
    private RealNameAuthService realNameAuthService;

}
