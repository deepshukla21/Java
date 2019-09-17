package com.bridgelabz.designpattern;

// Most widely used approach for Singleton
public class BillPughSingleton {
	private BillPughSingleton() {
		
	}
	/* Before java 1.5 memory model had a lot of issues  where 
	 too many threads try to get the instance of the Singleton class simultaneously*/
	private static class MySingleton{
		// Constant
		private static final BillPughSingleton Instance = new BillPughSingleton();
	}
	public static BillPughSingleton getInstance() {
		return MySingleton.Instance;
	}
	

}
