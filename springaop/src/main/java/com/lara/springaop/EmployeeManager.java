package com.lara.springaop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
	
	public void callEmployee() {
		System.out.println("Employee called by Manager");
	}

}
