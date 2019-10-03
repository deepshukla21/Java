package com.lara.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeManager manager = context.getBean(EmployeeManager.class);
		manager.callEmployee();
		
	}

}
 