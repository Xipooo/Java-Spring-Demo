package com.wozu.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {
	// Add View Controllers that bypass a need for Controller classes
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		super.addViewControllers(registry);
		registry.addViewController("/security").setViewName("security");
		registry.addViewController("/members").setViewName("members");
	}

//	With Thymeleaf installed views must be in src/main/resources/templates
//	@Bean
//	public ViewResolver getViewResolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".html");
//		resolver.setExposeContextBeansAsAttributes(true);
//		return resolver;
//	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}