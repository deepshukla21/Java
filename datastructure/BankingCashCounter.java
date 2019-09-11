/******************************************************************************
 *  Purpose: Created BankingCashCounter to help people deposit Cash and withdraw Cash using QueueUsingLinkedList class functionalities
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    07-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class BankingCashCounter{
	 Scanner sc = new Scanner(System.in);
     QueueUsingLinkedList<Client> clientList = new QueueUsingLinkedList<Client>();
     
    private Client getAccount(int AccountNumber) {
        Client client;
        int size;
        size = clientList.size();
        for(int i=0; i<clientList.size(); i++) {
            client = clientList.readAt(i);
            
            if(client != null) {
                if(client.getAccountNumber() == AccountNumber)
                  return client;
            }
       }
        return null;
    } 
     
	// Method for withdrawing or depositing money in bank
	public void cashCounter(QueueUsingLinkedList<Integer> queue) {
	    int AccountNumber;
	    Client curClient = new Client();
		// Amount available in bank
		int amount = 100000;
		// Limit for depositing money
		int deposit = 40000;
		
		AccountNumber = queue.peek();
		curClient = getAccount(AccountNumber);
		
		if(curClient == null){
		   System.out.println("Invalid account number. Moving to next customer.");
		   return;
		
		}
		  
		
		
		System.out.println("Welcome " + curClient.getName() +".");
		System.out.println("if you want to withdraw money enter 1 , for depositing money enter 2");
		int choice = sc.nextInt();
		amount = curClient.getBalance();
		
		if(choice == 1) {
			System.out.println("Enter the amount you want to withdraw ");
			int withdraw = sc.nextInt();
			if(withdraw <= amount) {
				System.out.println(withdraw + " Rs is withdraw from account");
				amount = amount - withdraw;
				curClient.setBalance(amount);
				System.out.println("Balance: Rs." + amount);
			}
			else {
				System.out.println("Sorry can't process the transaction, we can process amount more than " + amount);
			}
			// Once opeartion done remove person from queue
			queue.deQueue();
		}
		else if(choice == 2) {
			System.out.println("Enter the amount you want to deposit ");
			int depositMoney = sc.nextInt();
			if(depositMoney <= deposit) {
				System.out.println(depositMoney + " Rs is deposited in account");
				amount = amount + depositMoney;
				curClient.setBalance(amount);
				System.out.println("Balance: Rs." + amount);
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
			// Once operation done remove person from queue
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
	// Method to help people with entry process of bank
	public void entry() {
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<Integer>();
		int    accountNumber;
		System.out.println("Do you want to enter in queue enter yes or no ");
		 String entry = sc.next();
		 if(entry.equalsIgnoreCase("yes")) {
		   while(entry.equalsIgnoreCase("yes")) {
	        System.out.println("Please enter your account number");
	        accountNumber = sc.nextInt();
	        queue.enQueue(accountNumber);
	        System.out.println("Thank you. Please wait for your turn");
	        System.out.println("Next Please? yes or no");
	        entry = sc.next();
		   }
		 }
		 else {
			 System.out.println("Thanks for visiting us");
			 return;
		 }
		 cashCounter(queue);
	}
	
	public Boolean setupNewAccount (String Name, int AccountNumber, int SeedFund) {
	    try {
	    Client newClient = new Client();
	    newClient.setName(Name);
	    newClient.setAccountNumber(AccountNumber);
	    newClient.setBalance(SeedFund);
	    clientList.enQueue(newClient);
	    System.out.println("Current size: " + clientList.size());
	    return true;
	    } catch (Exception e){
	        return false;
	    }
	}
	// Main method to test the  BankingCashCounter class
}
