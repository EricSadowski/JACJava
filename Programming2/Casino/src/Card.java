   public class Card{
	
	String cardName;
	int value;
	
	// Making a Card class that can make an object storing the name and value of a card dealt
	
	
	public Card(){
		
		// Cards are random when they are dealt and there are 13 kinds
		// each one has a corresponding case
		
		int getRandom = (int) (Math.random() * (13 - 1 + 1) + 1);
		
		switch(getRandom) {
		
		case 1:
			cardName = "Ace";
			value = 1;
		break;
		
		case 2:
			cardName = "2";
			value = 2;
			
		break;
		
		case 3:
			cardName = "3";
			value = 3;
		break;
		
		case 4:
			cardName = "4";
			value = 4;
		break;
		
		case 5:
			cardName = "5";
			value = 5;
		break;
		
		case 6:
			cardName = "6";
			value = 6;
		break;
		
		case 7:
			cardName = "7";
			value = 7;
		break;
		
		case 8:
			cardName = "8";
			value = 8;
		break;
		
		case 9:
			cardName = "9";
			value = 9;
		break;
		
		case 10:
			cardName = "10";
			value = 10;
		break;
		
		case 11:
			cardName = "Jack";
			value = 10;
		break;
		
		case 12:
			cardName = "Queen";
			value = 10;
		break;
		
		case 13:
			cardName = "King";
			value = 10;
		break;
		
		}	
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return cardName;
	}
	
	
}