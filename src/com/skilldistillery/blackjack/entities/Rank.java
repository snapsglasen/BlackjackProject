package com.skilldistillery.blackjack.entities;

public enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ACE(11);
	
	public int getValue() {
		return value;
	}
	private final int value;
	Rank(int i) {
		this.value = i;
	}

}
