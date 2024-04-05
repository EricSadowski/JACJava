// Eric Sadowski  2338165

import java.util.Scanner;

public class DigitExtractor {

	
	
	
	
	
	public static void main(String[] args) {
		
		//Original Initiation asking user for an input and splitting the first 3 digits into
		// their respective substrings
		// Then assigning them to a num Object

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		String number = input.nextLine();
		String result = number.substring(number.length()-3, number.length());
		String a = result.substring(2);
		String b = result.substring(1, 2);
		String c = result.substring(0, 1);
		Num yoda = new Num(a,b,c);
		
		
String ch;
		
		System.out.println("show (W)hole number.");
		System.out.println("show (O)nes place number");
		System.out.println("show (T)ens place number");
		System.out.println("show (H)undreds place number");
		System.out.println("(Q)uit");
		
		// Instructions are printed and User is put into do loop
		// The user can look at each section of substring by pressing
		// corresponding key using a switch

		do {
            System.out.println("Enter your choice: ");  
            ch = input.nextLine().toUpperCase();
            
            switch (ch) {
            
            case "W":
            	System.out.println(number);
            	break;
            case "O":
            	System.out.println(yoda.getOnes());
            	break;
            case "T":
            	System.out.println(yoda.getTens());
            	break;
            case "H":
            	System.out.println(yoda.getHundreds());
				break;
            case "Q":
            	
            	System.out.println("Goodbye!");
            	
            	input.close();
            
            	input.nextLine();
            
            
            
            }
            
			
		}while (ch != "q");
		
		
		
	

	}

}
