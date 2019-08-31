/******************************************************************************
 *  Purpose: Taking a command-line argument n and prints a table of the powers of 2
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

public class PowerOfTwo {
	public static void main(String[] args) {
		String argument = args[0];
		int n = Integer.parseInt(argument);
		// using Math.pow() function for printing table
		for (int i = 1; i <= n ; i++ ) {
			System.out.println((int)Math.pow(2, i));
		}
		
	}

}
