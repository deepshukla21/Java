/******************************************************************************
 *  Purpose: Print the nth harmonic value for command line argument N
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

public class HarmonicSumValue {
	public static void main(String[] args) {
		String argument = args[0];
		int N = Integer.parseInt(argument);
		double sum = 0;
		if ( N != 0) {
		 for (int i = 1; i <= N ; i++ ) {
			sum = sum + (double) 1/i; 
		 }
		System.out.println(sum);
		}
		else {
			System.out.println("Please enter positive integer greater than zero");
		}
	}

}
