package com.bridgelabz.oops;

import java.util.Date;
import java.text.SimpleDateFormat;  

public class Transaction {
	private Date date;
	private char txnType;
	private int txnQuantity;
	private double unitPrice;
	private String symbol;
	
	
	
	
	public char getTxnType() {
		return this.txnType;
	}
	
	public double getTotalTxnValue () {
		return this.unitPrice * this.txnQuantity;
	}
    
	public void add(String symbol, int txnQuantity, double unitPrice, char txnType) {
		this.symbol = symbol;
		this.txnQuantity = txnQuantity;
		this.unitPrice = unitPrice;
		this.txnType = txnType;
		this.date = new Date();
	}
	

	public String getPrettyTxn( ) {
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		String txn = "";
		
		txn += String.format("%-10s", this.symbol);
		txn += String.format("%-10s", this.txnQuantity);
		txn += String.format("%-10s", this.unitPrice);
		txn += String.format("%-10s", this.txnType);
		txn += String.format("%-10s", formatter.format(this.date));
		
		return txn;
	}

}
