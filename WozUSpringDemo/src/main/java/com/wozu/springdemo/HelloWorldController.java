package com.wozu.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	@RequestMapping("/greeting")
	public String getGreeting() {
		return "Hello World!";
	}
}
