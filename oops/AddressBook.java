package com.bridgelabz.oops;

import java.util.List;

public interface AddressBook {
	
	void addPerson(Person person);
	List<Person> editPerson(String name);
	void deletePerson(String name);
	List<Person> sortByLastName(List<Person> list);
	List<Person> sortByzipCode(List<Person> list);
	void display(List<Person> list);
}


