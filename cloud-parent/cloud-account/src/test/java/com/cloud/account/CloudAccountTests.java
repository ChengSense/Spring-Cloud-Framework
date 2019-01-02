package com.cloud.account;

import com.cloud.account.bean.request.AccountRequest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class CloudAccountTests {

    private static RestTemplate restTemplate;
    private static String url;

    @BeforeClass
    public static void setUpBeforeClass() {
        restTemplate = new RestTemplate();
        url = "http://127.0.0.1:10008/account/list";
    }

    @Test
    public void bodyTest() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("token", "chengdong");

        AccountRequest request = new AccountRequest();
        request.setName("7272");

        HttpEntity<AccountRequest> requestEntity = new HttpEntity<AccountRequest>(request, requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);

        System.out.println(response.getBody());

    }

}
