package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("employee");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp.getName());
		((AbstractApplicationContext) context).close();
  }

}
