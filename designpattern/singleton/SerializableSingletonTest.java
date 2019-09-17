package com.bridgelabz.designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableSingletonTest {
	
	public static void main(String[] args) throws Exception, IOException {
		SerializableSingleton instanceOne = SerializableSingleton.instance;
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializableSingleton instanceTwo = (SerializableSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
	}

}
