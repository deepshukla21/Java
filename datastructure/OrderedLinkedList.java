/******************************************************************************
 *  Purpose: Reading the text from file, manipulate the text and save it back to file using
 *           LinkedList in ordered way
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    06-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OrderedLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text you want to write into file");
		String content = sc.nextLine();
		File file = new File("data.txt");
		String read_content = "";
		String[] words = new String[(int)file.length()];
		// Writing the text into file
		try(FileWriter fileWriter = new FileWriter(file);		
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
			bufferedWriter.write(content);			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		// Reading the content from file
		try(FileReader fileReader = new FileReader(file);		
			BufferedReader bufferedReader = new BufferedReader(fileReader)){
			read_content = bufferedReader.readLine();
			System.out.println(read_content);
			words = read_content.split("\\s+");
			}catch(IOException ex) {
				ex.printStackTrace();
		}
		
		System.out.println("Data after sorting");
		System.out.println(Arrays.toString(words));
	    // Ordered LinkedList
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < words.length; i++) {
			list.add(Integer.parseInt(words[i]));
		}
		// Sort the list
		list.sort();
		list.read();
		System.out.println("Enter the number you want to search in the list");
		int key = sc.nextInt();
		boolean keyFound = list.search(key);
	    if(keyFound) {
		   list.remove(key);
	    }
	    else {
		   list.add(key);
	    }
	    // Again sort the list before adding it to file
	    list.sort();
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
//34 55 56 121 67 87
