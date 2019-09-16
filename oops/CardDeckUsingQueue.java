package com.bridgelabz.oops;

import java.util.Arrays;
import java.util.Random;

import com.bridgelabz.datastructure.QueueUsingLinkedList;

public class CardDeckUsingQueue {
	
	private QueueUsingLinkedList<Card> queue  = new QueueUsingLinkedList<Card>();
	
	CardDeckUsingQueue(){
    	for(int j = 1 ; j <= 13; j++) {
    		for(Suit suit : Suit.values()) {
    		 queue.enQueue(new Card(suit , j));
    		}
    	}
    }
	
	public void display() {
	    queue.display();
	}
	
	
	private void swap(Card[] cardsArray,int firstCard, int secondCard) {
        Card temp = cardsArray[firstCard];
        cardsArray[firstCard] = cardsArray[secondCard];
        cardsArray[secondCard] = temp;
    }
	
	public void shuffle()
    {
      Card[] cardsArray = new Card[queue.size()];
      for(int i = 0 ; i < cardsArray.length; i++) {
    	  cardsArray[i] = queue.deQueue();
      }
      Random random = new Random();
      for(int i = 0 ; i < 52 ; i++) {
      	 int firstCard = random.nextInt(52);
      	 int secondCard = random.nextInt(52);
      	 swap(cardsArray,firstCard, secondCard); 
       }
      for(int i = 0 ; i < cardsArray.length ; i++) {
    	  queue.enQueue(cardsArray[i]);
      }
    }
    	
	}


