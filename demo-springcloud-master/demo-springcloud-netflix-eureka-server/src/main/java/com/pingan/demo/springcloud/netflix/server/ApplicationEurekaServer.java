package com.pingan.demo.springcloud.netflix.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableAutoConfiguration
@EnableEurekaServer
public class ApplicationEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaServer.class, args);
    }
}