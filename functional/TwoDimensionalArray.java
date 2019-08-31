/******************************************************************************
 *  Purpose: Reading and printing two dimensional array 
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter number of cols");
		int cols = sc.nextInt();
		int array[] [] = new int[rows][cols];
		// Taking elements inside array
        for ( int i = 0; i < rows ; i++ ) {
			System.out.println("Enter the input");
			for ( int j = 0; j < rows ; j++ ) {
				 array[i][j] = sc.nextInt();
				 System.out.println("array["+i +"][" +j +"] = " + array[i][j]);
			}
        }
        // Printing the array
		for (int[] arr : array ){
			System.out.println(Arrays.toString(arr));
		}
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
