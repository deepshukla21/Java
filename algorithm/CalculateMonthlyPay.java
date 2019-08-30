/******************************************************************************
 *  Purpose: Calculate the monthly amount you need to pay as compound interest by taking three command
 *           line arguments
 *
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

public class CalculateMonthlyPay {
	// Function to calculate monthly pay
   public static void monthlyPayment(int amount, double rate_percent, int time) {
		double payment = amount * rate_percent / 1 - Math.pow(( 1 + rate_percent), (-time));
		System.out.println("Monthly Payment is:" + Math.round(payment));
	}
   
   /* The main function is written to test CalculateMontlyPay class
    */	
   public static void main(String[] args) {
	// Command line arguments   
	int amount = Integer.parseInt(args[0]);
	double rate = Double.parseDouble(args[1]);
	int year = Integer.parseInt(args[2]);
	// Converting rate into rate percent per annum
	double rate_percent = rate / 12 * 100;
	// Converting year into months 
	int time = 12 * year;
	monthlyPayment(amount, rate_percent, time);
	
 }
}
