package com.cloud.user.bean.request;

import com.cloud.base.bean.CloudRequest;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class TaoBaoRequest extends CloudRequest {
    private Integer id;
    private Boolean sex;
    private String name;
    private Integer creditLv;
    private String tbAccount;
    private Integer tbPopularity;
    private String deliveryPhone;
    private String deliveryName;
    private String province;
    private String city;
    private String distric;
    private String deliveryAddress;
    private String orderTail;
    private Integer status;
    private String myTbImg;
    private String evalImg;
    private String alipayAuthImg;
    private String shoppingTag;
    private String hbImg;
    private Integer hbStatus;
}
