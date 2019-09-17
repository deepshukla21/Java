package com.bridgelabz.designpattern;

public abstract class Details {
	
	public abstract int getId();
	public abstract String getName();
	
	@Override
	public String toString() {
		return  "id = " + this.getId() + ", name = " + this.getName();
	}

}
