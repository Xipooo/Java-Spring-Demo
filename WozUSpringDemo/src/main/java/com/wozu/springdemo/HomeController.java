package com.wozu.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// New MVC Controller that Returns Views
@Controller
public class HomeController {
	
	// Request for multiple endpoints
	@RequestMapping(value= {"/", "/home"})
	public String Index() {
		return "index";
	}
}
