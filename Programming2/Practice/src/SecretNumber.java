

public class SecretNumber {

	public static void main(String[] args) {
		// Eric Sadowski 2338165

		String guessInput = args[0];
		
		
		int guess = Integer.parseInt(guessInput); //takes input and converts input from string to int
		
		//System.out.println(guess);
		
		
		// generates a random number between 1-10 ..
		// double getRandom = Math.floor(Math.random() * 10) + 1;    // floor creates chance of zero and never 10 so + 1
		
		// int randomNum = (int) getRandom; // converts double to int
		
		
		double r = Math.random();
		int max = 10;
		int min = 1;
	
		
		int randomNum = (int) (min + (r * (max-min + 1)));  //done as an integer in one line
		
		
		
		// conditional statements
		if(guess < 1 || guess > 10) {  
			System.out.println("That is not a valid input");
		}else if(guess == randomNum) {
			System.out.println("Wow, you got the correct number! That is extremely lucky!");
		}else {
			System.out.println("That was your best guess!?");
			System.out.println("The number was " + randomNum);
		}
		
		}
		
        }


