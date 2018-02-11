package com.wozu.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Create Rest Controller with mapping and first action
@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	@RequestMapping("/greeting")
	public String getGreeting() {
		return "Hello World!";
	}
	
	@RequestMapping(value="/greeting", method=RequestMethod.POST)
	public String postGreeting() {
		return "Hello Post World!";
	}
}
