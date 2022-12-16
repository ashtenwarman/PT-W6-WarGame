package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//creating list of cards
	List<Card> cards = new ArrayList<>();
	
	//for loop to add suit "value" followed by the actual number value
	public Deck() {
		for(int i = 0; i < 4; i++) {
			for (int j = 2; j <= 14; j++) {
				cards.add(new Card(i, j));
			}
		}
	}
	//method to shuffle cards
	public void shuffleCards() {
		Collections.shuffle(cards);
	}
	//method to draw cards from the deck
	public Card draw() {
		Card drawnCard = cards.get(0);
		cards.remove(0);
		return drawnCard;
		}
	
	
	
		
	
}
