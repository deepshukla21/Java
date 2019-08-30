package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchString {
	// To search a particular element in given array
	public static void binarySearchString(String[] array, int array_length, String key) {
	      
		// Declaring variable to define search space
		int start = 0;
		int end = array_length -1;
		
		/* End condition for recursion as we are recursively reducing the search space by adjusting
		start and end pointer*/
		while(start <= end) {
			 int mid = (start + end) / 2;
			 
			// Checking
			if(key.equals(array[mid])) {
				System.out.println("Your element " + key + " found at index :" + mid);
				break;
			}
			else if(key.compareTo(array[mid]) < 0) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		   
		}
		// Condition if element not present
		if(start > end) {
			System.out.println("Sorry your element " + key + " not found");
		}
	}
/*
 * The main function is written to test BinarySearchString class
 */
	public static void main(String[] args) {
	 String[] array = {"lara", "Deep", "Abc","test"};
	 // Sorting of array
	 Arrays.sort(array);
	 System.out.println(Arrays.toString(array));
	 int array_length = array.length;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the key you want to search :");
	 String key = sc.next();
	 // Before calling binary search function please ensure your array as sorted else search will give junk value
	 binarySearchString(array, array_length,key);
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
