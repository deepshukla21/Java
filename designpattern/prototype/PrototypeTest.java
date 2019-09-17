package com.bridgelabz.designpattern;

import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) {
		
		Students student = new Students();
		student.addStudent();
		Students firstStudent = null;
		Students secondStudent = null;
		/// Using clone method to get student object
		try {
			firstStudent = (Students) student.clone();
			secondStudent = (Students) student.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		List<String> list = firstStudent.getStudents();
		list.remove("Deep");
		List<String> list1 = secondStudent.getStudents();
		list1.remove("Prachi");
		
		System.out.println("Original Student List :" + student.getStudents());
		System.out.println("First list :" + list);
		System.out.println("Second list : " + list1);
	}

}
