package com.bridgelabz.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopesTest {
	
	public static void main(String[] args) {
		
		// Using java configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureBeanSingleton.class);
		
		// For prototype scope
		ApplicationContext contextPro = new AnnotationConfigApplicationContext(ConfigureBeanPrototype.class);
		 
		Singleton obj = context.getBean(Singleton.class);
		System.out.println("Singleton Scope obj " + obj.hashCode());
		Singleton obj1 = context.getBean(Singleton.class);
		System.out.println("Singleton Scope  obj " + obj1.hashCode());
		
		System.out.println("===================");
		
		Singleton object = contextPro.getBean(Singleton.class);
		System.out.println("Prototype Scope  object " +object.hashCode());
		Singleton object1 = contextPro.getBean(Singleton.class);
		System.out.println("Prototype Scope  object " + object1.hashCode());
		
	}

}
