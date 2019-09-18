package com.bridgelabz.oops;

import java.util.List;

public class Stock {
	
 private String stockName;
 private double unitPrice;
 private int numberOfStock;
 private double totalPrice;
 
public String getStockName() {
	return stockName;
}

public double getUnitPrice() {
	return unitPrice;
}

public int getNumberOfStock() {
	return numberOfStock;
}

public double getTotalPrice() {
	return totalPrice;
}

public void add(String symbol, int numStocks, double unitPrice) {
	this.stockName = symbol;
	this.numberOfStock = numStocks;
	this.unitPrice = unitPrice;
	this.totalPrice = numStocks * unitPrice;
}

public void buyStock(int newStocks, double unitPrice) {
	this.numberOfStock += newStocks;
	this.unitPrice = (this.unitPrice + unitPrice)/2;
	this.totalPrice = this.numberOfStock * this.unitPrice;
}

public void sellStock(int newStocks) {
	if(numberOfStock < newStocks) {
		System.out.println("Not sufficient stocks to sell");
		return;
	}
	this.numberOfStock -= newStocks;
	this.totalPrice = this.numberOfStock * this.unitPrice;
}


@Override
public String toString() {
	return "Stock [stockName=" + stockName + ", unitPrice=" + unitPrice + ", numberOfStock=" + numberOfStock
			+ ", totalPrice=" + totalPrice + "]";
}



 
}

