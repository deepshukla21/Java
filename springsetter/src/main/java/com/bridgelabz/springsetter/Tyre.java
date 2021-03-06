package com.bridgelabz.springsetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	
	private String name;
	
	@Autowired
	Tyre(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tyre = " + name ;
	}
	
	

}
