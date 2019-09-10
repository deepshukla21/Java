package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Hasher {
	private LinkedList<OrderedList> hashChain = new LinkedList<OrderedList>();
    public boolean debug = false;  
    Hasher() {
        //Create a hash of 11 links with each containing a Ordered Linked list.
        for(int i=0;i<11;i++) {
            //Create a new OrderedLinkedList object
            OrderedList<Integer> elementChain = new OrderedList<Integer>(); 
            
            //Add it to the Hash chain.
            //Hash chain is a LinkedList of OrderedLinkedList.
            hashChain.add(elementChain);
        }
    }
    
    //Compute hash
    private int getHash(int number) {
        return number%11;
    }
    
    //Compute method of hasher
    public boolean compute(int number) {
       OrderedList<Integer> curList;
       int slotNum;
       
       //Get the hash of the given number.
       slotNum = getHash(number);
       
       //Get the queue from the hash position.
       curList = hashChain.readAt(slotNum);
       
       //If the queue contains the number then remove it.
       if(curList.contains(number)) {
         curList.remove(number);
        
       //If the queue does not contain the number then add it.
       } else {
         curList.add(number);
       }
       
       return true;
    }
    
    //Display the Hash.
    public void display() { 
        OrderedList<Integer> curList;
        System.out.println("------------------------");
        for(int i=0;i<11;i++) {
          System.out.println("Hash #" + i + " contents");
          curList = hashChain.readAt(i);
          curList.display();
          System.out.println("------------------------");
        }
    }
    
    public void writeToFile(String filePath) {
        OrderedList<Integer> curList;
        try {
        FileWriter fw = new FileWriter(filePath);
        BufferedWriter writer = new BufferedWriter(fw);
        for(int i=0;i<11;i++) {
            curList = hashChain.readAt(i);
            for(int j=0;j<curList.size();j++) {
                writer.write(String.valueOf(curList.readAt(j)));
                writer.newLine();
            }
        }

       writer.close();
       } catch(IOException ex) {
         ex.printStackTrace();
       }
    }
    
    public void loadFile(String filePath) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();
			while (line != null) {
				this.compute(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}