/******************************************************************************
 *  Purpose: Reading the text from file, manipulate the text and save it back to file using
 *           LinkedList
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    05-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedList {
   public static void main(String[] args) {
   File file = new File("deep.txt");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the content you want to add in file");
   String content = sc.nextLine();
   String read_content ;
   String[] words = new String[(int)file.length()];
   // Write the content in file
   try(FileWriter fileWriter = new FileWriter(file);
	   BufferedWriter bufferedWriter = new BufferedWriter(fileWriter );
	   FileReader fileReader = new FileReader(file);
	   BufferedReader bufferedReader = new BufferedReader(fileReader)){
	   bufferedWriter.write(content);
	   // Close the file after writing so that content will reflected in file
	   bufferedWriter.close();
	   // Reading the content from file
	   read_content = bufferedReader.readLine();
	   // Close the file after reading
	   bufferedReader.close();
	   System.out.println(read_content);
	// Reading content from file and splitting into words array
	   words = read_content.split("\\s+");
	   
   }catch(IOException ex) {
	   ex.printStackTrace();
   }
   LinkedList<String> list = new LinkedList<String>();
   for(int i = 0; i < words.length; i++) {
	   list.add(words[i]);
   }
   list.read();
   System.out.println("Enter the word you want to search in list");
   String key = sc.next();
   boolean keyFound = list.search(key);
   if(keyFound) {
	   list.remove(key);
   }
   else {
	   list.add(key);
   }
   list.read();
  
   try(FileWriter fileWriter = new FileWriter(file);
	   BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	   FileReader fileReader = new FileReader(file);
	   BufferedReader bufferedReader = new BufferedReader(fileReader)){
	    bufferedWriter.write(list.toString());
		bufferedWriter.close();
		System.out.println("Final content after modification in file is");
		String fileContent = bufferedReader.readLine();
		System.out.println(fileContent);
		bufferedReader.close();
	   
   }catch(IOException ex) {
	   ex.printStackTrace();
   }
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
