package com.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("host_route",r -> r.path("/app/**").filters(f -> f.stripPrefix(1)).uri("lb://CLOUD-ACCOUNT"))
				.route("host_route",r -> r.path("/app/**").filters(f -> f.stripPrefix(1)).uri("lb://CLOUD-USER"))
				.build();
	}

}
