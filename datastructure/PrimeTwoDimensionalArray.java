/******************************************************************************
 *  Purpose: Find prime numbers in range of 0 - 1000 and print in two dimensional array
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    8-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class PrimeTwoDimensionalArray {
	// Method to find prime number
	public static boolean isPrime(int number) {
		 boolean isPrime = true;
		 int divisible = 2;
		 if(number < 2) {
			 isPrime = false;
			 return isPrime;
		 }
	     // Check range from 2 to N/2 as anything greater than N/2 will be a multiple of 2. 
		 for(int i = divisible; i <= (number / 2); i++) {
			 if(number % i == 0) {
				 isPrime = false;
				 return isPrime;
			 }
		 }
		 return isPrime;
	}
	// Storing the prime number in 2D array
	public  static int[][] primeInRange() {
		int primeArray[][] = new int[10][100];
		
		int index = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 100; j++) {
				if(isPrime(index)) {
					primeArray[i][j] = index;
				}
			    index++;
			}
		}
		return primeArray;
	}
	 // Printing  array content
	public static void printArr(int primeArr[][]) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 100; j++) {
				if(primeArr[i][j] != 0)
					System.out.print(primeArr[i][j]+" ");
			}
			System.out.println();
		}
	}
//	// Main function to test PrimeTwoDimensional class
	public static void main(String[] args) {
	    int primeArr[][];
	    primeArr = primeInRange();
	    printArr(primeArr);
	}
}
