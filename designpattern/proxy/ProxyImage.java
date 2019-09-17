package com.bridgelabz.designpattern;

public class ProxyImage implements Image{

   private RealImage realImage;
   private String fileName;

   ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if(realImage == null){
    	 // Creating object for real image
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}
