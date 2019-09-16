package com.bridgelabz.oops;

import java.util.Comparator;

public class ZipComparator implements Comparator<Person> {

	public int compare(Person object1, Person object2) {
	
		return object1.getAddress().getzipCode() - object2.getAddress().getzipCode();
	}
}
