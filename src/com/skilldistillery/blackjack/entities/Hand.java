package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	
	protected List <Card> cards = new ArrayList<>();

	public List<Card> getCards() {
		return cards;
	}

	public void setHand(List<Card> hand) {
		this.cards = hand;
	}

	public Hand() {
		
		
	}
	
	public void displayHand() {
		for (Card card : cards) { 
	System.out.println(card);
			
		}
	}
	
	public void addCard(Card card) {
		cards.add(card);
		
	}
	
	public void clear() {
		cards.removeAll(cards);
		
	}
	
	abstract public int getHandValue(); 
	
	
	
}
