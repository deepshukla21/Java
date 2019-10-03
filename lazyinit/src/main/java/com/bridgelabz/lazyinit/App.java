package com.bridgelabz.lazyinit;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("lazyinit.xml");
		System.out.println("Fecting classes");
		//context.getBean("A");
		context.getBean("B");
    }
}
