/******************************************************************************
 *  Purpose: Printing prime numbers that are anagram  stored in Queue in  the range of 0 - 1000
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    8-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class AnagramUsingQueue {
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
		//Creating a Queue object
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();
		int anagramCount = 0;
		for(int i = 0; i < primeArray.length; i++) {
			for(int j = i + 1; j < primeArray.length; j++) {
				// Checking for anagram
				boolean isAnagram = PrimeAnagram.isAnagram(primeArray[i], primeArray[j]);
				// Adding the elements in Queue
				if(isAnagram) {
					anagramCount++;
					// Method will add element at last
					queue.enqueue(primeArray[i]);
					queue.enqueue(primeArray[j]);
				}
			}
		}
		System.out.println("Below are the Anagrams that are stored in queue");
		queue.display();
		System.out.println("Anagram count" + anagramCount );
	}
}
