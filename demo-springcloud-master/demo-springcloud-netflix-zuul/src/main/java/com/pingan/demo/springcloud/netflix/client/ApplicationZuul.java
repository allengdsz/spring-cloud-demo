package com.pingan.demo.springcloud.netflix.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.pingan.demo.springcloud.netflix.filter.ErrorFilter;
import com.pingan.demo.springcloud.netflix.filter.FirstPreFilter;
import com.pingan.demo.springcloud.netflix.filter.PostFilter;
import com.pingan.demo.springcloud.netflix.filter.SecondPreFilter;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class ApplicationZuul {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationZuul.class, args);
    }
    
//    启动filter
    @Bean
    public FirstPreFilter firstPreFilter() {
    	return new FirstPreFilter();
    }
    
    @Bean
    public SecondPreFilter secondPreFilter() {
    	return new SecondPreFilter();
    }
    
    @Bean
    public PostFilter postFilter() {
    	return new PostFilter();
    }
    
    @Bean
    public ErrorFilter errorFilter() {
    	return new ErrorFilter();
    }
    
}