package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BJHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Hand;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {
	Dealer dealer = new Dealer();
	Player player = new Player();
	Hand hand;
	Card card = new Card(null, null);
	BJHand bjh;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.launch();
	}

	public void launch() {
		dealer.shuffle();

		dealer.addCard(dealer.deal());
		dealer.addCard(dealer.deal());

		dealer.showHiddenDealerHand();

		System.out.println("Your hand:");
		player.addCard(dealer.deal());
		player.addCard(dealer.deal());

		player.showHand();

		System.out.println("Would you like to hit (press 1) or stay (press 2)?");
		String input = sc.nextLine();
		while (player.getPlayerHand().getHandValue() < 21) {
			if (input.equals("1")) {
				player.addCard(dealer.deal());
				player.showHand();

			} else if (input.equals("2")) {
				player.showHand();
				break;
			}

		}
		while (dealer.getPlayerHand().getHandValue() < 17) {
			dealer.addCard(dealer.deal());
			dealer.showHiddenDealerHand();

		}
		System.out.println("Dealer stays");
		
		// reveal hidden dealer card

		if (player.getPlayerHand().getHandValue() > dealer.getPlayerHand().getHandValue()
				&& player.getPlayerHand().getHandValue() <= 21) {
			System.out.println("You win!");

		} else if (dealer.getPlayerHand().getHandValue() > player.getPlayerHand().getHandValue()
				&& dealer.getPlayerHand().getHandValue() <= 21) {
			System.out.println("Dealer wins!");

		}

	}

}
