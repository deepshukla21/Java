package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.util.Set;

public class StockPortfolio {
	HashMap<String, Stock> map = new HashMap<String, Stock>();
	
	/*
	 * @purpose : Add the stock object in HashMap, before adding it will check if object is already present in map
	 */
	public void add(Stock stock) {
		if(map.containsKey(stock.getStockName())) {
			System.out.println("Stack is already present");
		}
		else {
			map.put(stock.getStockName(), stock);
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
	
	public void loadStocks(String fileName) {
		File file = new File(fileName);
		ObjectMapper mapper = new ObjectMapper();

		try(FileReader fileReader = new FileReader(file);
				BufferedReader bufferedWriter = new BufferedReader(fileReader))
		{
			map = mapper.readValue(file, new TypeReference<HashMap<String ,Stock>>() {});

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
