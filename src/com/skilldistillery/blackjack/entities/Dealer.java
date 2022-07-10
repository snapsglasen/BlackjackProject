package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	private Deck deck = new Deck();

	public Card deal() {

		return deck.dealCard();

	}

	public void showHiddenDealerHand() {
		System.out.println(getPlayerHand().getCards().get(0));
		System.out.println("Dealer Card " + getPlayerHand().getCards().size());
	}
	public void showFullDealerHand() {
		System.out.println();
	}
//two methods - show hidden and show full
	public void shuffle() {
		deck.shuffle();
	}

}
