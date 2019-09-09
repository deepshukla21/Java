/******************************************************************************
 *  Purpose: Find prime numbers in range of 0 - 1000 and print in two dimensional array
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    8-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class PrimeTwoDimensionalArray {
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
	
	public static int[][] primeInRange() {
	    
	    int buf[] = new int[50]; //Buffer with 50 spaces
	    int primeArr[][] = new int[10][]; //10 rows, dynamically allocated columns.
	    int k;
	    
	    for(int i=0;i<10;i++) { 
	        k=0; //Reset the index of buffer to reuse it for current range.
	        
	        //Find the prime in range and store it into the buf
	        for(int j=(i*100);j < ((i*100)+100) ; j++) {
	            if(isPrime(j)){
	                buf[k] = j;               //Save the prime number to reusable buffer
	                k++;                      //Increment k for each prime number found.
	            }
	        }
	        
	        primeArr[i] = new int[k]; //Create a array of size k 
	        
	        for(int j=0;j<k;j++)
	          primeArr[i][j] = buf[j];         //Copy from buffer to main storage
	        
	    }
	    
	    return primeArr;
	}
	// Printing  array content
	public static void printArr(int primeArr[][]) {
	    for(int i=0;i<10;i++) {
	        System.out.println("Range: " + (i*100) + " - " + (i*100+100));
	        for(int j=0;j<primeArr[i].length;j++){
	            System.out.print(primeArr[i][j] + " ");
	        }
	       System.out.println("");
	       System.out.println("-----------------------------");

	        
	    }
	}
	// Main function to test PrimeTwoDimensional class
	public static void main(String[] args) {
	    int primeArr[][];
	    primeArr = primeInRange();
	    printArr(primeArr);
	}
}
