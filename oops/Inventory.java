package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Inventory {
	HashMap<String, List<Object>> map = new HashMap<String,List<Object>>();
	
	Inventory(){
		for(int i = 0 ;i < 3 ; i++) {
			List<Object> list = new ArrayList<Object>();
			if( i == 0) {
			map.put("Rice", list);
			}
			if( i == 1) {
				map.put("Wheat", list);
				}
			if( i == 2) {
				map.put("Pulses", list);
				}
			}
		  
	     }	  
	public void display() {
		System.out.println("Map size" + map.size());
			Set<Entry<String, List<Object>>> s = map.entrySet();
			for(Entry<String, List<Object>> entry : s) {
				System.out.println("Value");
				System.out.println("Key = " + entry.getKey() + " " + " value " +  entry.getValue());
			}
		}
	
	public void addToList(Object myObject, String name) {
		List<Object> itemList = map.get(name);
		if(!(itemList.contains(myObject))) {
			itemList.add(myObject);
		}
		else {
			System.out.println("Item is already present");
		}
	}
}
