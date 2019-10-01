package com.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	
	private String name;
	
	public Employee() {
		System.out.println("Default constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }
     
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked...");
    }
}
