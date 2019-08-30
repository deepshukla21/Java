/******************************************************************************
 *  Purpose: Finding fewest notes to be returned for Vending Machine
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
	public static int Note_Count = 0;
    public static void changeReturn(int amount) {
	    if(amount <= 0) {
	    	System.out.println("Sorry your entry is not appropriate, enter value greater than 0");
	    	return;
	    }
	    Scanner sc = new Scanner(System.in);
	    int[] change = {1000, 500, 100, 50, 10, 5, 2,1};
	    ArrayList<Integer> changelist = new ArrayList<Integer>();
	    // Checking for change
	    while(amount > 0) {
	    	int value = 0;
	    	for(int i = 0; i < change.length; i++) {
	    		 value = change[i];
	    		if(amount >= value) {
	    			Note_Count ++;
	    			changelist.add(value);
	    			break;
	    		}
	    	}
	    	amount = amount - value;
	    }
	    System.out.println("Change return will be :" + changelist);
	    System.out.println("Minimum number of notes to be returned are :" + Note_Count);
	   // Close open resources
		try {
			if(sc != null) {
				sc.close();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	    
    }
    /* The main function is written to test VendingMachine class
     */
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the amount you required change of");
	    int amount = sc.nextInt();
	    changeReturn(amount);
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
