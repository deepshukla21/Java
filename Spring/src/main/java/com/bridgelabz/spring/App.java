package com.bridgelabz.spring;

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
        
        // for xml config    
      /*  Vehicle obj = (Vehicle) context.getBean("Vehicle");
        System.out.println(obj.hashCode());
        Vehicle obj1 = (Vehicle) context.getBean("Vehicle");
        System.out.println(obj.hashCode());
        obj.drive();*/
        
       
      // For annotaion based configuration
      /*  Vehicle obj = (Vehicle) context.getBean("car");
        obj.drive();
        Vehicle obj1 = (Vehicle) context.getBean("bus");
        obj1.drive();
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());*/
        
        Car car = (Car)context.getBean("car");
        car.drive();
        
        
    }
}
