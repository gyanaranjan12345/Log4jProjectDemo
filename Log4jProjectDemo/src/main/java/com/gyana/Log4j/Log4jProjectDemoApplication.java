package com.gyana.Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Log4jProjectDemoApplication {
	
	static Logger log = LogManager.getLogger(Log4jProjectDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jProjectDemoApplication.class, args);
		
		System.out.println("Gyana.......");
		
		//Level
		log.trace("This is  an trace msg");
		log.debug("This is  an trace msg");
		log.info("This is  an trace msg");
		log.warn("This is  an trace msg");
		log.error("This is  an trace msg");
		log.fatal("This is  an trace msg");
		log.trace("Hi This is Gyana");
		log.trace("Hi This is Gyana");
	}

}
