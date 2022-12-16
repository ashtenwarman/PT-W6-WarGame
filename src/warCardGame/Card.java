package warCardGame;

public class Card {
	//initialing face cards to their value, and setting suits to integers
	private int value;
	private int name;
	public static final int Spades = 0;
	public static final int Clubs = 1;
	public static final int Diamonds = 2;
	public static final int Hearts = 3;
	
	public static final int Jack = 11;
	public static final int Queen = 12;
	public static final int King = 13;
	public static final int Ace = 14;
	
	public Card(int name, int value) {
		this.setValue(value);
		this.setName(name);
	}

	//getters and setters
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		if (value < 2 || value > 14) {
			throw new IllegalArgumentException();
	}
		this.value = value;
	}


	public int getName() {
		return name;
	}


	public void setName(int newName) {
		if (newName >= 0 && newName <= 3) {
		this.name = newName;
		} else {
			throw new IllegalArgumentException();
		}
	}	
	//creating the name of each card
	public String toString() {
		String s = "";
		
	if (value == 2) {
			s += "Two of ";
	} else if (value == 3) {
		s += "Three of ";
	} else if (value == 4) {
		s += "Four of ";
	} else if (value == 5) {
		s += "Five of ";
	} else if (value == 6) {
		s += "Six of ";
	} else if (value == 7) {
		s += "Seven of ";
	} else if (value == 8) {
		s += "Eight of ";
	} else if (value == 9) {
		s += "Nine of ";
	} else if (value == 10) {
		s += "Ten of ";
	} else if (value == Jack) {
		s += "Jack of ";
	} else if (value == Queen) {
		s += "Queen of ";
	} else if (value == King) {
		s += "King of ";
	} else if (value == Ace) {
		s += "Ace of ";
	} else {
		s += value;
	}
		
		if (name == Spades) {
			s += "Spades";
		} else if (name == Clubs) {
			s += "Clubs";
		} else if (name == Diamonds) {
			s += "Diamonds";
		} else if (name == Hearts) {
			s += "Hearts";
		} else {
			System.out.println("Not a valid card");
		}
			return s;
	
	}
	//method to print card description
	public void describeCard() {
		System.out.println(this.toString());
		System.out.println();
	}
		
	
}