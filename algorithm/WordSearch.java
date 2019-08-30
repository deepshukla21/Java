/******************************************************************************
 *  Purpose: To find particular element present in file or not.
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordSearch {
	public static void searchWord(String key) {  		
		// File object created
		 File file = new File("data.txt");
		 String file_content = "";
		 
		 // Resources closing in try parentheses JDK 1.7 feature
		 try(FileReader fin = new FileReader(file);
		     BufferedReader bin = new BufferedReader(fin)){
			 // Reading file content
			 file_content = bin.readLine();
			 String[] words = file_content.split(";");
			 System.out.println("Original list :" + Arrays.toString(words));
			 System.out.println("Sorted list :");
			 // Calling utility class sort function
			 Utility.insertionSortString(words);	
			 // Calling utility class search function
			 Utility.binarySearchString(words,words.length, key);
		 }
		 catch(IOException ex) {
			 ex.printStackTrace();
		 }
	}
   /*
 * The main function is written to test WordSearch class
 */
	public static void main(String[] args) {
      System.out.println("Enter the word you want to search in file :");
      Scanner sc = new Scanner(System.in);
      String key = sc.next();
      searchWord(key);
     // Closing resource
	 try {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	 }
	 catch(Exception ex) {
		ex.printStackTrace();
	}
  }

}
