package com.springframework;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean , DisposableBean {
	
	private String name;
	
	Person(){
		System.out.println("Default constructor of person");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing method of person bean is invoked!");		
	}
	
	public void destroy() throws Exception {
		System.out.println("Destroy method of person bean is invoked!");
		
	}
}
