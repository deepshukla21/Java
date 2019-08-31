/******************************************************************************
 *  Purpose: To flip coin n number of times and find out the percentage of heads and tails
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times you want coin to flip");
		int flipCount = sc.nextInt();
		double flipCoin = 0.0;
		int tailCount = 0, headCount = 0;
		for (int i = 1; i <= flipCount ; i++ ) {
	     // Using random function to generate random number		
		 flipCoin = Math.random();
		  if ( flipCoin < 0.5) {
			  tailCount++;
		  }
		  else {
			  headCount++;
			}
		}
		System.out.println(" tails count " + tailCount);
		System.out.println(" heads count " + headCount);
		System.out.println(" Percentage of heads " + (double) tailCount/flipCount* 100);
		System.out.println(" Percentage of heads " + (double) headCount/flipCount* 100);
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
