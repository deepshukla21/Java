package com.bridgelabz.designpattern;

public class User {
	private String name;
	
	User(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
    
	public void sendMessage(String message) {
		// Whichever user calling sendMessage that user object will be send to showMessage()
		ChatRoom.showMessage(this, message);
		
	}

}
