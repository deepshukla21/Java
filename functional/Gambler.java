/******************************************************************************
 *  Purpose: Keeping track of the number of times a gambler loose or win for number of times he/she bets 
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to bet");
		int stack = sc.nextInt();
		System.out.println("Enter the amount you want to reach");
		int goal= sc.nextInt();
		System.out.println("Enter the number of time you want to bet");
		int trial= sc.nextInt();
		int win = 0;
		int loss = 0;
		int cash = stack;
		// Purpose to find the win and loss count
		for (int i = 1; i <= trial; i++ ) {
			while (cash > 0 && cash < goal) {
				if (Math.random() < 0.5) {
					cash ++;
				}
				else {
					cash--;
				}
			}
			if ( cash == goal) {
				win++;
			}
			// initialize cash at every iteration 
			cash = stack;  
		}
	   loss = trial - win;
	   System.out.println("win count " + win);
	   System.out.println("loss count " + loss);
	   System.out.println("win percentage " + (double)win/trial * 100);
	   System.out.println("loss percentage " + (double)loss/trial * 100);
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
