package com.pingan.demo.springcloud.netflix.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class SecondPreFilter extends ZuulFilter {

	 private static Logger log = LoggerFactory.getLogger(SecondPreFilter.class);  
	  
	    @Override  
	    public String filterType() {  
	        //前置过滤器  
	        return "pre";  
	    }  
	  
	    @Override  
	    public int filterOrder() {  
	        //优先级，数字越大，优先级越低  
	        return 1;  
	    }  
	  
	    @Override  
	    public boolean shouldFilter() {  
	        //是否执行该过滤器，true代表需要过滤  
	        return true;  
	    }  
	  
	    @Override  
	    public Object run() {  
	        RequestContext ctx = RequestContext.getCurrentContext();  
	        HttpServletRequest request = ctx.getRequest();  
	  
	        log.info("second过滤器");  
	  
	        return null;  
	  
	    }  
}
