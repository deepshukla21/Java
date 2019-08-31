/******************************************************************************
 *  Purpose: Taking an integer array and counts the number of triplets from array
 *           that sum to exactly 0.
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

public class DistinctTriplets {
	public static void main(String[] args) {
	  int[] array = {0, -5, 4, 2, 1};
	  int distinctCount = 0;
		for(int i = 0; i < array.length; i++ ) {
			for(int j = i + 1; j < array.length; j++  ) {
				for(int k = j + 1; k < array.length ; k++ ) {
					if(array[i] + array[j] + array[k] == 0) {
						distinctCount ++;
						System.out.println(array[i] + " " +array[j] + " " + array[k]);
					}
				}
			}
		}
		System.out.println("Distinct triplets count is :" + distinctCount);
	}
}
