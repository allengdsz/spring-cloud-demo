package org.demo.spring.cloud.netflix.eureka.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServerHaApplicationHA {

	public static void main(String[] args) {
		SpringApplication.run(ServerHaApplicationHA.class, args);
	}
}
