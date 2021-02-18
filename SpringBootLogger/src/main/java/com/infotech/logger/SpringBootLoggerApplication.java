package com.infotech.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootLoggerApplication {
    
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringBootLoggerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggerApplication.class, args);
		LOGGER.error("message logged at ERROR level");
		LOGGER.warn("message logged at WARN level");
		LOGGER.info("message logged at INFO level");
		LOGGER.debug("message logged at DEBUG level");
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "WELCOME TO ELK STACK TUTORIAL";
	}

}
