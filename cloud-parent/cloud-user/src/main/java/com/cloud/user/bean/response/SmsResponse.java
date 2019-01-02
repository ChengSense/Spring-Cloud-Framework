package com.cloud.user.bean.response;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class SmsResponse {
    private String phone;//短信发送的手机号码。
    private String respCode;//请求状态码，取值00000（成功： 此步响应只表明客户的短信请求发送成功，不表明短信通道已经发送短信成功。）
    private String respDesc;//对返回状态码的描述 如：00000 代表成功
    private String smsId;//短信标识符。一个由32个字符组成的短信唯一标识符。
    private Integer status;

    public Integer getStatus() {
        if(StringUtils.isBlank(respCode)) return 0;
        if(respCode.equals("00000")) return 1;
        return 0;
    }

}