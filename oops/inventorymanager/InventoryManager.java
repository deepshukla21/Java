package com.bridgelabz.oops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManager {
	private Inventory rice;
	private Inventory wheat;
	private Inventory pulses;
	private ObjectMapper mapper = new ObjectMapper();

	
	InventoryManager(){
		this.rice = new Inventory("Rice");
		this.wheat = new Inventory("Wheat");
		this.pulses = new Inventory("Pulses");
	}
	
	public void add(String name, double quantity, double pricePerKg, String category) {
		if(category.equalsIgnoreCase("Rice")) {
		rice.addToInventory(name, quantity, pricePerKg, category);
		}
		if(category.equalsIgnoreCase("Wheat")) {
			wheat.addToInventory(name, quantity, pricePerKg, category);
		}
		if(category.equalsIgnoreCase("Pulses")) {
			pulses.addToInventory(name, quantity, pricePerKg, category);
		}
	}
	
	public double getTotal() {
		double inventoryTotal = rice.getTotal() + wheat.getTotal() + pulses.getTotal();
		return inventoryTotal;		
	}
	
	public void display() {
		rice.display();
		wheat.display();
		pulses.display();
		System.out.println("Total of Inventories :" + getTotal() );
	}
	
	/*public void writeJson(String fileName) {
		rice.writeJson(fileName, false);
		wheat.writeJson(fileName, true);
		pulses.writeJson(fileName, true);
	}*/
	public void readJson(String fileName) {
		rice.loadInventory(fileName);
		wheat.loadInventory(fileName);
		pulses.loadInventory(fileName);		
	}
	
	public void writeJson(String fileName) {
		List<Cereals> combinedInventory = new ArrayList<Cereals>();
		
		combinedInventory.addAll(rice.getInventory());
		combinedInventory.addAll(wheat.getInventory());
		combinedInventory.addAll(pulses.getInventory());
	
		File file = new File(fileName);

			try(FileWriter fileWriter = new FileWriter(file);
					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
			{
		
				String content = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(combinedInventory);
				bufferedWriter.write(content);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

	
	

}
