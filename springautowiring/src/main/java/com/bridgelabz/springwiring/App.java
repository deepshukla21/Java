package com.bridgelabz.springwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        EmployeeService es = (EmployeeService) context.getBean("employeeservice");
        System.out.println(es);
        
    }
}
