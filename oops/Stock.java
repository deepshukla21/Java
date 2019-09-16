package com.bridgelabz.oops;

import java.util.List;

public class Stock {
	
 private String stockName;
 private double unitPrice;
 private int numberOfStock;
 private double total_price;
 private List<Transaction> txnList;
 
public String getStockName() {
	return stockName;
}
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public int getNumberOfStock() {
	return numberOfStock;
}
public void setNumberOfStock(int numberOfStock) {
	this.numberOfStock = numberOfStock;
}
public double getTotal_price() {
	return total_price;
}
public void setTotal_price(int numberOfStock, double unitPrice ) {
	this.total_price = numberOfStock * unitPrice;
}

public void buyStock(int newStocks) {
	this.numberOfStock += newStocks;
	Transaction txn = new Transaction();
	txn.setTxnQuantity(newStocks);
	txn.setTxnType('B');
	txnList.add(txn);	
}

public void sellStock(int newStocks) {
	if(numberOfStock < newStocks) {
		System.out.println("Not sufficient stocks to sell");
		return;
	}
	this.numberOfStock -= newStocks;
	Transaction txn = new Transaction();
	txn.setTxnQuantity(newStocks);
	txn.setTxnType('S');
	txnList.add(txn);	
}

public List<Transaction> getTransaction(){
	return this.txnList;
}

@Override
public String toString() {
	return "Stock [stockName=" + stockName + ", unitPrice=" + unitPrice + ", numberOfStock=" + numberOfStock
			+ ", total_price=" + total_price + "]";
}



 
}

