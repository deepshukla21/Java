/******************************************************************************
 *  Purpose: Finding all permutation of a string using recursion and backtracking 
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   28-08-2019
 ******************************************************************************/
package com.bridgelabz.functional;

public class StringPermutation {
   public static void permute(String original, int start, int end) {
	   if(start == end) {
		   System.out.println(original);
	   }
	   else {
		   for(int i = start ; i < original.length(); i++) {
			   original = swap(original,start , i);
			   // Recursively calling itself
			   permute(original, start + 1, end);
			   // For back tracking
			   original = swap(original, start, i);
		   }
	   }
   }
   // Purpose swapping
   public static String swap(String original, int i, int j) {
	  char[] array = original.toCharArray();
	  char temp = array[i];
	  array[i] = array[j];
	  array[j] = temp;
	  return String.valueOf(array);
   }
   /* The main function is written to test Binary class
    */
    public static void main(String[] args) {
	 String original = "ABC";
	 int length = original.length();
	 int end = length - 1;
	 permute(original, 0, end);
 }
}
