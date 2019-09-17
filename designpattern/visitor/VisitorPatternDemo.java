package com.bridgelabz.designpattern;

public class VisitorPatternDemo {
	public static void main(String[] args) {

	      ComputerPart computer = new Computer();
	      // Creating object for interface  ComputerPartVisitor
	      ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
	      computer.accept(visitor);
	   }
}
