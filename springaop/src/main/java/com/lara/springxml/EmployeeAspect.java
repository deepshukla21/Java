package com.lara.springxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	
	@Before("execution(public void callEmployee())")
	public void isEmployee() {
		
		System.out.println("Deep is employee");
	}

}
