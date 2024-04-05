//Eric Sadowski 2338165
import java.util.Scanner;

public class ESP {

	
	static int correct;
	static int incorrect;
	
	// a method to return color names via random numbers from 1-5
	public static String getColor(){
		int colorNum = (int) (Math.random() * 5) + 1;
		if(colorNum == 1) {
			return "red";
		}else if(colorNum == 2) {
			return "green";
		}else if(colorNum == 3) {
			return "blue";
		}else if(colorNum == 4) {
			return "orange";
		}else {
			return "yellow";
		}
		
	}
	
	
	public static void main(String[] args) {
	
		
		
		
		try (Scanner input = new Scanner(System.in)) {
		
		System.out.println("Pick a color");
		System.out.println("Red, Green, Blue, Orange, Yellow");
		
		// a loop that asks the user for a color input 10 times
		
		for(int i = 0; i < 10; i++) {
			
			
			System.out.println("Guess " + (i+1) + "?");
			String ch = input.nextLine();
			String choice = ch.toLowerCase();
			if(choice.equals("red") || choice.equals("green") || choice.equals("blue") || choice.equals("orange") || choice.equals("yellow")) {

			// the cpu generates a color with the get color method and compares it to the user input
			String cpu = getColor();
			
			//adding to total
			if(choice.equals(cpu)) {
				correct++;
			}else {
				incorrect++;
			}

			}else {
				
				// if anything other than the selected colors is input an illegal argument is thrown
				throw new IllegalArgumentException("Invalid input");
				
			}
			
			
			

		}
		//input.close();
		
		//total printed
		System.out.println("You got " + correct + " guesses correct");
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
