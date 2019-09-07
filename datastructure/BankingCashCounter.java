/******************************************************************************
 *  Purpose: Created BankingCashCounter to help people deposit Cash and withdraw Cash using QueueUsingLinkedList class functionalities
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    07-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class BankingCashCounter{
	 static Scanner sc = new Scanner(System.in);
	 // Method for withdrawing or depositing money in bank
	public static void cashCounter(QueueUsingLinkedList<Integer> queue) {
		int amount = 100000;
		int deposit = 40000;
		System.out.println("Welcome to cash counter, if you want to withdraw money enter 1 , for depositing money enter 2");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Enter the amount you want to withdraw ");
			int withdraw = sc.nextInt();
			if(withdraw <= amount) {
				System.out.println(withdraw + " Rs is withdraw from account");
				amount = amount - withdraw;
				System.out.println(amount + " Rs is left in bank");
			}
			else {
				System.out.println("Sorry can't process the transaction, we can process amount less than " + amount);
			}
			// Once opeartion done remove from queue
			queue.deQueue();
		}
		else if(choice == 2) {
			System.out.println("Enter the amount you want to deposit ");
			int depositMoney = sc.nextInt();
			if(depositMoney <= deposit) {
				System.out.println(depositMoney + " Rs is deposited in account");
				amount = amount + depositMoney;
				System.out.println(amount + " Rs is left in bank");
			}
			else {
				System.out.println("In one day you cannot deposit more than " + deposit + "Rs");
				System.out.println("Do you want to checkin again for some other opeartion if yes enter 1 if no enter 2");
				int repeateOpeartion = sc.nextInt();
				if(repeateOpeartion == 1) {
					cashCounter(queue);
					return;
				}
				else {
					System.out.println("Wish to see you again");
				   }
			   }
			// Once operation done remove from queue
			  queue.deQueue();
		}
		// If choice is invalid again calling the method to serve customer
		else {
			System.out.println("Sorry your choice doesn't match please try again");
			cashCounter(queue);

		}
		// Checking if queue is empty and someone wants to enter in queue
		if(queue.isEmpty()) {
		   entry();
		}
		// Serving the remaining customer present in queue
		else {
			 cashCounter(queue);			
		}
	}
	public static void entry() {
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();
		System.out.println("Do you want to enter in queue enter yes or no ");
		 String entry = sc.next();
		 if(entry.equalsIgnoreCase("yes")) {
		   while(entry.equalsIgnoreCase("yes")) {
	        System.out.println("Please mark entry in queue like 1, 2...");
	        queue.enQueue(sc.nextInt());
	        System.out.println("Do you want to enter one more person yes or no");
	        entry = sc.next();
		   }
		 }
		 else {
			 System.out.println("Thanks for visisting us");
			 return;
		 }
		 cashCounter(queue);
	}
	// Main method to test the  BankingCashCounter class
	public static void main(String[] args) {	
	 System.out.println("Welcome to Cash Counter");
	 entry();
	}
}