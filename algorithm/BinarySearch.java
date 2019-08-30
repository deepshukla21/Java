package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {	
	// To search a particular element in given array
	public static void binarySearch(int[] array, int array_length, int key) {
	      
		// Declaring variable to define search space
		int start = 0;
		int end = array_length -1;
		
		/* End condition for recursion as we are recursively reducing the search space by adjusting
		start and end pointer*/
		while(start <= end) {
			 int mid = (start + end) / 2;
			 
			// Checking
			if(key == array[mid]) {
				System.out.println("Your element " + key + " found at index :" + mid);
				break;
			}
			else if(key < array[mid]) {
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
	 * The main function is written to test BinarySearch class
	 */
	public static void main(String[] args) {
	 int[] array = {5, 9, 8, 4};
	 // Sorting of array
	 Arrays.sort(array);
	 System.out.println(Arrays.toString(array));
	 int array_length = array.length;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the key you want to search");
	 int key = sc.nextInt();
	 // Before calling binary search function please ensure your array as sorted else search will give junk value
	 binarySearch(array, array_length,key);
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
