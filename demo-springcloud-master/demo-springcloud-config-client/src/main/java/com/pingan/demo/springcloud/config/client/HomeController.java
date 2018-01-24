package com.pingan.demo.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

    @Value("${env.name:World!}")
    private String bar;
    
    @Value("${env.password:World2!}")
    private String pwd;

    @RequestMapping("/config")
    String hello() {
        return "Hello " + bar + "!";
    }
    
    @RequestMapping("/pwd")
    String pwd() {
    	return "hello" + pwd +"!";
    }
    
}
