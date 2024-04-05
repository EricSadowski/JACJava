
import java.util.Scanner;

class Card{
	
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





public class GameOf21 {


	
	public static void main(String[] args) {
		
		int ch2 = 0;
		Scanner input = new Scanner(System.in);
		
		while(ch2 != 2){
		
		//The user makes 2 choices
		// To leave the table or hit, each one has a variable to speak to the scanner
		
		int ch = 2;
		
		// Declaring all of the cards to be played as objects
		
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		Card dcard1 = new Card();
		Card dcard2 = new Card();
		Card dcard3 = new Card();
		
		
		int playerTotal = 0;
		int dealerTotal = 0;
		
		
		System.out.println("Play a Hand? 1 for Yes, 2 for No");
		
		//If 1 is pressed the loop is continued otherwise it is ended
		ch2 = input.nextInt();
		if(ch2==2) {
			System.out.println("Goodbye!");
			continue;
			
		}
		
		
//			if(card1.value == 1 && card2.value == 10) {
//				playerTotal = 21;
//				System.out.println("21! You are very lucky!");
//			}
//			if(card1.value == 10 && card2.value == 1) {
//				playerTotal = 21;
//				System.out.println("21! You are very lucky!");
//			}
//				
			// If they have an ace but the total is low the ace is assumed to be a higher value 
			
			if(card1.value == 1 && playerTotal < 12) {
				card1.setValue(11);
			}
			playerTotal = card1.value + card2.value;
			if(card2.value == 1 && playerTotal < 12) {
				card2.setValue(11);
			}
			//total value is set and displayed
			playerTotal = card1.value + card2.value;
			
			if(playerTotal == 21) {
				System.out.println("21! You are very lucky!");
			}
			
			System.out.println("Your hand : "+ card1 + ", " + card2 + "... Hand total: " + playerTotal);
			System.out.println("Hit (1) or Stay (2)? ");
			
			//a prompt to hit or stay if the user says to hit the command is done, otherwise stay.
			ch = input.nextInt();
			
			if(ch == 1) {
				
				// the hit calculations are the first covered - the soft ace that goes from an 11 in a low hand back to a 1
				
			playerTotal += card3.value;
			
			if(playerTotal > 21 && card1.value == 11) {
				playerTotal -= 10;
			}
			
			if(playerTotal > 21 && card2.value == 11) {
				playerTotal -= 10;
			}
				
			//Player total is displayed and if it is greater than 21 they bust 
			 System.out.println("Your hand : "+ card1 + ", " + card2 + ", " + card3 + "... Hand total: " + playerTotal);
			 

			if(playerTotal > 21) {

					System.out.println("Player Bust!");
					continue;}
			}

			
//			
//			if(dcard1.value == 1 && dcard2.value == 10) {
//				dealerTotal = 21;
//				
//			}
//			if(dcard1.value == 10 && dcard2.value == 1) {
//				dealerTotal = 21;
//				
//			}
				
			if(dcard1.value == 1 && dealerTotal < 12) {
				dcard1.setValue(11);
			}
			dealerTotal = dcard1.value + dcard2.value;
			if(dcard2.value == 1 && dealerTotal < 12) {
				dcard2.setValue(11);
			}
			dealerTotal = dcard1.value + dcard2.value;
					
			System.out.println("My turn! " + dcard1 + ", " + dcard2 + "... Dealer Total: " + dealerTotal);
			if(dealerTotal == 21) {
				System.out.println("Hey I got 21!");
			}
			
			// The dealers program is nearly the same only he decides to hit based on if the player's
			// hand is higher than his
			
			
			else if(dealerTotal <= playerTotal) {
				System.out.println("Looks like I have to hit");
				
				dealerTotal += dcard3.value;
				
				if(dealerTotal > 21 && dcard1.value == 11) {
					dealerTotal -= 10;
				}
				
				if(dealerTotal > 21 && dcard2.value == 11) {
					dealerTotal -= 10;
				}
				
				
				System.out.println("My second hand: " + dcard1 + ", " + dcard2 + ", " + dcard3 + "... Dealer Total: " + dealerTotal);
			}
			
			//end result calculations
			
			
		if(dealerTotal > 21) {

			System.out.println("Dealer Bust");
			System.out.println("You Win !");
			continue;
		}
		if(dealerTotal > playerTotal) {
			System.out.println("Looks like my hand is higher, you lose!");
			continue;
		}
		if(dealerTotal < playerTotal) {
			System.out.println("Looks like your hand is higher, you win!");
			continue;
		}
		if(dealerTotal == playerTotal) {
			System.out.println("Looks like we tied");
		}

			}
		
		input.close();
	
	}
	
		
		
		
		

		

	}


