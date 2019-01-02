package com.cloud.user.service;

import com.cloud.user.bean.request.TaoBaoRequest;
import com.cloud.user.bean.response.TaobaoResponse;
import com.cloud.user.bean.response.UserResponse;

/**
 * @version V1.0
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */
public interface TaoBaoService {

    TaobaoResponse addAccount(TaoBaoRequest request);

}
