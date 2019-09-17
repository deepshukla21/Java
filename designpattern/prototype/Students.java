package com.bridgelabz.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable {
	private List<String> studentList ;
	
	Students(){
		studentList = new ArrayList<String>();
	}
	
	Students(List<String> list){
		this.studentList = list;
	}
	
	public void addStudent() {
		studentList.add("Deep");
		studentList.add("Prachi");
		studentList.add("Ruchi");
	}
	
	public List<String> getStudents(){
		return studentList;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for(String student : this.getStudents()) {
			temp.add(student);
		}
		return new Students(temp);
	}

}
