package com.bridgelabz.oops;

public class StockAccountTest {
	
	public static void main(String[] args) {
		StockAccount myAccount = new StockAccount();
		myAccount.createAccount();
		myAccount.login("Deep");
		//myAccount.load("Deep_portfolio.json");
		myAccount.buy("Intel", 100, 50);
		myAccount.buy("Google", 100, 1200);
		myAccount.buy("Amazon", 100, 1800);
		myAccount.sell("Intel", 100, 70);
		myAccount.buy("Barclays", 100, 200);
		myAccount.sell("TATA", 100, 200);
        myAccount.printReport();
        myAccount.save("portfolio.json");
	}

}
