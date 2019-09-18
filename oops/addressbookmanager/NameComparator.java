package com.bridgelabz.oops;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

	public int compare(Person object1, Person object2) {
		
		return  object1.getLastName().compareTo(object2.getLastName());
	}	

}
