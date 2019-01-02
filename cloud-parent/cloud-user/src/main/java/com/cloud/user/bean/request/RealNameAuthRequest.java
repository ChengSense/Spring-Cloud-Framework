package com.cloud.user.bean.request;

import com.cloud.base.bean.CloudRequest;
import lombok.Data;

@Data
public class RealNameAuthRequest extends CloudRequest {
    private String name;
    private String idCard;
    private String cardFrontImg;
    private String cardHandImg;
    private Byte gesture;
    private Byte status;
}
