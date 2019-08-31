/******************************************************************************
 *  Purpose: Finding the prime factors of a number 
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		// Finding prime factors of number
		for ( int i = 2;  i <= number ;) {
			if ( number % i == 0) {
				System.out.print(i + "," );
				number = number / i;
			}
			else {
				i ++;
			}
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
