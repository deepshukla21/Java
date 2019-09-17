package com.bridgelabz.designpattern;

public class Employee extends Details{
	private int id;
	private String name;
	
	Employee(int id , String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
