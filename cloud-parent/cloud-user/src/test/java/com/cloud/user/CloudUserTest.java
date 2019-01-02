package com.cloud.user;

import org.junit.BeforeClass;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CloudUserTest {

    private static String url;
    private static RestTemplate restTemplate;

    @BeforeClass
    public static void setUpBeforeClass() {
        url = "http://127.0.0.1:10012/";
    }

    public static void sendRequest(String uri, Object request) {
        uri = url + (uri).replace("//", "/");
        restTemplate = new RestTemplate();

        HttpHeaders requestHeaders = new HttpHeaders();

        HttpEntity<Object> requestEntity = new HttpEntity<Object>(request, requestHeaders);

        ResponseEntity<String> response = restTemplate.postForEntity(uri, requestEntity, String.class);

        System.out.println(response.getBody());
    }

    public static void sendRequest(String uri, String token, Object request) {
        uri = url + (uri).replace("//", "/");
        restTemplate = new RestTemplate();

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("token", token);

        HttpEntity<Object> requestEntity = new HttpEntity<Object>(request, requestHeaders);

        ResponseEntity<String> response = restTemplate.postForEntity(uri, requestEntity, String.class);

        System.out.println(response.getBody());
    }

}
