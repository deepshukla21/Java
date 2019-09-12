package com.bridgelabz.oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
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
	
}
