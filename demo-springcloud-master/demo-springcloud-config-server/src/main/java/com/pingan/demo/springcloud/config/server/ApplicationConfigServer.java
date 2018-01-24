package com.pingan.demo.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration //此注释自动载入应用程序所需的所有Bean
@EnableDiscoveryClient
@EnableConfigServer
public class ApplicationConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigServer.class, args);
    }
}