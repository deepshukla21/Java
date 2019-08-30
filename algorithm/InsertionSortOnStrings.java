/******************************************************************************
 *  Purpose: Sorting of a string array using insertion sort method present in Utility class 
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSortOnStrings {
	public static void main(String[] args) {
		// Taking input from user for string list
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size = sc.nextInt();
		String[] array = new String[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the element on index " + i);
			array[i] = sc.next();
		}
		System.out.println("Sorted result printed below :");
		// Calling utility class method for sorting
		Utility.insertionSortString(array);
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
