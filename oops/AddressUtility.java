package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressUtility {
	ObjectMapper mapper = new ObjectMapper();
	public void writeToFile(String fileName , List<Person> list) {
		File file = new File(fileName);
		try(FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
		{
			String json = "";
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
			bufferedWriter.write(json);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadFile(String fileName, List<Person> personList) {
		List<Person> list = null ;
		try(FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader))
		{
			list = mapper.readValue(fileName, new TypeReference<List<Person>>() {});
			personList.addAll(list);
			System.out.println("=============");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
