/******************************************************************************
 *  Purpose: Making a temperature to convert temperature from Celcius to Fahrenheit using method present in Utility class
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the temperature you want to convert with convention");
		 String temperature = sc.next();
		 // Calling Utility class method for temperature conversion
		 Utility.convertTemperature(temperature);
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
