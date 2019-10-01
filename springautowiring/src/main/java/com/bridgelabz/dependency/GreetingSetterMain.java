package com.bridgelabz.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetingSetterMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(GreetingConfig.class);
		GreetingCard card = context.getBean(GreetingCard.class);
		Greeting greet = card.getGreeting();
		System.out.println(greet.getGreeting());
	}

}
