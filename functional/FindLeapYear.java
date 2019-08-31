/******************************************************************************
 *  Purpose: Finding the year entered by user is Leap year or not
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class FindLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year you want to check");
		int num = sc.nextInt();
		int i = num;
		int count = 0;
		// Purpose to ensure the year entered by user consist of four digit or not
		while (i != 0) {
			count++;
			i = i / 10;
		}
		// Conditions to check leap year
		if (count == 4) {
           if (num % 400 == 0 && num % 100 == 0) {
			   System.out.println(num + " year is leap year");
           }
		   else if (num % 100 != 0 && num % 4 == 0) {
			    System.out.println(num + " year is  leap year");
		   }
		   else {
			   System.out.println(num + " year is not leap year");
			}
		}
		else {
			System.out.println("Please enter year as a four digit number");
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
