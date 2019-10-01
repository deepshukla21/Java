package com.bridgelabz.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class GreetingCard {
	
	private Greeting greeting;

	public Greeting getGreeting() {
		return greeting;
	}
    public GreetingCard() {
		System.out.println("Default");
	}
    
    // for setter injection
//    @Autowired
//	public void setGreeting(Greeting greeting) {
//		this.greeting = greeting;
//	}
    
	 /*this is for constructor injection*/
//	@Autowired
//    public GreetingCard(Greeting greeting) {
//    	this.greeting = greeting;
//    }
    
	@Autowired
	public GreetingCard(Greeting greeting) {
    	this.greeting = greeting;
    }

}
