// Eric Sadowski  2338165
import java.util.Scanner;

public class LunchOrder {

	
	//establishing fields to hold total amounts of any ordered item
	static int hams;
	static int greens;
	static int french;
	static int pop;
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Declaring each Food object and there specifications
		
		Food hamburger = new Food(1.85, 9, 33, 1);
		Food salad = new Food(2.00, 1, 11, 5);
		Food frenchFries = new Food(1.30, 11, 31, 4);
		Food soda = new Food(0.95, 0, 38, 0);
		
		// Letting the user make there order for each item after being told the facts about them
		
		System.out.println("Enter number of hamburgers: ");
		System.out.print("Each Hamburger"); System.out.println(hamburger);
		int i = input.nextInt();
		hams += i;
		System.out.println("Enter number of salads: ");
		System.out.print("Each Salad"); System.out.println(salad);
		int a = input.nextInt();
		greens += a;
		System.out.println("Enter number of fries: ");
		System.out.print("Each Fries"); System.out.println(frenchFries);
		int b = input.nextInt();
		french += b;
		System.out.println("Enter number of sodas: ");
		System.out.print("Each Soda"); System.out.println(soda);
		int c = input.nextInt();
		pop += c;
		
		// calculating the total with stored field values
		double totalHams = hams * hamburger.getPrice();
		double totalSalad = greens * salad.getPrice();
		double totalFries = french * frenchFries.getPrice();
		double totalSoda = pop * soda.getPrice();
		
		double total = totalHams + totalSalad + totalFries + totalSoda;
		
		System.out.println("Your total is $" + String.format("%.2f", total));
		
		input.close();
		

	}

}
