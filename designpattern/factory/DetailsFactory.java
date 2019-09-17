package com.bridgelabz.designpattern;

public class DetailsFactory {
	
    public static Details getDetails(String type , int id, String name) {
    	if("Employee".equalsIgnoreCase(type)) {
    		return new Employee(id , name);
    	}
    	if("Employer".equalsIgnoreCase(type)) {
    		return new Employer(id , name);
    	}
    	return null;
    }
}
