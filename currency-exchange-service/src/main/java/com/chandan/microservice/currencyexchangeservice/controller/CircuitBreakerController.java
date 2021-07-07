package com.chandan.microservice.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;


@RestController
public class CircuitBreakerController {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
	@Retry(name="default")
	public String sampleApi() {
		
		logger.info("<----Sample API Called----->");
		ResponseEntity<String> entity = new RestTemplate().getForEntity("http://localhost:8080/dummyapi", String.class);
		return entity.getBody();
	}
	

}
