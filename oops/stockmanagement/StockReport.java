package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockReport {
	static Scanner sc = new Scanner(System.in);
	/*
	 * @purpose : Ask user for entering stock value 
	 * return type - Stock type 
	 */
	public static Stock enterStock() {	
		System.out.println("Enter the name of stock");
		String name = sc.next();
		System.out.println("Enter the number of stock");
		int number = sc.nextInt();
		System.out.println("Enter the price of one stock");
		int price = sc.nextInt();
		// Creating a stock object and setting value to every class field
		Stock stock = new Stock();
		
		//stock.setStockName(name);
		//stock.setUnitPrice(price);
		//stock.setNumberOfStock(number);
		//stock.setTotal_price(number, price);
		return stock;
	}
	// Main function to write the stock details in JSON file
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		StockPortfolio port = new StockPortfolio();
		//port.loadStocks("stock.json");
		port.display();
		/*Stock stock1=new Stock();
		System.out.println("Do you want to enter stock enter yes or no");
		String choice = sc.next();
		while(choice.equalsIgnoreCase("yes")) {
		 stock1 = enterStock();
		 // Adding stock to HashMap present in StockPortfolio class
		 port.add(stock1);
		 System.out.println("You want to enter one more stock enter yes or no ");
		 choice = sc.next();
		}*/
		// Open a file 
//		 String content = "";
//		File file = new File("stock.json");
//		try(FileWriter fileWriter = new FileWriter(file);
//				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
//		{
//			// Write all the stock object present in HashMap to file
//			 content = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(port.map);
//			bufferedWriter.write(content);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	System.out.println("==================================");
//		HashMap<String, Stock> map = null;
//		File file = new File("stock.json");
//
//		try(FileReader fileReader = new FileReader(file);
//				BufferedReader bufferedWriter = new BufferedReader(fileReader))
//		{
//			map = mapper.readValue(file, new TypeReference<HashMap<String ,Stock>>() {});
//		    port.map.putAll(map);
//		    System.out.println(port.map);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
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
