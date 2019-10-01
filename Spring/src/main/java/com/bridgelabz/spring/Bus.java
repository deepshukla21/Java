package com.bridgelabz.spring;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {
	
	public void drive() {
		System.out.println("Driving a bus");
		
	}
}
