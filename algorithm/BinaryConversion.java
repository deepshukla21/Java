/****************************************************************************** 
 *  Purpose: Converting decimal number into binary.
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BinaryConversion {
	// Function to convert decimal number into binary
    public static String toBinary(int number) {
	String binary = "";
	while(number != 0) {
	if(number % 2 == 0) {
		binary = "0" + binary;
		
	}
	else {
		binary = "1" + binary;
	}
	number = number / 2;
 }
	return binary;
}
  
/* The main function is written to test BinaryConversion class
 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number you want to convert into binary :");
	int number = sc.nextInt();
	String binary = toBinary(number);
	System.out.println("Binary conversion of "+ number + " is " + binary);
	// Closing resource
	try {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
  }
}
