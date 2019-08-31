package com.bridgelabz.functional;

import java.util.Arrays;
import java.util.Scanner;

public class CouponNumber { 
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter total no of coupons");
     int n=sc.nextInt();
     // Array for collecting distinct coupon
     int[] collectedCoupon= new int[n];
     // Variable count for counting total number of coupon generated
     // uniqueCoupon for maintaining unique coupon generation count  
     int uniqueCoupon=0,count=0;
     while(uniqueCoupon < n){
      int value = (int) (Math.random()*n);
      count++;
      // System.out.println("generated value "+(value+ 1));
      // Here value + 1 for inserting generated value into array from index 0 
      if(collectedCoupon[value]!=value + 1) {
         uniqueCoupon++;
         collectedCoupon[value]=value + 1;
      }    
     }    
     System.out.println("Total no of trials to get "+n+" different coupon number's are "+count);
     System.out.println("Total count of unique Coupons are " + uniqueCoupon );
     System.out.println("Collected unique coupons are :" + Arrays.toString(collectedCoupon));
     try {
 		if(sc != null) {
 			sc.close();
 		}
 	 }catch(Exception ex) {
 		ex.printStackTrace();
 	 }
    } 
 }


