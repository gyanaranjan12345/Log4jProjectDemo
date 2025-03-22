package com.gyana.Log4j.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyana.Log4j.Log4jProjectDemoApplication;

@RestController
public class Controller {

  static Logger log = LogManager.getLogger(Log4jProjectDemoApplication.class);

	@GetMapping("/gyana")
	public String test() {
		log.info("Controller executing...");
		return "Hello Gyana !!!!!!!!!!!!!! How ARE YOU????? ";
}
}