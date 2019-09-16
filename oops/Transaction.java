package com.bridgelabz.oops;

import java.util.Date;

public class Transaction {
	private Date date;
	private char txnType;
	private int txnQuantity;
	
	public int getTxnQuantity() {
		return txnQuantity;
	}

	public void setTxnQuantity(int txnQuantity) {
		this.txnQuantity = txnQuantity;
	}

	public Date getDate() {
		return date;
	}
	
	public char getTxnType() {
		return txnType;
	}
	
	public void setTxnType(char txnType) {
		this.txnType = txnType;
	}
	
	

}
