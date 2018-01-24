package com.pingan.demo.springcloud.netflix.client;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableEurekaClient
public class HomeController {

    private String bar;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @ResponseBody
    @RequestMapping("/home2")
    public String hello2() {
        return "Hello " + bar + "!";
    }
}
