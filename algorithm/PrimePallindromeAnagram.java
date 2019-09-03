/******************************************************************************
 *  Purpose: Printing prime between a range of 0 to 1000 that are anagram and pallindrome .
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    03-08-2019
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimePallindromeAnagram {
	// To find prime number within  a given range
	public static boolean isPrime(int number) {
		 boolean isPrime = true;
		 int divisible = 2;
		 if(number < 2) {
			 isPrime = false;
			 return isPrime;
		 }
	     // Check range from 2 to N/2 as anything greater than N/2 will be a multiple of 2. 
		 for(int i = divisible; i <= (number / 2); i++) {
			 if(number % i == 0) {
				 isPrime = false;
				 return isPrime;
			 }
		 }
		 return isPrime;
	}
		// To find pallindrome number(number and it's reverse should be same)
	public static boolean isPallindrome(int number) {
		   boolean isPallindrome = false;
		   int i = number;
		   int j = number;
		   int digitCount = 0;
		   int reverse = 0;
		   // Reverse can be done if number has 2 or more digit
		   while(i != 0) {
			   digitCount ++;
			   i = i / 10;
		   }
		   if(digitCount <= 1) {
			   isPallindrome = false;
			   return isPallindrome;
		   }
		   else {
			   while(j != 0) {
				   reverse = reverse * 10 + (j % 10);
				   j = j / 10;
			}
			if(number == reverse) {
				isPallindrome = true;
				return isPallindrome;
			}	
		   }
		   return isPallindrome;		   
		 }
	// To find anagram in a given list of numbers
	public static void isAnagram(ArrayList<Integer> prime_list) {
		 ArrayList<Object> ana_list = new ArrayList<Object>();
		 // for comparing one element with other elements 
		for(int i = 0 ; i < prime_list.size(); i++) {
			for(int j = i + 1 ; j < prime_list.size(); j++) {
				 Object a1 = prime_list.get(i);
				 Object a2 = prime_list.get(j);
				 // Converting integer type object to string
				 String s1 = a1.toString();
				 String s2 = a2.toString();
				 //Converting string to character array
				 char[] c1 = s1.toCharArray();
				 char[] c2 = s2.toCharArray();
				  if(c1.length == c2.length) {
				// Sort the character array
				  Arrays.sort(c1);
				  Arrays.sort(c2);
				  String s3 = new String(c1);
				  String s4 = new String(c2);
				 // Check if sorted strings are equal or not 
				 if(s3.equals(s4)) {
					 // Before adding , check if number is already present in list 
					 if(!(ana_list.contains(a1)))
					 ana_list.add(a1);			  
		        }
			  }
			}
		}
		System.out.println("Anagram list :" + ana_list);
   }
	/*
	 * main function to test class PrimePallindromeAnagram
	 */
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the start range from where to start search :");
	 int start = sc.nextInt();
	 System.out.println("Enter the end range till where you want to search :");
	 int end = sc.nextInt();
	 
	 ArrayList<Integer> prime_list = new ArrayList<Integer>();
	 ArrayList<Integer> pallin_list = new ArrayList<Integer>();
	 
	 for(int i = start; i <= end ; i++) {
		boolean prime = isPrime(i);
		if(prime){
			prime_list.add(i);
			boolean pallindrome = isPallindrome(i);
			if(pallindrome) {
				pallin_list.add(i);
			}
		}
	 }
	 System.out.println("Prime list :" + prime_list);
	 System.out.println("Pallin list :" + pallin_list);
	 isAnagram(prime_list);
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

