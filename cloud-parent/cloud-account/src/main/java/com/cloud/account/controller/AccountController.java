package com.cloud.account.controller;

import com.cloud.account.bean.request.AccountRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cloud.account.dao.base.model.SystemUser;
import com.cloud.account.service.AccountService;
import com.cloud.base.annotation.Access;
import com.cloud.base.bean.CloudResponse;
import com.github.pagehelper.PageInfo;

/**
 * @version V1.0
 * @Description:账户类
 * @Date 2018年11月6日 上午10:46:39
 */
@RequestMapping("account")
@RestController
public class AccountController {
    /**
     * @Description: account列表
     * @param: request
     * @return: CloudResponse<String>
     */
    @Access(false)
    @RequestMapping("list")
    public PageInfo<SystemUser> list(AccountRequest request) {
        return accountService.getList(request);
    }

    @Autowired
    private AccountService accountService;

}
