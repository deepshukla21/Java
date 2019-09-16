package com.bridgelabz.oops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;




public class Inventory{
	private	List<Cereals> list = new ArrayList<Cereals>();
	private	double total;
	private JSONParser parser= new JSONParser();
	private String inventoryCategory ;
	
	Inventory(String category){
		this.inventoryCategory = category;
	}
	
	public void addToInventory(String name, double quantity, double price, String category) {
		if(!(list.contains(name))){
			Cereals item = new Cereals();
			item.setName(name);
			item.setQuantity(quantity);
			item.setPricePerKg(price);
			item.setCategory(category);
			list.add(item);
		}
		else {
			System.out.println("Value is already present");
		}
	}
	
	public void display() {
		list.forEach((item)->{
			System.out.println("Name :" + item.getName());
			System.out.println("Quantity :" + item.getQuantity());
			System.out.println("Price per kg :" + item.getPricePerKg());			
		});	
		System.out.println("Total Value :" + getTotal());
	}
	
	private	void totalValue(){
	this.total = 0;
	list.forEach((item)->{
		this.total += item.getQuantity() * item.getPricePerKg();
	});
		
	}
	
	public double getTotal() {
    totalValue();
	return total;
	}
	
	public List getInventory() {
		return this.list;
	}
	
//	public void writeJson(String fileName, boolean append) {
//		
//		if(list.isEmpty())
//			return;
//		
//		File file = new File(fileName);
//
//			try(FileWriter fileWriter = new FileWriter(file, append);
//					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
//			{
//		
//				String content = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
//				bufferedWriter.write(content);
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//	}

	
	
	public  void loadInventory(String fileName) {
	JSONArray jsonArray;
	try 
	{
		jsonArray=(JSONArray)parser.parse(new FileReader(fileName));
		
		for (Object object : jsonArray) {
			
			Cereals itemlist= new Cereals();
			
			JSONObject obj=(JSONObject) object;
			
			//System.out.println(obj);
			
			String category= (String) obj.get("category");
			itemlist.setName(category);
			
			String name=(String) obj.get("name");
			itemlist.setName(name);
			
			double weight= (double) obj.get("quantity");
			itemlist.setQuantity(weight);
			
			double price=(double) obj.get("pricePerKg");
			itemlist.setPricePerKg(price);
			
			if(category.equalsIgnoreCase(inventoryCategory))	
				list.add(itemlist);				
		}		
	} 
	catch (Exception e) {	
		e.printStackTrace();
	}
   }
}
	