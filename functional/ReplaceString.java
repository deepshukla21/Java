/******************************************************************************
 *  Purpose: To replace a part of string with user input
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   29-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class ReplaceString {
		public static void main(String[] args) {
			// Purpose to take user input
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a string");
			String original = "Hello <<username>>, how are you?";
			String replace = "<<username>>";
			String newString = sc.nextLine();
			// replace method from string class
			original = original.replace(replace, newString);
			System.out.println(original);
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

