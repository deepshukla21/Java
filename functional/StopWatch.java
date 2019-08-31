/******************************************************************************
 *  Purpose: Calculating the elapsed time between the start and end of stop watch
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   28-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class StopWatch {
	
  public static void main(String[] args) {
	long start_time = 0;
	Scanner sc = new Scanner(System.in); 
	System.out.println("You want to start the watch now, if yes enter 1 :");
	char c1 = sc.next().charAt(0);
	// Using currentTimeMillis() it returns time in milliseconds , its return type is long
	if(c1 == '1') {
		start_time = System.currentTimeMillis(); 
	}
	System.out.println("If you want to stop watch enter 1");
	c1 = sc.next().charAt(0);
	if(c1 == '1') {
		// Calculating elapsed time
		long elapsedTime = System.currentTimeMillis() - start_time;
		System.out.println("Elapsed time :" + elapsedTime);
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
