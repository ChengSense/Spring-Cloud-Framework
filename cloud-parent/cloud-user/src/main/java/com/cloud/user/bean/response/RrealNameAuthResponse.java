package com.cloud.user.bean.response;

import lombok.Data;

@Data
public class RrealNameAuthResponse {
    private String smsId;//	必选	短信标识符。一个由32个字符组成的短信唯一标识符。
    private String phone;//	可选	短信发送的手机号码。
    private String status;//必选	短信发送状态报告。0：成功；1：失败
    private String respMessage;//可选 短信回执具体内容（网关返回错误码）。
    private String receiveTime;//必选 短信接收时间。发送成功返回回执中到达的具体时间，如果为未知状态或失败状态，则为空。格式为yyyy-mm-dd hh:mm:ss
    private String chargingNum;//必选 计费条数。短信签名+短信内容70字以内包含70字为1条，超过70字则按每条为67字计算条数。
}