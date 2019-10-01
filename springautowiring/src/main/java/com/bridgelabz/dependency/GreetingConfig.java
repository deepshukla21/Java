package com.bridgelabz.dependency;

import org.springframework.context.annotation.Bean;

public class GreetingConfig {
	
	@Bean
	public Greeting greeting() {
		return new Greeting();
	}
	
    /* for constructor injection
	@Bean
	public GreetingCard greetingCard(Greeting greeting) {
		return new GreetingCard(greeting);
	}*/
	
	// for setter injection
	@Bean
	public GreetingCard greetingCard(Greeting greeting) {
		return new GreetingCard(greeting());
	}
	

}
