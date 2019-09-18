package com.bridgelabz.oops;

import java.util.Scanner;

public class Client {
	 static Scanner sc = new Scanner(System.in);
	public static Cereals input() {
		Cereals cereal = new Cereals();
		System.out.println("Enter the category name you want to enter like Rice, Wheat or Pulses");
		String category = sc.next();
		cereal.setCategory(category);
		System.out.println("Enter the name of item");
		String name = sc.next();
		cereal.setName(name);
		System.out.println("Enter the quantity in kg");
		double quantity = sc.nextDouble();
		cereal.setQuantity(quantity);
		System.out.println("Enter the price per kg");
		double price = sc.nextDouble();
		cereal.setPricePerKg(price);
		return cereal;
	}
	public static void main(String[] args) {
//		Cereals cereal;
		InventoryManager manager = new InventoryManager();
//
//		System.out.println("Do you want to insert item in inventory enter yes or no");
//		String choice = sc.next();
//		while(choice.equalsIgnoreCase("yes")) {
//			cereal = input();
//			manager.add(cereal.getName(), cereal.getQuantity(), cereal.getPricePerKg(), cereal.getCategory());
//			System.out.println("Do you want to insert other item in inventory enter yes or no");
//			choice = sc.next();
//		}
		
		//manager.writeJson("inventory.json");
		manager.readJson("inventory.json");
		System.out.println("=================");
		manager.display();
				
	}
}
