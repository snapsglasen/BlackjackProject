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
		System.out.println("Dealer shuffles the deck...");
		dealer.shuffle();

		dealer.addCard(dealer.deal());
		dealer.addCard(dealer.deal());
		System.out.println("\nDealer's hand: ");

		System.out.print("One card face down and ");
		dealer.showHiddenDealerHand();

		player.addCard(dealer.deal());
		player.addCard(dealer.deal());

		System.out.println("\nYour hand: ");
		player.showHand();

		while (player.getPlayerHand().getHandValue() < 21 && dealer.getPlayerHand().getHandValue() < 21) {
			System.out.println("\nWould you like to hit (press 1) or stay (press 2)?");
			String input = sc.nextLine();
			if (input.equals("1")) {
				player.addCard(dealer.deal());
				System.out.println("\nYour hand: ");
				player.showHand();

			} else if (input.equals("2")) {
				System.out.println("\nYou stay with: ");
				player.showHand();
				break;
			}

		}

		while (dealer.getPlayerHand().getHandValue() < 17 && player.getPlayerHand().getHandValue() < 21) {
			System.out.println("\nDealer hits...");
			dealer.addCard(dealer.deal());
			dealer.showHiddenDealerHand();

		}
		System.out.println("\nDealer shows full hand: ");
		dealer.showDealerHand();

		if (player.getPlayerHand().getHandValue() > dealer.getPlayerHand().getHandValue()
				&& player.getPlayerHand().getHandValue() < 21) {
			System.out.println("You win at " + player.getPlayerHand().getHandValue() + " !");

		} else if (dealer.getPlayerHand().getHandValue() > player.getPlayerHand().getHandValue()
				&& dealer.getPlayerHand().getHandValue() < 21) {
			System.out.println("Dealer wins with " + dealer.getPlayerHand().getHandValue() + " !");

		} else if (player.getPlayerHand().getHandValue() > 21) {
			System.out.println("You Bust!  \nDealer wins!");

		} else if (dealer.getPlayerHand().getHandValue() > 21) {
			System.out.println("Dealer is Bust! \nYou win!");

		} else if (player.getPlayerHand().getHandValue() == 21 && dealer.getPlayerHand().getHandValue() == 21) {
			System.out.println("Dealer and Player have Blackjack! \nGame is a Draw!");
			
		} else if (player.getPlayerHand().getHandValue() == 21) {
			System.out.println("You got Blackjack! \nYou win!");
			
		} else if (dealer.getPlayerHand().getHandValue() == 21) {
			System.out.println("Dealer has Blackjack! \nDealer wins!");
			
		}

	}

}
