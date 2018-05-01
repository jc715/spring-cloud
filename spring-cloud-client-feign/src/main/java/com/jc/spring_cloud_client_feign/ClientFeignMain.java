package com.jc.spring_cloud_client_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientFeignMain {
	public static void main(String[] args) {
		SpringApplication.run(ClientFeignMain.class, args);
	}
}
