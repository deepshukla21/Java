package com.bridgelabz.oops;

public class Table {
   public static void main(String[] args) {
	CardDeck deck = new CardDeck();
	Dealer dealer = new Dealer(4);
	Player[] players = new Player[4];
	for(int i = 0 ; i < players.length ; i++) {
		players[i] = new Player(9);
	}
	deck.display();
//	c.shuffle();
	System.out.println("=================");
//	c.display();
	dealer.shuffle(deck);
	dealer.distribute(players, deck);

	for(int i = 0 ; i < players.length ; i++) {
		System.out.println("Cards with player " + i);
		players[i].display();
	}

}
}
