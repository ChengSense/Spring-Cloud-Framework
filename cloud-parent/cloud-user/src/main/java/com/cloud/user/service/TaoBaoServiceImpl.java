package com.cloud.user.service;

import com.cloud.user.bean.request.TaoBaoRequest;
import com.cloud.user.bean.response.TaobaoResponse;
import com.cloud.user.dao.base.UserTaobaoMapper;
import com.cloud.user.dao.base.model.UserTaobao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */
@Service
public class TaoBaoServiceImpl implements TaoBaoService {

    public TaobaoResponse addAccount(TaoBaoRequest request) {
        UserTaobao bean = new UserTaobao();
        BeanUtils.copyProperties(request, bean);
        userTaobaoMapper.insertSelective(bean);
        TaobaoResponse response = new TaobaoResponse();
        return response;
    }

    @Autowired
    private UserTaobaoMapper userTaobaoMapper;

}
