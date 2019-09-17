package com.bridgelabz.designpattern;

public class Singleton {
 public static void main(String[] args) {
	Object o1 = LazyInitialization.getInstance();
	System.out.println(o1.toString());
	Object o2 = LazyInitialization.getInstance();
    System.out.println(o2.toString());
}
}
