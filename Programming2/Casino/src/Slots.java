import java.util.Scanner;

public class Slots {

	static double spent;
	static double won;
	String img;
	private Scanner scanner;
	
	// a slot object is made holding an image of a random slot decal
	
    public Slots(Scanner input) {
        this.scanner = input;
        this.img = getNewSlotItem();
    }
    
	//6 different items are generated and assigned to object in constructor
	public static String getNewSlotItem(){
		int colorNum = (int) (Math.random() * 6);
		if(colorNum == 0) {
			return "Cherries";
		}else if(colorNum == 1) {
			return "Oranges";
		}else if(colorNum == 2) {
			return "Plums";
		}else if(colorNum == 3) {
			return "Bells";
		}else if(colorNum == 5) {
			return "Melons";
		}
		else {
			return "Bars";
		}
		
	}
	
	public void startGame() {
			
		try {
		int ch2 = 0;
		
		while(ch2 != 2) {
				
		System.out.println("Play the slots? 1 for Yes, 2 for No");
		
		//If 1 is pressed the loop is continued otherwise it is ended
		ch2 = scanner.nextInt();
		if(ch2==2) {
			//the exit info is displayed on 2
			System.out.printf("Total Spent %.2f$%n", spent);
			System.out.printf("Total won %.2f$%n", won);
			System.out.println("Goodbye!");
			continue;
			
		}else if(ch2!=1) {
			// if something other than 1 or 2 is entered exception thrown
			throw new IllegalArgumentException();
		}
		
		System.out.println("How much would you like to bet?");
		
		// user asked for bet. bet added to total
		double bet = scanner.nextDouble();
		spent += bet;
		
		img = getNewSlotItem();
		String img2 = getNewSlotItem();
        String img3 = getNewSlotItem();

        System.out.println("|" + img + "|" + img2 + "|" + img3 + "|");

		// if else statements that compare the images to eachother to see if any match
		// if none match its nada
		if(img.equals(img2) && img2.equals(img3)) {
		System.out.println("Triple!");
		double winnings = bet * 3;
		System.out.printf("You win %.2f$%n", winnings);
		won += winnings;
		}

		else if(img.equals(img2) || img.equals(img3) || img2.equals(img3)) {
			System.out.println("Double");
			double winnings = bet * 2;
			System.out.printf("You win %.2f$%n", winnings);
			won += winnings;
		}else {
			System.out.println("Nada");
			System.out.println("You win $0");
		}
		}		
		}catch(Exception e) {
			System.out.println(e + " Invalid input");
		}
	}
}
