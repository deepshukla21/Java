/******************************************************************************
 *  Purpose: Calculating the wind chill by taking two command line arguments
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature value");
		double temperature = sc.nextDouble();
		System.out.println("Enter speed of wind");
		double speed = sc.nextDouble();
		double windChill;
		windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(speed, 0.16);
		System.out.println(windChill);
		try {
			if(sc != null) {
				sc.close();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
