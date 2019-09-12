package com.bridgelabz.oops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;

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
		stock.setStockName(name);
		stock.setUnitPrice(price);
		stock.setNumberOfStock(number);
		stock.setTotal_price(number, price);
		return stock;
	}
	// Main function to write the stock details in JSON file
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		StockPortfolio port = new StockPortfolio();
		Stock stock1=new Stock();
		System.out.println("Do you want to enter stock enter yes or no");
		String choice = sc.next();
		while(choice.equalsIgnoreCase("yes")) {
		 stock1 = enterStock();
		 // Adding stock to HashMap present in StockPortfolio class
		 port.add(stock1);
		 System.out.println("You want to enter one more stock enter yes or no ");
		 choice = sc.next();
		}
		// Open a file 
		File file = new File("stock.txt");
		try(FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
		{
			// Write all the stock object present in HashMap to file
			 for(Entry<String, Stock> entry : port.map.entrySet())  
			{
			String content = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(entry.getValue());
			bufferedWriter.write(content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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
