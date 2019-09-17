package com.bridgelabz.designpattern;

public class MediatorPatternDemo {
	 public static void main(String[] args) {
	      User deep = new User("Deep");
	      User prachi = new User("Prachi");

	      deep.sendMessage("Hi, Prachi");
	      prachi.sendMessage("Hello Deep, How are you?");
	   }
}
