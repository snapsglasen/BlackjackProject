package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cardDeck = new ArrayList<>();

	public Deck() {
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();

		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(suit, rank);
				cardDeck.add(card);

			}

		}
	}
	
	public Card dealCard() {
		Card card = cardDeck.remove(0);
		return card;
	}
	
	public int checkDeckSize() {
		return cardDeck.size();	}

	public void shuffle() {
		Collections.shuffle(cardDeck);
	}

}
