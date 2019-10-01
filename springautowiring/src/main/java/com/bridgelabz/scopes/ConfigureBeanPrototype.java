package com.bridgelabz.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigureBeanPrototype {
	
	@Bean
	@Scope("prototype")
	public Singleton singleton() {
		return new Singleton();
	}
}
