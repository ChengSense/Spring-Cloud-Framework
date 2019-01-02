package com.cloud.account.bean.request;

import com.cloud.base.bean.CloudRequest;
import lombok.Data;

@Data
public class AccountRequest extends CloudRequest {

    private String name;

}
