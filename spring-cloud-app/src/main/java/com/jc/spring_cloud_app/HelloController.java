package com.jc.spring_cloud_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//手动刷新范围点  /refresh
public class HelloController {
//	@Value("${from}")
	String from_flag;
	
	
    @RequestMapping("/hello")
    public String index() {
        return "test";
    }
}
