package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static Object createRiceObject() {	
	System.out.println("Enter the name of rice");
	String name = sc.next();
	System.out.println("Enter the weight in Kg");
	double weight = sc.nextDouble();
	System.out.println("Enter the price of rice");
	double price = sc.nextDouble();
	// Creating a Rice object and setting value to every class field
	Rice object = new Rice();
	object.setName(name);
	object.setWeight(weight);
	object.setPrice(price);
	return object;
	}
	public static Object createWheatObject() {	
	 System.out.println("Enter the name of Wheat");
	 String name = sc.next();
	 System.out.println("Enter the weight in Kg");
	 double weight = sc.nextDouble();
	 System.out.println("Enter the price of Wheat");
	 double price = sc.nextDouble();
	 // Creating a Wheat object and setting value to every class field
	 Wheat object = new Wheat();
	 object.setName(name);
	 object.setWeight(weight);
	 object.setPrice(price);
	 return object;
	}
	public static Object createPulsesObject() {	
	 System.out.println("Enter the name of Pulses");
	 String name = sc.next();
	 System.out.println("Enter the weight in Kg");
	 double weight = sc.nextDouble();
	 System.out.println("Enter the price of Pulses");
	 double price = sc.nextDouble();
	 // Creating a Rice object and setting value to every class field
	  Pulses object = new Pulses();
	 object.setName(name);
	 object.setWeight(weight);
	 object.setPrice(price);
	 return object;
	}
	 
	public static void main(String[] args) {
		Inventory in = new Inventory();
		ObjectMapper mapper = new ObjectMapper();
//		in.display();
		System.out.println("Welcome to inventory management");
		System.out.println("Do you want to checkin any item yes or no");
		String reply = sc.next();
		while(reply.equalsIgnoreCase("yes")){
		System.out.println("Which item you want to check in , enter Rice or Wheat or Pulses");
		String choice = sc.next();
		if(choice.equalsIgnoreCase("Rice")) {
			Rice rice = (Rice) createRiceObject();
			in.addToList(rice,"Rice" );
			
		}
		else if(choice.equalsIgnoreCase("Wheat")) {
			Wheat wheat = (Wheat) createWheatObject();
			in.addToList(wheat,"Wheat" );
			
		}
		else if(choice.equalsIgnoreCase("Pulses")) {
			Pulses pulses = (Pulses) createPulsesObject();
			in.addToList(pulses,"Pulses" );
			
		} 
		else {
			System.out.println("Choice is not avaliable");
        }
		System.out.println("Do you want to checkin any other item yes or no");
		reply = sc.next();
	  }
		File file = new File("inventory.txt");
		String content = "";
		try(FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
		{
			// Write all the stock object present in HashMap to file
			 for(Entry<String, List<Object>> entry : in.map.entrySet())  
			{
			  List<Object> list = entry.getValue();
			  if(!list.isEmpty()) {
			  content = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(entry.getValue());
			  //System.out.println(entry.getValue());
			  
			  bufferedWriter.write(entry.getKey());
			  bufferedWriter.write(content);
			  bufferedWriter.newLine();
			  }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		in.display();
		System.out.println("==================================");
		
		// Closing resource
		try {
				if(sc != null) {
					sc.close();
					sc = null;
				}
			}catch(Exception ex) {
			 ex.printStackTrace();
			}	 
		
	}

}
