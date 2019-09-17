package com.bridgelabz.designpattern;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;
	private StaticBlockInitialization() {
		
	}
	static {
		try {
			instance = new StaticBlockInitialization();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public static StaticBlockInitialization getInstance() {
		return instance;
	}

}
