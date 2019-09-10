/******************************************************************************
 *  Purpose: Find anagram numbers in range of prime numbers from 0 - 1000 and print in two dimensional array
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    8-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class AnagramTwoDimensionalArray {

//Method to search prime number
	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
//Method to find if number is already present in array
	public static boolean find_num(int ar[], int num) {
		
		for (int i = 0; i < ar.length; i++) {
			if(num == ar[i])
				return true;
		}		
		return false;		
	}
	
//Method to store anagram values and non anagram values in 2D array
	public static int [][] anagram() {
		int anagram[][] = new int[2][500];
		
		int is_anagram[] = new int[500];
		int not_anagram[] = new int[500];
		
		  int primeArray[] = new int[1000];
		
		  for(int i = 0; i< 1000; i++) {
			  if(isPrime(i)) {
				  primeArray[i]= i; 
		  }			 
		 } 
		 //Finding and storing anagram values in is_anagram[]
		  int index = 0;
		  for (int i = 0; i < primeArray.length; i++) {
			for (int j = 1; j < primeArray.length; j++) {
				if(primeArray[i] != primeArray[j])
					if(PrimeAnagram.isAnagram(primeArray[i], primeArray[j])) {
						if(find_num(is_anagram, primeArray[i]) == false)
							is_anagram[index++] = primeArray[i];
						if(find_num(is_anagram, primeArray[j]) == false)
							is_anagram[index++] = primeArray[j];
					}				
			}			
		}
		  int newIndex = 0;
		  for (int i = 0; i < primeArray.length; i++) {
			  boolean temp = false;
			  // Finding the values that are present in both prime array and is_anagram[]
				for (int j = 0; j < is_anagram.length; j++) {
					if(is_anagram[j] == primeArray[i])
						temp = true;
				}
				// Storing the values in not_anagram[]
				if(temp == false)
					not_anagram[newIndex++] = primeArray[i];
			}
		// Storing anagram values in row 0 of anagram array  
		for (int i = 0; i < is_anagram.length; i++) {
			if(is_anagram[i] != 0)
				anagram[0][i] = is_anagram[i];			
		}
		// Storing not anagram values in row 1 of anagram array  
		for (int i = 0; i < not_anagram.length; i++) {
			if(not_anagram[i] != 0)
				anagram[1][i] = not_anagram[i];			
		}
		
		return anagram;
}
	public static void main(String[] args) {
		int anagramArray [][] = anagram();
		// Print the anagram array in 2D pattern
		for(int i = 0; i < 2 ; i++) {
			for(int j = 0; j < anagramArray[0].length;j++ ) 
			{
				if(anagramArray[i][j] != 0)
					System.out.print(anagramArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
