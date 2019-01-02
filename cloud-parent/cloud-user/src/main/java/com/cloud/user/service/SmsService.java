package com.cloud.user.service;

import com.alibaba.fastjson.JSONObject;
import com.cloud.base.util.General;
import com.cloud.user.bean.request.SmsRequest;
import com.cloud.user.bean.response.SmsResponse;
import com.cloud.user.dao.base.BaseSmsRequestMapper;
import com.cloud.user.dao.base.model.BaseSmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */

@Service
public class SmsService {

    @Autowired
    private SmsRequest smsRequest;

    public SmsResponse sendSmsCode(String phone, String code) {
        String content = smsRequest.getSmsContent().replace("{code}", code);
        Map<String, String> map = requestParam(phone, content);
        SmsResponse response = restTemplate.postForObject(smsRequest.url, null, SmsResponse.class, map);
        asyncInsertRecord(phone, code, map, response);
        return response;
    }

    private Map<String, String> requestParam(String phone, String message) {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String sigin = General.md5(smsRequest.getAccountSid() + smsRequest.getToken() + timestamp);
        Map<String, String> map = new HashMap<>();
        map.put("accountSid", smsRequest.getAccountSid());
        map.put("smsContent", message);
        map.put("timestamp", timestamp);
        map.put("sig", sigin);
        map.put("to", phone);
        return map;
    }

    @Async
    public void asyncInsertRecord(String phone, String code, Map<String, String> map, SmsResponse response) {
        BaseSmsRequest bean = new BaseSmsRequest();
        bean.setCode(code);
        bean.setPhone(phone);
        bean.setRequest(JSONObject.toJSONString(map));
        bean.setResponse(JSONObject.toJSONString(response));
        bean.setStatus(response.getStatus());
        baseSmsRequestMapper.insertSelective(bean);
    }

    private RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private BaseSmsRequestMapper baseSmsRequestMapper;
}
