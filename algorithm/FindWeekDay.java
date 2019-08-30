/******************************************************************************
 *  Purpose: Finding on which day the given date will come using Utility class method
 *
 *  @author  Deep
 *  @version 1.0
 *  @date    28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class FindWeekDay {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the year :");
		   int year = sc.nextInt();
		   System.out.println("Enter the month :");
		   int mon = sc.nextInt();
		   System.out.println("Enter the date:");
		   int date = sc.nextInt();
		   // Calling utility class method for finding day
		   Utility.day(year, mon, date);
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
