package org.demo.springcloud.netflix.eureka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationEurekaClientProduce {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaClientProduce.class, args);
    }
    
}