package com.skilldistillery.blackjack.entities;

public class BJHand extends Hand {

	BJHand (){
		
	}
	@Override
	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
			
			
		}
		return value;
		
	}
	
	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		}
		return false;
	}
	
	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			return true;
		}
		return false;
	}
}
