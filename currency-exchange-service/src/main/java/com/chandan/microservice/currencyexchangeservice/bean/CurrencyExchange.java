package com.chandan.microservice.currencyexchangeservice.bean;

import java.math.BigDecimal;

public class CurrencyExchange {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionalMultiple;
	private String environment;
	
	public CurrencyExchange() {
		super();
	}
	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionalMultiple, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionalMultiple = conversionalMultiple;
		this.environment = environment;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionalMultiple() {
		return conversionalMultiple;
	}
	public void setConversionalMultiple(BigDecimal conversionalMultiple) {
		this.conversionalMultiple = conversionalMultiple;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

}
