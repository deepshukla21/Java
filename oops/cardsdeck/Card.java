package com.bridgelabz.oops;

public class Card implements Comparable<Card> {
	private Suit suit;
	private int rank;
	
	Card(Suit suit, int rank){
		this.suit = suit;
		this.rank = rank;
	}
	
	
	public Suit getSuit() {
		return suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "  Card [suit=" + suit + ", rank=" + rank + "]";
	}	
    public int compareTo(Card objCard) {
        if (this.rank == objCard.getRank()) {
        	return this.suit.compareTo(objCard.getSuit());
        } else {
            return objCard.getRank() - this.rank;
        }
    }

}
