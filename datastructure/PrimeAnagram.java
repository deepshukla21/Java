package com.bridgelabz.datastructure;

import java.util.Arrays;

public class PrimeAnagram<T>{
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
	public static boolean isAnagram(int a1, int a2) {
		boolean isAnagram = false;
		 String s1 = String.valueOf(a1);
		 String s2 = String.valueOf(a2);
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
			 isAnagram = true;		  
		 }
	  }
		return isAnagram;
  }
}
