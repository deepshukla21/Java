package com.bridgelabz.springwiring;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowireByType {
	
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
