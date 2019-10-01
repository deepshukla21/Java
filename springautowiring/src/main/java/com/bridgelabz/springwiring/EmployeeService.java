package com.bridgelabz.springwiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class EmployeeService {
	
	
	private Employee employee;
    EmployeeService(){
    	System.out.println("Deep");
    }
    
	EmployeeService(Employee employee){
		this.employee = employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return ("Service : " + employee.toString() );
				
	}

}
