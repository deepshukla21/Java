package com.bridgelabz.datastructure;

import java.util.Scanner;

public class PallindromeChecker {
	public static void pallindromeCheck(String original) {
		QueueUsingLinkedList<Character> queue = new QueueUsingLinkedList<Character>();
		for(int i = 0; i < original.length(); i++) {
			queue.addFront(original.charAt(i));
		}
		for(int i = 0; i < (int)queue.size()/2 ; i ++){
			//char data = queue.deQueue();
			if(queue.deQueue() == (queue.removeLast())) {
				System.out.println("String is pallindrome");
			}
			else {
				System.out.println("String is not pallindrome");
				break;
			}
		}
		return;
	}
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string you want to check");
	String original = sc.next();
	pallindromeCheck(original);
	
}
}
