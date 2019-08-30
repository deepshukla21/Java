/******************************************************************************
 *  Purpose: Finding the number user has choose from a given range of numbers.
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class FindMyNumber {
	// Function to find the number
	public static void findNumber(int range) {
		
		// Scanner object created by which we can take input at run time     
		 Scanner sc = new Scanner(System.in);
		 // Range between which user has to think of a number
		 int end_range = range - 1;
		 int start_range = 0;
		 
		 while(start_range <= end_range) {
			 int guess = (start_range + end_range) / 2;
			 System.out.println(guess + " is your number , type yes or no ");
			 String answer = sc.next();
			 
			 if(answer.equalsIgnoreCase("yes")) {
				 System.out.println("yeahh you got your number");
				 break;
			 }
			 else {
				 System.out.println("your number is greater than " + guess + " type yes or no");
				 answer = sc.next();
				 if(answer.equalsIgnoreCase("yes")) {
					 start_range = guess + 1;
				 }
				 else if(answer.equalsIgnoreCase("no")){
					 end_range = guess - 1;
				 }
			 }
		 }
		 // Condition to check if user has entered input which is out of range
		 if(start_range > end_range) {
			 System.out.println("Sorry dear! your choice is out of range");
		 }
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
	/*
	 * The main function is written to test FindMyNumber class
	 */
	public static void main(String[] args) {
		
	// Take range as command line argument 
	int range = Integer.parseInt(args[0]);
	
	// Call the function and pass the value of range
	findNumber(range);
	
  }
}
