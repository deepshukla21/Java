package com.bridgelabz.designpattern;

public class Student {
	static Class s;
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.getClass());
		
		Class si = Student.class;
		System.out.println(si);
	}

}
