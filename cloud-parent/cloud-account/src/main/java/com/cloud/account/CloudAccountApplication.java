package com.cloud.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@MapperScan("com.cloud.account.dao")
@ComponentScan({"com.cloud.account", "com.cloud.base"})

@EnableEurekaClient
@SpringBootApplication
public class CloudAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAccountApplication.class, args);
    }

}
