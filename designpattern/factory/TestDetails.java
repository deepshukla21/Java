package com.bridgelabz.designpattern;

public class TestDetails {
	
	public static void main(String[] args) {
		
		Details employee = DetailsFactory.getDetails("Employee", 101, "Deep");
		Details employer = DetailsFactory.getDetails("Employer", 1001, "Barclays");
		
		System.out.println("Details of Employee " + employee.toString());
		System.out.println(" Details of Employer " + employer.toString());
	}

}
