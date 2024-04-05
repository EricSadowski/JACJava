import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	Slots slotGame = new Slots(scanner);
    	GameOf21 blackjack = new GameOf21(scanner);
    	
        while (true) {
        	System.out.println("Welcome to the Casino! Which game would you like to play?");
            System.out.println("Enter 1 for Slots, 2 for Blackjack, or q to quit:");
            String command = scanner.next();

            if (command.equals("1")) {
            	slotGame.startGame(); // starts the game, assuming Game1 has a constructor that kicks it off
            } else if (command.equals("2")) {
               // new Game2(); // starts the game, assuming Game2 has a constructor that kicks it off
            	blackjack.startGame();
            } else if (command.equals("q")) {
                System.out.println("Thanks for playing!");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
