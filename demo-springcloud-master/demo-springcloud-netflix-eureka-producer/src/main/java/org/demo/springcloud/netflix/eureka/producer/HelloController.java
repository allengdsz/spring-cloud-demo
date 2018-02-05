package org.demo.springcloud.netflix.eureka.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/remote")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
    
    @ResponseBody
    @RequestMapping("greeting")
    public String helloworld() {
    	return "hello world";
	}
    
}