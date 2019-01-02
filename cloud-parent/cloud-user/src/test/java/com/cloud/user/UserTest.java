package com.cloud.user;

import com.cloud.user.bean.request.LoginRequest;
import com.cloud.user.bean.request.SmsCodeRequest;
import com.cloud.user.bean.request.UserRequest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class UserTest extends CloudUserTest {

    @Test
    public void getSmsCodeTest() {
        SmsCodeRequest request = new SmsCodeRequest();
        request.setPhone("18858141782");
        sendRequest("user/getSmsCode", request);
    }

    @Test
    public void userRegistTest() {
        UserRequest request = new UserRequest();
        request.setQq("72722");
        request.setPhone("18858141782");
        request.setPassword("111111");
        request.setVerifCode("595212");
        sendRequest("user/regist", "3ADCC0D0E02C4176BE83C46B4F020A49", request);
    }

    @Test
    public void userLoginTest() {
        LoginRequest request = new LoginRequest();
        request.setUserName("18858141111");
        request.setPassword("111111");
        sendRequest("user/login", request);
    }

}
