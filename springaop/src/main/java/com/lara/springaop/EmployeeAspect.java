package com.lara.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class EmployeeAspect {
	
	@After("execution(public void callEmployee())")
	public void isEmployee() {
		
		System.out.println("Deep is employee");
	}

}
