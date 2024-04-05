// Eric Sadowski  2338165

import java.util.Scanner;

public class DiceRollGame {

	public static void main(String[] args) {

		//Initializing starting value of player and displaying
		DRPlayer user = new DRPlayer(1000);
		Scanner input = new Scanner(System.in);
		System.out.println("You have 1000 points");
		//declaring a choice value for the scanner
		int ch;
		int ch2;
		 do {
			 //asking user for bet allowing the program to exit with a if/continue
		  System.out.println("How many points do you want to risk? (-1 to quit) "); 
		  ch = input.nextInt();
		  if(ch == -1) {
			  continue;
		  }
		  System.out.println("High (1) or Low? (0)");
		  ch2 = input.nextInt();
		  
		  //If high call is made 
		  if(ch2 == 1) {
			  
			  // calling the roll method within the DRPlayer object that sets 2 dice values and gets the total of the 2
			  int roll = user.roll();
			  // if the user was correct they get double taken from them otherwise its lost
			  if(roll > 7) {
				  user.points += (ch * 2);
			  }else {
				  user.points -= ch;
			  }
			  
			  // data of the roll displayed
			  System.out.println("You rolled: " + roll);
			  System.out.println("You now have " + user.points + " points.");  
			  
		  }
		  
		  //If low call is made
		  if(ch2 == 0) {
			  
			  int roll = user.roll();
			  if(roll < 7) {
				  user.points += (ch * 2);
			  }else {
				  user.points -= ch;
			  }
			  System.out.println("You rolled: " + roll);
			  System.out.println("You now have " + user.points + " points.");
			  
			  
		  }
		  
		  }while (ch != -1);
		 
		 System.out.println("Goodbye!");
		 input.close();
		 System.out.println("");
		

	}

}
