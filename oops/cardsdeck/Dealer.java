package com.bridgelabz.oops;

import com.bridgelabz.datastructure.QueueUsingLinkedList;

public class Dealer implements Person {
	private int numPlayer ;

	Dealer(int numPlayer){
		this.numPlayer = numPlayer;
	}
	public void shuffle(CardDeck deck) {
		deck.shuffle();
	}
	
	public void distribute(Player[] players,CardDeck deck) {
		Card[] cards = deck.getCards();
		int index = 0;
		for(int i = 0 ; i < 36 ; i += 4) {
			players[0].setCard(index, cards[i]);
			players[1].setCard(index , cards[i + 1]);
			players[2].setCard(index , cards[i + 2]);
			players[3].setCard(index , cards[i + 3]);
			index ++;
		}
		
	}
	
	public void distribute(QueueUsingLinkedList<Player> players,CardDeck deck) {
		Card[] cards = deck.getCards();
		Player[] player = new Player[numPlayer];
		for(int i = 0 ; i < player.length ; i++) {
			player[i] = players.readAt(i);
		}
		int index = 0;
		for(int i = 0 ; i < 36 ; i += 4) {
			player[0].setCard(cards[i]);
			player[1].setCard(cards[i + 1]);
			player[2].setCard(cards[i + 2]);
			player[3].setCard(cards[i + 3]);
			index ++;
		}
		
	}

}
