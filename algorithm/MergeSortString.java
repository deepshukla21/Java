/******************************************************************************
 *  Purpose: Sorting of strings using merge sort algorithm.
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Arrays;

public class MergeSortString {
	
	public static void mergeSort(String[] array) {
		
		int length = array.length;
		// If array has only one element then no sorting is required hence return
		if(length < 2) {
			return;
		}
		else {
			int mid = length / 2;
			String[] left_array = new String[mid];
			String[] right_array = new String[length - mid];
			
			// Inserting element into left sub array
			for(int i = 0; i < mid ; i++) {
				left_array[i] = array[i];
			}
			// Inserting element into right sub array
			for(int j = mid; j < length; j++) {
				right_array[j - mid] = array[j]; 
			}
			
			// Recursively calling the left sub array till it will be divided into arrays containing 1 element only
			mergeSort(left_array);
			mergeSort(right_array);
			
			// Merge the sorted array
			mergeSortedArray(array,left_array,right_array);
			
		}
	}
   
	// Function to merge the sorted array
	public static void mergeSortedArray(String[] array, String[] left_array, String[] right_array) {
		
		int left = left_array.length;
		int right = right_array.length;
		int i = 0 ; // Initial index of left sub array
		int j = 0 ; // Initial index of right sub array
		int k = 0; // Initial index of resulted merged array
		
		while(i < left && j < right) {
			if(left_array[i].compareTo(right_array[j]) < 0) {
				array[k] = left_array[i];
				k++;
				i++;
			}
			else {
				array[k] = right_array[j];
				k++;
				j++;
			}
		}
		// If left overs are there in left array
		while(i < left) {
			array[k] = left_array[i];
			i++;
			k++;
			
		}
		// If left overs are there in right array
		while(j < right) {
			array[k] = right_array[j];
			j++;
			k++;
		}
		
	}


/*
 * The main function is written to test MergeSortString class
 */
	public static void main(String[] args) {
		//String[] array = {"be", "The", "Change", "you", "Deep", "Deepa", "Deepak"};
		String[] array = {"34", "55", "555","121","76"};
		mergeSort(array);
		System.out.println("Sorted Array:" + Arrays.toString(array));
		
	}
}

