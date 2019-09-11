/******************************************************************************
 *  Purpose: Test for banking cash counter.
 *  @author  Deep Shukla
 *  @version 1.0
 *  @date    07-08-2019
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class BankingCashCounterTest
{
    static BankingCashCounter cashcounter = new BankingCashCounter();
    
    private static void setupBank() {
        //                          Name    Account Number   Initial Amount
        cashcounter.setupNewAccount("Deep",   20191,            50000);
        cashcounter.setupNewAccount("Prachi", 20195,            25000);
        cashcounter.setupNewAccount("Arya",   20193,            15000);
        cashcounter.setupNewAccount("Monu",   20197,            30000);
        //cashcounter.clientList.display();
    }
	public static void main(String[] args) {	
	 
	 System.out.println("Welcome to bank's Cash Counter");
	 setupBank();
	 cashcounter.entry();
	}

}
