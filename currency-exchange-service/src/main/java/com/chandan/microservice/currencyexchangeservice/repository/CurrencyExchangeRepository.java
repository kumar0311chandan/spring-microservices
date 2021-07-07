package com.chandan.microservice.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandan.microservice.currencyexchangeservice.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

	public CurrencyExchange findByFromAndTo(String from, String to);
	
	
}
