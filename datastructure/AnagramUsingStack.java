/******************************************************************************
 *  Purpose: Printing prime numbers that are anagram in reverse order that are stored in Stack in  the range of 0 - 1000
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    8-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class AnagramUsingStack {
	public static void main(String[] args) {
		int[] primeArray = new int[168];
		int primeCount = 0;
		// Finding prime number using isPrime() of PrimeAnagram class
		for(int i = 0; i <= 1000; i++) {
			boolean isPrime = PrimeAnagram.isPrime(i);
			if(isPrime) {
				primeArray[primeCount] = i;
				primeCount++;
			}
		}
		// Creating a stack object 
		Stack<Integer> stack = new Stack<Integer>();
		int anagramCount = 0;
		for(int i = 0; i < primeArray.length; i++) {
			for(int j = i + 1; j < primeArray.length; j++) {
				// Checking for anagram
				boolean isAnagram = PrimeAnagram.isAnagram(primeArray[i], primeArray[j]);
				// Pushing the elements in stack
				if(isAnagram) {
					anagramCount++;
					// Method will add element at last
					stack.push(primeArray[i]);
					stack.push(primeArray[j]);
				}
			}
		}
		System.out.println("Printing the anagram stored in stack in reverse order");
		// Reading elements from stack in reverse order
		stack.LL.read();
		System.out.println();
		System.out.println("Anagram count " + anagramCount);
	}

}
