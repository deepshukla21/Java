package com.bridgelabz.oops;

import com.bridgelabz.datastructure.QueueUsingLinkedList;

public class MyMain {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		QueueUsingLinkedList<Player> players = new QueueUsingLinkedList<Player>();
		Dealer dealer = new Dealer(4);
		Player player;
		
		for(int i=0;i<4;i++)
			players.enQueue(new Player(9));
		
		dealer.shuffle(deck);
		dealer.distribute(players, deck);
		
		for(int i =0;i<4; i++) {
			player = players.deQueue();
			System.out.println("Before sort");			
			player.display(false);
			System.out.println("Player " + i);
		    player.display(true);
		}
		
		
		
		
		//deck.display();
		//deck.shuffle();
		//System.out.println("================");
		//deck.display();
	}
}
