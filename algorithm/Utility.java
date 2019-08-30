/******************************************************************************
 *  Purpose: Incorporating all sorting, searching algorithms in one class, so that it can be used where ever
 *           required 
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Arrays;

public class Utility {
	// Bubble sort for sorting integer array in ascending order
  public static void bubbleSort(int[] array) {
	  for(int i = 0; i < array.length; i++) {
		  // Iterating the loop till largest element in the array comes to the right most position
		  for(int j = 0 ; j < array.length - 1 - i; j++) {
			  // swaping the values 
			  if(array[j] > array[j + 1]) {
				  array[j] = array[j] + array[j + 1];
				  array[j + 1] = array[j] - array[ j + 1];
				  array[j] = array[j] - array[ j + 1];      			  
			  }
		  }
	  }
	  // Printing the sorted array
	  System.out.println(Arrays.toString(array));
  }
	  
  // Bubble sort for sorting string array in ascending order
  public static void bubbleSortString(String[] array) {
	  for(int i = 0; i < array.length; i++) {
		  // Iterating the loop till largest element in the array comes to the right most position
		  for(int j = 0 ; j < array.length - 1 - i; j++) {
			  // swaping the values 
			  if(array[j].compareTo(array[j + 1]) > 0) {
				  String temp = array[j];
				  array[j] = array[ j + 1];
                  array[ j + 1] = temp;						  
			  }
		  }
	  }
	  // Printing the sorted array
	  System.out.println(Arrays.toString(array));
  }
	  

  // Insertion sort for sorting integer array in ascending order
  public static void insertionSort(int[] array) {
	  for(int i = 0; i < array.length; i ++) {
		  int minimum = array[i];
		  int j = i;
		  
		  while(j > 0 && minimum < array[j- 1]) {
			 array[j] = array[ j - 1];
			 j = j - 1;		  
		  }
		  array[j] = minimum;
	  }
	  System.out.println(Arrays.toString(array));
  }
  
  //Insertion sort for sorting string array in ascending order
  public static void insertionSortString(String[] array) {
	  for(int i = 0; i < array.length; i ++) {
		  String minimum = array[i];
		  int j = i;
		  
		  while(j > 0 && minimum.compareTo(array[j - 1]) < 0) {
			 array[j] = array[ j - 1];
			 j = j - 1;		  
		  }
		  array[j] = minimum;
	  }
	  System.out.println(Arrays.toString(array));
  }
	 
  // Binary search to find a  particular string in array
  public static void binarySearchString(String[] array, int array_length, String key) {   
	// Declaring variable to define search space
	int start = 0;
	int end = array_length -1;
	
	/* Exit condition for recursion as we are recursively reducing the search space by adjusting
	start and end pointer*/
	while(start <= end) {
		 int mid = (start + end) / 2;
		 
		
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
  
  // Binary search to find a  particular int element in array
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
	 
   // Finding the day of week
   public static void day(int year, int mon, int date) {
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
    int y0 = year - (14 - mon) / 12 ;
    int x = y0 + y0/4 - y0/100 + y0/400 ;
    int m0 = mon + 12 * ((14 - mon) / 12) - 2 ;
    int d0 = (date + x + 31 * m0 / 12) % 7 ;
    System.out.println("Date fall on " + days[d0]);	  
  }
 
  // Temperature Conversion from Celcius to Fahrenheit and vice verse
  public static void convertTemperature(String temperature) {
	 String degree_value = temperature.substring(0, temperature.length() - 1);
	 int degree = Integer.parseInt(degree_value);
	 char convention = temperature.charAt(temperature.length() - 1);
	 if(convention == 'C') {
		 int result = (degree * 9/5) + 32;
		 System.out.println("Temperature converted from Celcius to :" + result + "F");
	 }
	 else if(convention == 'F') {
		 double result = (degree  - 32) * 5/9 ;
		 System.out.println("Temperature converted from Fahrenheit to :" + result + "C");
	 }
	 else {
		 System.out.println(" Please enter temperature either in Celcius or Fahrenheit");
	 }
 }
	  

}
