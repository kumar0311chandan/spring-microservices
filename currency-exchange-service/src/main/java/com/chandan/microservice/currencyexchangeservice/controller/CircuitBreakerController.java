package com.chandan.microservice.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;


@RestController
public class CircuitBreakerController {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
//	@Retry(name="default")
//	@Retry(name = "sample-api", fallbackMethod = "hardcodedResponse")
//	@CircuitBreaker(name = "default", fallbackMethod = "hardcodedResponse")
//	@RateLimiter(name ="default")
	@Bulkhead(name = "sample-api")
	public String sampleApi() {
		
		logger.info("<----Sample API Called----->");
		ResponseEntity<String> entity = new RestTemplate().getForEntity("http://localhost:8080/dummyapi", String.class);
		return entity.getBody();
	}
	
	public String hardcodedResponse(Exception ex) {
		return "fallback-response";
	}
	

}
