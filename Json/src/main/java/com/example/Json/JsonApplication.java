package com.example.Json;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Json.service.EmployeeServiceResponseEntity_H2;

@SpringBootApplication
public class JsonApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(JsonApplication.class, args);
		Logger log = LoggerFactory.getLogger(JsonApplication.class);
		System.out.println("Welcome to SpringBoot Application11");
		log.info("INFO...JsonApplication CLASS");
		log.error("ERROR...JsonApplication CLASS");
		log.trace("TRACE...JsonApplication CLASS");
		log.debug("DEBUG...JsonApplication CLASS");
		log.warn("WARN...JsonApplication CLASS");
		
		
		//fatal-->error-->warn--->info-->debug--trace
	}

}
