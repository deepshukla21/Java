package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class MyMain {
    public static void main(String[] args) {
    	ObjectMapper mapper = new ObjectMapper();

		AddressBookImplementation book = new AddressBookImplementation();

//		book.addPerson();
//		
//		book.addPerson();
//		
		File file = new File("address.json");
//		try(FileWriter fileWriter = new FileWriter(file);
//			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
//		{
//			String json = "";
//			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book.personList);
//			bufferedWriter.write(json);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
		List<Person> list = null ;
		try(FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader))
		{
			list = mapper.readValue(file, new TypeReference<List<Person>>() {});
			book.personList.addAll(list);
			System.out.println("=============");
		} catch (IOException e) {
			e.printStackTrace();
		}
//		book.sortByLastName(book.personList);
//		book.sortByzipCode(book.personList);
//		
//		System.out.println(book.personList);
//		book.display(book.personList);
	    
	}
}
