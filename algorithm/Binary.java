/******************************************************************************
 *  
 *  Purpose: Converting decimal number into binary and swapped binary nibbles into decimal
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;
import com.bridgelabz.algorithm.BinaryConversion;

public class Binary {
	// function to swap the nibbles after providing proper padding to make it 8 bit
   public static String swapNibbles(String binary) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value for no of bits in which you want your result to come :");
	   int required_bits = sc.nextInt();
		 int padding = required_bits - binary.length();
		 for(int i = 0; i < padding; i++) {
			binary = "0" + binary;
		}
		// Close open resources
		try {
			if(sc != null) {
				sc.close();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	// swapping the nibbles	 
	 binary = binary.substring(binary.length()/2) + binary.substring(0,binary.length() / 2);
	 return binary;
   }
   // Function to convert binary string into decimal
   public static void toDecimal(String binary) {
	   int number = Integer.parseInt(binary);
	   int base = 1;
	   int decimal = 0;
	   while(number != 0) {
		   if(number % 10 != 0) {
			   decimal = decimal + (number % 10) * base;
		   }
		   base = base * 2;
		   number = number / 10;
	   }      
	   System.out.println("Decimal value is " + decimal);
   }
   /* The main function is written to test Binary class
    */
   public static void main(String[] args) {
	// Taking user input   
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the didgit you want to convert:");
	int number = sc.nextInt();
	// Calling toBinary method present in BinaryConversion class to convert decimal to binary
	String binary = BinaryConversion.toBinary(number);
	// Calling swapNibbles method present in class
	String binary1 = swapNibbles(binary);
	// Calling toDecimal method present in class
	toDecimal(binary1);
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
