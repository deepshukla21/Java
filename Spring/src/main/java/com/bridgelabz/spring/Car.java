package com.bridgelabz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	// for annotation configuration
	@Autowired
	private Tyre tyre;
	
	
    public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


   public void drive() {
	
	  System.out.println("car" + tyre);
	
 }
}
