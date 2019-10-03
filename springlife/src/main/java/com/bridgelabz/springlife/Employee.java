package com.bridgelabz.springlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method called");
	}

}
