/******************************************************************************
 *  Purpose: Checking if one string is anagram of other given string or not.
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    28-08-2019
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String original = sc.next();
		System.out.println("Enter another string with whom you want to check");
		String check = sc.next();
		// Converting both string into character array
		char[] originalArray = original.toCharArray();
		char[] checkArray = check.toCharArray();
		// sort both the arrays
		Arrays.sort(originalArray);
		Arrays.sort(checkArray);
		// Convert array into string
		String originalSort = new String(originalArray);
		String checkSort = new String(checkArray);
		// Checking if original string is equal to sorted string or not
		if(originalSort.equals(checkSort)) {
			System.out.println(original + " and " + check + " both are anagram of each other");
		}
		else {
		 System.out.println(original + " and " + check + " both are not anagram of each other");
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
