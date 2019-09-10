package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HashingFunction {
    private static int genRandom() {
        int min = 0;
        int max = 100;
        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
     }
     
     private static void genInputFile(String filePath) {
         try {
         FileWriter fw = new FileWriter(filePath);
         BufferedWriter writer = new BufferedWriter(fw);

         for(int j=0;j<10;j++) {
             writer.write(String.valueOf(genRandom()));
             writer.newLine();
         }

         writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
     }
     
		public static void main(String[] args) {
			Hasher hasher = new Hasher();
		    
		    //Set debug to true to print some extra stuffs.
		    hasher.debug = false;
                 hasher.loadFile("input.txt"); 
                 hasher.writeToFile("output.txt");
		    		    
		    hasher.display();
		    //genInputFile("input.txt");
		}

	}
