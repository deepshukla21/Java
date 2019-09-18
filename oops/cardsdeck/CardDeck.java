package com.bridgelabz.oops;

import java.util.Arrays;
import java.util.Random;

public class CardDeck{
	private Card cardArray[] = new Card[52];
	//private Suit suit;
	
    CardDeck() {
    	int index = 0;
    	for(int j = 0 ; j < 13; j++) {
    		for(Suit suit : Suit.values()) {
    		 cardArray[index] = new Card(suit , j+1);
    		 index ++;
    		}
    	}
    }
    
    public Card[] getCards() {
    	return cardArray;
    }
    
    public void display() {
    	System.out.println(Arrays.toString(cardArray));
    }
    
    private void swap(int firstCard, int secondCard) {
        Card temp = cardArray[firstCard];
        cardArray[firstCard] = cardArray[secondCard];
        cardArray[secondCard] = temp;      
    }
    public void shuffle()
    {
      Random random = new Random();
      for(int i = 0 ; i < 10 ; i++) {
      int firstCard = random.nextInt(52);
      int secondCard = random.nextInt(52);
      swap(firstCard, secondCard); 
      }
    }
}
