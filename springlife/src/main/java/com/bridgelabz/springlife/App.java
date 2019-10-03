package com.bridgelabz.springlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigEmployee.class);
    	
    	Employee emp = context.getBean(Employee.class);
    	emp.setName("Deep");
    	System.out.println("Employee is " + emp.getName());
    	((AbstractApplicationContext) context).close();
    }
}
