// Eric Sadowski  2338165
import java.util.Scanner;

public class MySavings {

	
	
	public static void main(String[] args) {
		
		//basic instructions and setting the piggy bank object at zero
		PiggyBank pig = new PiggyBank(0, 0, 0, 0, 0);
		Scanner input = new Scanner(System.in);
		System.out.println("1. Show total in bank.");
		System.out.println("2. Add a penny.");
		System.out.println("3. Add a nickel.");
		System.out.println("4. Add a dime.");
		System.out.println("5. Add a quarter.");
		System.out.println("6. Take money out of bank.");
		System.out.println("Enter 0 to quit");
		
		
		
		int ch;
		
		// a do loop that allows you to deposit until 0 is entered in the scanner
		do {
            System.out.println("Enter your choice: ");  
            ch = input.nextInt();
            switch (ch) {
            
            //setting the get of the object and adding to a bank total the value of the coin
            case 1:
            	System.out.printf("%.2f$%n", pig.getTotal());
            	break;
            case 2:
            	pig.setPenny(pig.getPenny()+ 1);
            	pig.setTotal(pig.getTotal() + 0.01);
            	break;
            case 3:
            	pig.setNickel(pig.getNickel()+ 1);
            	pig.setTotal(pig.getTotal() + 0.05);
            	break;
            case 4:
            	pig.setDime(pig.getDime()+ 1);
            	pig.setTotal(pig.getTotal() + 0.10);
            	break;
            case 5:
            	pig.setQuarter(pig.getQuarter()+ 1);
            	pig.setTotal(pig.getTotal() + 0.25);
            	break;
            case 6:
				pig.setPenny(0);
				pig.setNickel(0);
				pig.setDime(0);
				pig.setQuarter(0);
				pig.setTotal(0);
				System.out.println("Savings is now empty!");
				break;
            case 0:
            	System.out.println("Goodbye!");
            	
       		 input.close();
    		 System.out.println("");
    		
            
            
            
            
            
            
            }
			
			
		}while (ch != 0);
		
		
		
	
		
	}

	

}
