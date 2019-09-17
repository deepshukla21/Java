package com.bridgelabz.designpattern;

// Mediator class establishing communication between multiple user
public class ChatRoom {
	
	public static void showMessage(User user, String message)
	{
	      System.out.println(user.getName() + " : " + message);
	   }
}
