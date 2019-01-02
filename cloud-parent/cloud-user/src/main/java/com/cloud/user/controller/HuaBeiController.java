package com.cloud.user.controller;

import com.cloud.base.annotation.Access;
import com.cloud.user.bean.request.TaoBaoRequest;
import com.cloud.user.bean.response.TaobaoResponse;
import com.cloud.user.service.TaoBaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Description: 用户花呗处理类
 * @Date 2018年11月6日 上午10:46:39
 */
@RequestMapping("huabei")
@RestController
public class HuaBeiController {
    Logger logger = LoggerFactory.getLogger(HuaBeiController.class);

    /**
     * @Description: 添加淘宝账号
     * @param: TaoBaoRequest
     * @return: TaobaoResponse
     */
    @Access
    @RequestMapping("addHuaBei")
    public TaobaoResponse addAccount(TaoBaoRequest request) {
        return taoBaoService.addAccount(request);
    }

    @Autowired
    private TaoBaoService taoBaoService;

}
