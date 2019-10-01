package com.bridgelabz.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("scopes.xml");
		Singleton obj = (Singleton) context.getBean("singleton");
		System.out.println(obj.hashCode());
		System.out.println(obj.getName());
		Singleton obj1 = (Singleton) context.getBean("singleton");
		System.out.println(obj1.hashCode());
		
	}

}
/* Scope Singleton
1076496284 -- hqashcode
Deep
1076496284 -- hashcode
 */

