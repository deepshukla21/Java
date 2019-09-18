package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.util.Set;

public class StockPortfolio {
	HashMap<String, Stock> map;
	private List<Transaction> txnList;
	private double netTxnResult;
	private double portfolioValue;

	StockPortfolio() {
		this.map = new HashMap<String, Stock>(); 
		this.txnList = new ArrayList<Transaction>();
	}
	
	/*
	 * @purpose : Add the stock object in HashMap, before adding it will check if object is already present in map
	 */
	
	public void add(String symbol, int numStocks, double unitPrice) {
		Stock curStock;
		if(this.map.containsKey(symbol)) {
		  System.out.println("Stock is already present.");
		  return;
		} else {
		  curStock = new Stock();
		  curStock.add(symbol, numStocks, unitPrice);
		  this.map.put(symbol, curStock);
		}
	}
	
	public void add(Stock stock) {
		if(map.containsKey(stock.getStockName())) {
			System.out.println("Stack is already present");
		}
		else {
			map.put(stock.getStockName(), stock);
		}
	}
	
	/*
	 * @purpose : Update the stock object in HashMap, before adding it will check if object is already present in map
	 */	
	
	 public void update(String symbol, int numStocks, double unitPrice, char tradeType) {
		 Transaction curTxn = new Transaction();
		 Stock curStock;
		 
		 curTxn.add(symbol, numStocks, unitPrice, tradeType);

		 if(this.map.containsKey(symbol)) {
			 curStock = this.map.get(symbol);
			 
			 //Create a transaction.
			 
			 //Update the stock appropriately as per buy or sell
			 if(tradeType == 'B') {
				 curStock.buyStock(numStocks, unitPrice);
			 } else {
				 curStock.sellStock(numStocks);
			 }
			 
			 //Add the transaction to the list
			 txnList.add(curTxn);
			 
	     } else {  //The stock is not present already.
	    	 if(tradeType == 'S') {
	    		 System.out.println(symbol + " cannot be sold as its not in portfolio.");
	    		 return;
	    	 }
	    	 
	    	 this.add(symbol, numStocks, unitPrice);
	    	 txnList.add(curTxn);	 
	     }
	 }
	
	
	/*
	 * @purpose : Display the content of HashMap
	 */
	public void display() {
		Set<Entry<String, Stock>> s = map.entrySet();
		for(Map.Entry<String, Stock> entry : s) {
			System.out.println("Value");
			System.out.println("Key = " + entry.getKey() + " " + " value " +  entry.getValue());
		}
	}
	
	private void storeStocks(String fileName) {
		String content = "";
		ObjectMapper mapper = new ObjectMapper();
		File file = new File(fileName);
		try(FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
		{
			// Write all the stock object present in HashMap to file
			 content = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.map);
			 bufferedWriter.write(content);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	private void storeTxn(String fileName) {
		String content = "";
		ObjectMapper mapper = new ObjectMapper();
		File file = new File(fileName);
		try(FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
		{
			// Write all the stock object present in HashMap to file
			 content = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.txnList);
			 bufferedWriter.write(content);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void storePortfolio(String fileName) {
		this.storeStocks(fileName + "_stocks.json");
		this.storeTxn(fileName + "_txn.json");
	}
	
	
	public void loadPortfolio(String fileName) {
		this.loadStocks(fileName + "_stocks.json");
		this.loadTxn(fileName + "_txn.json");
	}
	
	private void loadStocks(String fileName) {
		File file = new File(fileName);
		ObjectMapper mapper = new ObjectMapper();

		try(FileReader fileReader = new FileReader(file);
				BufferedReader bufferedWriter = new BufferedReader(fileReader))
		{
			this.map = mapper.readValue(file, new TypeReference<HashMap<String ,Stock>>() {});
          
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private void loadTxn(String fileName) {
		File file = new File(fileName);
		ObjectMapper mapper = new ObjectMapper();

		try(FileReader fileReader = new FileReader(file);
				BufferedReader bufferedWriter = new BufferedReader(fileReader))
		{
			this.txnList = mapper.readValue(file, new TypeReference<List<Transaction>>() {});
          
		} catch (IOException e) {
			e.printStackTrace();
		}

	}	
	public double getTotalValue() {
		this.portfolioValue = 0;
		
		map.forEach((symbol, objStock) -> {
			this.portfolioValue += objStock.getTotalPrice();
		});
		
		return this.portfolioValue;
	}
	
	public void displayTransaction() {
		System.out.println("-----------------------------------------------");
		System.out.print(String.format("%-10s", "Symbol"));
		System.out.print(String.format("%-10s", "Quantity"));
		System.out.print(String.format("%-10s", "Unit Price"));
		System.out.print(String.format("%-10s", "Trade Type"));
		System.out.print("Txn Time\n");
		System.out.println("-----------------------------------------------");

		this.netTxnResult = 0;
		
		txnList.forEach((txn) -> {
			System.out.println(txn.getPrettyTxn());
			
			//Compute the transaction value
			this.netTxnResult += txn.getTotalTxnValue();

		});
		
		System.out.println("-----------------------------------------------");
		System.out.println("Today's transaction value: " + this.netTxnResult);

	}
	
}
