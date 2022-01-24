package com.bridgeLabz.prog4;

public class DeckOfCards {

	public static void main(String[] args) {
		DistributeCards dc = new DistributeCards();

		for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
			dc.distributeCards(playerNumber);
			System.out.println("Player " + playerNumber + "'s cards: ");
			dc.showCards(playerNumber);
		}
	}
}
