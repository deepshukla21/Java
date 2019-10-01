package com.bridgelabz.springwiring;

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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Employee is working good  " + name ;
	}
}
