package com.bridgelabz.designpattern;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {
		
	}
//	public static synchronized ThreadSafeSingleton getInstance() {
//		if(instance == null) {
//			instance = new ThreadSafeSingleton();
//		}
//		return instance;
//	}
	
	/*  Double checked locking using the synchronized block which is used inside the if condition with an additional 
	check to ensure that only one instance of a singleton class is created.*/
	public static ThreadSafeSingleton getInstance() {
		if(instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
			
		}
		return instance;
	}
}
