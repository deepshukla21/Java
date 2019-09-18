package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddressBookImplementation {
	public List<Person> personList;
	static Scanner sc = new Scanner(System.in);
	
	
	AddressBookImplementation(){
		personList = new ArrayList<Person>();		
	}
	
	public void addPerson() {
		
		Person person = new Person();
		System.out.println("Enter first name");
		String firstName = sc.nextLine();	
		person.setFirstName(firstName);
		
		System.out.println("Enter last name");
		String lastName = sc.nextLine();	
		person.setLastName(lastName);
		
		System.out.println("Enter phone number name");
		String phoneNumber = sc.nextLine();	
		person.setPhoneNumber(phoneNumber);
		
		Address address = new Address();
		System.out.println("Enter city");
		String city = sc.nextLine();
		address.setCity(city);
		
		System.out.println("Enter state");
		String state = sc.nextLine();
		address.setState(state);
		
		System.out.println("Enter zipCode");
		int zipCode = Integer.parseInt(sc.nextLine());
		address.setzipCode(zipCode);
		
		person.setAddress(address);
		personList.add(person);
				
	}
	
	public void display() {
		System.out.println(personList);
	}
	
	public void deletePerson(String name) {
		for(Person person : personList) {
			if(person.getFirstName().equals(name)) {
				personList.remove(person);
			}
			else {
				System.out.println(name + " is not available in file");
				return;
			}
		}
		
	}
	
	public List<Person> editPerson(String name) {
		for(Person person : personList) {
			if(person.getFirstName().equals(name))
			{	
				System.out.println("Enter the value for fields to be updated");
				Address address = new Address();
				System.out.println("Enter city");
				String city = sc.nextLine();
				address.setCity(city);
				
				System.out.println("Enter state");
				String state = sc.nextLine();
				address.setState(state);
				
				System.out.println("Enter zipCode");
				int zipCode = sc.nextInt();
				address.setzipCode(zipCode);
				person.setAddress(address);
				return personList;
			}
	 }
	 System.out.println("Sorry contact with name " + name + " is not presnt");
	 return personList;
  }
	
  public List<Person> sortByLastName(List<Person> list){
	  Collections.sort(list, new NameComparator());
	  return list;
  }
  
  public List<Person> sortByzipCode(List<Person> list){
	  Collections.sort(list, new zipComparator());
	  return list;
  }
  
  public void display(List<Person> list)
  {
	  for (Person person : list) {		
		System.out.println("First Name:- "+person.getFirstName()+" Last Name:- "+person.getLastName());
		System.out.println("Address:- "+person.getAddress());
		System.out.println("City:- "+person.getAddress().getCity()+" State:- "+person.getAddress().getState());
		System.out.println("zip code:- "+person.getAddress().getzipCode());
		System.out.println();
	  }
  }

	

}
