package com.lara.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTestXml {
	
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");
		manager.callEmployee();
		
	}


}
