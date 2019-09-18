package com.bridgelabz.oops;

import java.util.HashMap;
import java.util.Scanner;

public class StockAccount {
	
	private HashMap<String, StockPortfolio> userList;
	private String currentUser;
	private boolean isLoggedIn;
	
	StockAccount() {
		this.userList = new HashMap<String, StockPortfolio>();
		this.currentUser = "default";
		this.isLoggedIn = false;
	}
	
	public void createAccount() {
		String userName;
		StockPortfolio portfolio = new StockPortfolio(); //Create an empty portfolio
		//System.out.println("Do you wish to create an account? Yes/No");
		//Scanner sc = new Scanner(System.in);
		//Get yes here.
		//If yes,
		//System.out.println("Enter username.");
		//Get username here and store it in userName
		userName = "Deep"; //Temporary
		if(this.userList.containsKey(userName)) {
			System.out.println("This username is already taken.");
			return;
		} else  {
			this.userList.put(userName, portfolio); //Add user and empty portfolio.
			System.out.println("Account created successfully.");
		}	
		
	}
	
	public void login(String userName) {
		this.currentUser = userName;
		this.isLoggedIn = true;
	}
	
	public void logout(String userName) {
		this.isLoggedIn = false;
		System.out.println(userName + " logged out.");
	}

	public void buy(String symbol, int numStocks, double unitPrice) {
		StockPortfolio curPortfolio;
		if(!this.isLoggedIn) {
			System.out.println("You need to login to perform this action.");
			return;
		}
		
		curPortfolio = userList.get(this.currentUser);
		curPortfolio.update(symbol, numStocks, unitPrice, 'B');
	}
	
	public void sell(String symbol, int numStocks, double unitPrice) {
		StockPortfolio curPortfolio;
		if(!this.isLoggedIn) {
			System.out.println("You need to login to perform this action.");
			return;
		}
		
		curPortfolio = userList.get(this.currentUser);
		curPortfolio.update(symbol, numStocks, unitPrice, 'S');			
	}
	
	public double valueOf() {
		StockPortfolio curPortfolio;
		curPortfolio = userList.get(this.currentUser);
		return curPortfolio.getTotalValue();
	}
	
	public void load(String fileName) {
		StockPortfolio curPortfolio;
		curPortfolio = userList.get(this.currentUser);
		
		curPortfolio.loadPortfolio(fileName);	
	}
	
	public void save(String fileName) {
		StockPortfolio curPortfolio;
		curPortfolio = userList.get(this.currentUser);
		
		curPortfolio.storePortfolio(this.currentUser + "_" + fileName);
	}
	
	public void printReport() {
		StockPortfolio curPortfolio;
		curPortfolio = userList.get(this.currentUser);

		System.out.println("Current Holdings:");
		curPortfolio.display();
		System.out.println("Transactions:");
		curPortfolio.displayTransaction();
	}
	
}
