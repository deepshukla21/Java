package com.bridgelabz.designpattern;

public class ObserverPatternDemo {
	
   public static void main(String[] args) {
      Subject subject = new Subject();

      // Below 
      HexaObserver hexaObserver = new HexaObserver(subject);
      OctalObserver octalObserver = new OctalObserver(subject);
      BinaryObserver binaryObserver = new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}