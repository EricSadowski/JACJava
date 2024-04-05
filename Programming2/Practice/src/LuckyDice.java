
public class LuckyDice {

	public static void main(String[] args) {
		
		// Eric Sadowski  2338165	PLAYING DICE IN THE ALLEY SIMULATOR


		int userScore = 0;
		final int MAX_DICE = 6;  //starting point
		
		
		double getDiceroll1 = Math.floor(Math.random() * MAX_DICE) + 1;
		int diceRoll1 = (int) getDiceroll1;								   
		
		//getting and converting a dice roll value from float
		//System.out.println("First round: The dice rolls a " + diceRoll1);
		
		if(diceRoll1 <= 2) {
			userScore++;
		}else if(diceRoll1 >= 5) {
			userScore += 10;
		}								 
		
		//adding points to userScore if diceroll is 1,2,5,6
		//System.out.println("After the first round... Your score is: " + userScore);
		
		
		
		double getDiceroll2 = Math.floor(Math.random() * MAX_DICE) + 1;
		int diceRoll2 = (int) getDiceroll2;
		
		//System.out.println("Second round: The dice rolls a " + diceRoll2);
		
		if(diceRoll2 <= 2) {
			userScore--;
		}else if(diceRoll2 >= 4) {
			userScore += 5;
		}							  
		
		//adding points to userScore if diceroll is 4,5,6 and taking away if 1 or 2
		//System.out.println("After the second round... Your score is: " + userScore);
		
		
		if(userScore > 9) {			
			double getDiceroll3 = Math.floor(Math.random() * MAX_DICE) + 1;
			int diceRoll3 = (int) getDiceroll3;
			
			// deciding if bonus round occurs and executing another diceroll
			//System.out.println("BONUS ROUND: The dice rolls a " + diceRoll3);
			
			
			if(diceRoll3 < 4) {
				System.out.println("You lost! Better luck next time");			
			}
		}else {
			System.out.println("No bonus round for you.");
		}
		
		/* 2 options roll and "lose" or roll and not lose bonus round
		 Not "losing" with a 10 is the least likely senario
		I guess you never win when you play dice in the alley */
		
		
		System.out.println("Thank you for playing. Your final score was " + userScore); //final sum up of score
		
		
		
	}

}
