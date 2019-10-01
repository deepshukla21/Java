package com.bridgelabz.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class ConfigureBeanSingleton {
	
	@Bean
	@Scope("singleton")
	public Singleton singleton() {
		return new Singleton();
	}
	

}
