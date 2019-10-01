package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
		Book book = (Book) context.getBean("book");
		System.out.println(book.getName());
		((AbstractApplicationContext) context).close();
  }
}
