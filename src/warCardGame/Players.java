package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Players {
	
	List<Card> hand = new ArrayList<>();
	int score;
	String playerName;
	
	//setting initial score to 0 for players
	public Players(String name) {
		score = 0;
		playerName = name;
	}
	//method to display player name and score
	public void describe() {
		System.out.println(playerName + ": " + score + " points");
		for (Card card:hand) {
			card.describeCard();
		}
	}
	//flip card to battle and removing it from the hand
	public Card flipCard() {
		Card drawnCard = hand.get(0);
		hand.remove(drawnCard);
		return drawnCard;
	}
	//drawing a card from deck to hand
	public void draw (Deck cards) {
		Card card = cards.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		score++;
	}
}
