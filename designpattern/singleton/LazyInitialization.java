package com.bridgelabz.designpattern;

public class LazyInitialization {
	private static LazyInitialization instance;
	private LazyInitialization() {
		
	}
   private LazyInitialization(int i) {
		
	}
	public static LazyInitialization getInstance() {
		if(instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}

}
