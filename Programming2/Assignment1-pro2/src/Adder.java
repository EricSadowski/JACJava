// Eric Sadowski  2338165
import java.util.Scanner;

public class Adder {

	int num1;
	int num2;
	int ans;
	int score;
	//setting the fields for the adder game and constructing the object
	
	public Adder(int num1, int num2, int ans, int score) {
		this.num1 = num1;
		this.num2 = num2;
		this.ans = ans;
		this.score = score;
	}

	//this is the method that creates the equation for the round and sets the fields in the adder object
	public void setRound() {
		
		num1 = (int) (Math.random() * 21);
		num2 = (int) (Math.random() * 21);
		ans = num1 + num2;
	}


	public static void main(String[] args) {
		
		//Initializing the game object and scanner
		Scanner input = new Scanner(System.in);
		Adder game = new Adder(0,0,0,0);

		int ch = 0;
		
		System.out.println("Welcome ! Lets do some math. 999 to Quit");
		while (ch != 999) {
			
			//initialzing a choice and at any moment the user can press
			// 999 and the loop is exited
			
			game.setRound();
			System.out.println(game.num1 + " + " + game.num2 + " =");
			ch = input.nextInt();
			if(ch == 999) {
				continue;
			}
			
			//each round is played and if the choice is the same at the answer field
			// points are added to the score field, otherwise another round is played after failure
			
			if(ch == game.ans) {
				System.out.println("That's correct! - Next Round:");
				game.score += 5;
				continue;
			}else if(ch != game.ans) {
				System.out.println("Incorrect - Try Again");
				System.out.println(game.num1 + " + " + game.num2 + " =");
				ch = input.nextInt();
				if(ch == 999) {
					continue;
				}
				if(ch == game.ans) {
					System.out.println("That's correct! - Next Round:");
					game.score += 3;
					continue;
			}else {
				System.out.println("Incorrect - Last Try");
				System.out.println(game.num1 + " + " + game.num2 + " =");
				ch = input.nextInt();
				if(ch == 999) {
					continue;
				}
				if(ch == game.ans) {
					System.out.println("That's correct! - Next Round:");
					game.score += 1;
					continue;
			}else {
				System.out.println("Incorrect - Next Question");
				continue;
			}
				
			}
			
			
		}
		}
		
		//when loop is exited the total score is displayed
		System.out.println("Final score: " + game.score);
		System.out.println("Goodbye!");
		input.close();
		
		
		
	}



}
