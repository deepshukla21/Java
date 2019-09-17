package com.bridgelabz.designpattern;

public class Computer implements ComputerPart {
	
   ComputerPart[] parts;

   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};		
   } 

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
	   // from here accept method will call to different parts of computer
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}
