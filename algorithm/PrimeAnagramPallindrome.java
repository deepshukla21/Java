package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeAnagramPallindrome {
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		if(number < 2)
		{
		  isPrime = false; 
		}
		else {
		  int divisible = 2;
		  for(int i = divisible; i <= number / 2 ; i++) {
		  if(number % i == 0 && i <= (number/2)) {
			isPrime = false;
			return isPrime;
		   }
	     }
	   }
		return isPrime;
	}
   public static boolean isPallindrome(int number) {
	   boolean isPallindrome = false;
	   int digitCount = 0;
	   int i = number;
	   int j = number;
	   int reverse = 0;
	   while(i != 0) {
		   digitCount ++;
		   i = i / 10;		   
	   }
	   if(digitCount <= 1) {
		   return isPallindrome;
	   }
	   else {
		    while(j != 0) {
			   reverse = reverse * 10 + j % 10;
			   j = j / 10;
		   }
	   }
	   if(reverse == number) {
		   isPallindrome = true;
		   return isPallindrome;
	   }
	   return isPallindrome;
   }
   public static boolean isAnagram(ArrayList prime_list) {
	   boolean isAnagram = false;
	   for(int i = 0; i < prime_list.size(); i++) {
		   for( int j = 1; j < prime_list.size(); j++) {
			    
		   }
	   }
	   return isAnagram;
   }
   
   
   
   
   
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the start range from which you want to start finding :");
	int start = sc.nextInt();
	System.out.println("Enter the end range till which you want find :");
	int end = sc.nextInt();
	ArrayList<Integer> prime_list = new ArrayList<Integer>();
	ArrayList<Integer> pallindrome_list = new ArrayList<Integer>();
	for(int i = start ; i <= end ; i++)
	{
		boolean prime = isPrime(i);
		if(prime) {
			prime_list.add(i);
		}
	}
	System.out.println("Prime list :" + prime_list);
	for(int i : prime_list) {
		boolean pallindrome = isPallindrome(i);
		if(pallindrome) {
			pallindrome_list.add(i);
		}
	}
	System.out.println("Pallindrome list :" + pallindrome_list);
	
}
}
