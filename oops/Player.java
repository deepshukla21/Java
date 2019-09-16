package com.bridgelabz.oops;

import java.util.Arrays;

import com.bridgelabz.datastructure.QueueUsingLinkedList;

public class Player implements Person{
   
	private Card[] cards;
	private QueueUsingLinkedList<Card> cardQueue;

	
	Player(int cardsPerPlayer){
	  cards = new Card[cardsPerPlayer];
	  cardQueue = new QueueUsingLinkedList<Card>();
	}
	public void shuffle(CardDeck deck) {
		deck.shuffle();
	}
	
	public void setCard(int cardIndex,  Card card) {
		this.cards[cardIndex] = card;
	}
	
	public void setCard(Card card) {
		this.cardQueue.enQueue(card);
	}
	
	public void sort() {
		Card[] cardsArray = new Card[cardQueue.size()];
	    for(int i = 0 ; i < cardsArray.length; i++) {
	    	 cardsArray[i] = cardQueue.deQueue();
	     }
	    for(int i = 0 ; i < cardsArray.length ; i++) {
	    	for(int j = 0 ; j < cardsArray.length ; j++) {
	    		if(cardsArray[i].compareTo(cardsArray[j]) > 0){
	    			swap(cardsArray, i , j);
	    		}
	    	}
	    }
	    for(int i = 0 ; i < cardsArray.length; i++) {
	    	 cardQueue.enQueue(cardsArray[i]);
	     }	    
	    
	}
	
	private void swap(Card[] cardsArray,int firstCard, int secondCard) {
        Card temp = cardsArray[firstCard];
        cardsArray[firstCard] = cardsArray[secondCard];
        cardsArray[secondCard] = temp;
    }
	
	public void display(boolean sort){
		if(sort)
			this.sort();
		
		cardQueue.display();;
	}	
    
	public void display(){
		System.out.println("  " + Arrays.toString(cards));
	}
}
