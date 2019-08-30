/******************************************************************************
 *  Purpose: Sorting of a integer array using bubble sort method present in Utility class 
 *
 *  @author  Deep
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args) {
	// Taking input from user for string list
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size :");
	int size = sc.nextInt();
	int[] array = new int[size];
	for(int i = 0; i < size; i++) {
		System.out.println("Enter the element on index " + i);
		array[i] = sc.nextInt();
	}
	System.out.println("Sorted list printed below:");
	// Calling utility class bubble sort method
	Utility.bubbleSort(array);
	// Close open resources
	try {
		if(sc != null) {
			sc.close();
		}
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
