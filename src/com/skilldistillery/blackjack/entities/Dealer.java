package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	private Deck deck = new Deck();

	public Card deal() {

		return deck.dealCard();

	}

	public void showHiddenDealerHand() {

		for (int i = 1; i < hand.getCards().size(); i++) {
			System.out.println(hand.getCards().get(i));
		}
	}

	public void showDealerHand() {
		this.showHand();

	}

	public void showFullDealerHand() {
		System.out.println();
	}

	public void shuffle() {
		deck.shuffle();
	}

}
