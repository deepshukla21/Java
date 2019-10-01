package com.bridgelabz.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
		Hello obj = context.getBean(Hello.class);
		obj.sayHello();
	}

}
