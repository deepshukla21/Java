package com.bridgelabz.designpattern;

public interface ComputerPartVisitor {
	// Visit method for different parts of computer
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
