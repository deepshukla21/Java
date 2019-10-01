package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beanlife.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getName());
		((AbstractApplicationContext) context).close();
		
		
	}

}
