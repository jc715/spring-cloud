package com.jc.spring_cloud_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@RequestMapping(value="/index")
    public String index() {
    	System.out.println("***");
        return "index";
    }
	
	@RequestMapping(value="/login")
    public String login() {
		System.out.println("***login***");
        return "login";
    }
}

