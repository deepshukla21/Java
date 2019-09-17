package com.bridgelabz.designpattern;

public class EnumMain {
    public static void main(String[] args) {
		EnumSingleton instanceOne = EnumSingleton.Instance;
		EnumSingleton instanceTwo = EnumSingleton.Instance;
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
