package com.skilldistillery.blackjack.entities;

public class Player {
	

	protected Hand hand = new BJHand();

	public Player(Hand hand) {
		super();
		this.hand = hand;
	}

	public Player() {
		super();

	}

	public Hand getPlayerHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void addCard(Card card) {
		hand.addCard(card);

	}

	public void showHand() {
		hand.displayHand();
	}

	public void stay() {
		System.out.println(hand.getHandValue());

	}

}
