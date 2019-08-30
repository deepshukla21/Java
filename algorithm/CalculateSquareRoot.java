/******************************************************************************
 *  Purpose: DFinding square root of a non negative number
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class CalculateSquareRoot {
	public static double squareRoot(int number) {
		double root = number;
		double e = 1e-15;
		while(Math.abs(root - number/root)> e * root) {
			root = (root + number/root) / 2;
		}
		return (root);
	}
/* The main function is written to test CalculateSquareRoot class
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a non negative number :");
		int number = sc.nextInt();
		if(number < 0) {
			System.out.println("Please enter a number greater than 0");
		}
		else {		
			System.out.println(squareRoot(number));
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
