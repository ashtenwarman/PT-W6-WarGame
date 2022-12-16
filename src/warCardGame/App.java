package warCardGame;

public class App {

	public static void main(String[] args) {
		//setting up deck, shuffling, and initializing players
		Deck cards = new Deck();
		cards.shuffleCards();
		Players p1 = new Players("Player 1");
		Players p2 = new Players("Player 2");
		//for loop to add cards to player hand
		for(int i = 0; i < 26; i++) {
			p1.hand.add(cards.draw());
			p2.hand.add(cards.draw());
		}
		//for loop to go through deck for each player
		for (int i = 0; i < 26; i++) {
			Card p1Card = p1.flipCard();
			Card p2Card = p2.flipCard();
			p1.describe();
			p1Card.describeCard();
			p2.describe();
			p2Card.describeCard();
			//comparing the cards to each other
			if(p1Card.getValue() > p2Card.getValue()) {
				p1.incrementScore();
			} else if (p2Card.getValue() > p1Card.getValue()) {
				p2.incrementScore();
			} else if (p1Card.getValue() == p2Card.getValue()){
				System.out.println("Draw");
			}
		}
		//comparing final score and determining the winner
		if (p1.score > p2.score) {
			System.out.println(p1.playerName + " wins the match. " + "Points: " + p1.score + "-" + p2.score);
		} else if (p2.score > p1.score) {
			System.out.println(p2.playerName + " wins the match. " + "Points: " + p2.score + "-" + p1.score);
		} else {
			System.out.println("Draw");
		}
	}

}
