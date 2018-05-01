package com.jc.spring_cloud_myapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServerMain {
    public static void main( String[] args ){
    	new SpringApplicationBuilder(ServerMain.class).web(true).run(args);
    }
}
