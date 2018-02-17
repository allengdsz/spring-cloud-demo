package com.pingan.demo.springcloud.netflix.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class RibbonContr {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoadBalancerClient balencerClient;
	
	/**
	 * 負載均衡調用遠程的greeting服務
	 * @return
	 */
	@RequestMapping("/ribbonHello")
	@ResponseBody
	public String getHello() {
		ServiceInstance ints = this.balencerClient.choose("SPRING-CLOUD-CLIENT-PRODUCER");
		return ints.getPort()+" "+this.restTemplate.getForObject("http://SPRING-CLOUD-CLIENT-PRODUCER/greeting", String.class);
	}
	
	@RequestMapping("/logInstance")
	@ResponseBody
	public String logUserInstance() {
		ServiceInstance ints = this.balencerClient.choose("SPRING-CLOUD-CLIENT-PRODUCER");
		return ""+ints.getServiceId()+" ："+ints.getHost()+":"+ints.getPort();
	}
	
	@RequestMapping("/greeting")
	@ResponseBody
	public String greeting() {
		return "hello world";
	}
}
