package com.bridgelabz.designpattern;

//ProxyImage to get object of RealImage class when required.
public class ProxyPatternDemo {
	public static void main(String[] args) {
	      Image image = new ProxyImage("flowers.jpg");

	      //image will be loaded from disk
	      image.display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.display(); 	
	   }

}
