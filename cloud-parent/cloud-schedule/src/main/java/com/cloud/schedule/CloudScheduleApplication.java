package com.cloud.schedule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

@MapperScan("com.cloud.schedule.dao")
@EnableAutoConfiguration
public class CloudScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudScheduleApplication.class, args);
	}
	
}
