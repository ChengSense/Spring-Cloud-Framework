package com.cloud.account;

import com.cloud.account.bean.request.AccountRequest;
import com.cloud.base.cache.CloudRedisTemplate;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudAccountTest {

    @Autowired
    public CloudRedisTemplate cloudRedisTemplate;

    @BeforeClass
    public static void setUpBeforeClass() {

    }

    @Test
    public void redisTest() {
        AccountRequest request = new AccountRequest();
        request.setUserId("10000");
        request.setName("chengdong");
        System.out.println(cloudRedisTemplate.set("chengdong", request));
    }

}
