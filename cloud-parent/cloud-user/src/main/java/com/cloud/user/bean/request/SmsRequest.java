package com.cloud.user.bean.request;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.sms.miaodi")
@Data
public class SmsRequest {
    public String url;
    public String token;
    public String accountSid;
    public String smsContent;
}
