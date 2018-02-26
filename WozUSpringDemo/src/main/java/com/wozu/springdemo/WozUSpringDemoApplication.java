package com.wozu.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.LogManager;

@SpringBootApplication
public class WozUSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WozUSpringDemoApplication.class, args);

		// This filters out messages below a given threshold
		Configurator.setRootLevel(Level.DEBUG);

		// demonstrate that there are different log levels, from highest to lowest log
		// level
		final Logger logger = LogManager.getLogger();
		logger.log(Level.FATAL, "This is a log with level FATAL");
		logger.log(Level.ERROR, "This is a log with level ERROR");
		logger.log(Level.WARN, "This is a log with level WARN");
		logger.log(Level.INFO, "This is a log with level INFO");
		logger.log(Level.DEBUG, "This is a log with level DEBUG");
		logger.log(Level.TRACE, "This is a log with level TRACE");
		logger.log(Level.ALL, "This is a log with level ALL");
	}
}
